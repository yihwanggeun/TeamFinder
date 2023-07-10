package edu.kaist.cs.teamfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.NavRoutes
import edu.kaist.cs.teamfinder.screens.AddScreen
import edu.kaist.cs.teamfinder.screens.ChatScreen
import edu.kaist.cs.teamfinder.screens.HomeScreen
import edu.kaist.cs.teamfinder.screens.ProjectScreen
import edu.kaist.cs.teamfinder.screens.SavedScreen

class MainActivity : ComponentActivity() {
    private val remoteDataSource = UserRemoteDataSource(RetrofitInstance.loginService)
    private val userRepository = UserRepository(remoteDataSource) // UserRepository 인스턴스 생성
    private val viewModelFactory =
        LoginViewModelFactory(userRepository) // LoginViewModelFactory 인스턴스 생성
    private val userViewModel: UserViewModel by viewModels { viewModelFactory } // LoginViewModel 인스턴스 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // 앱의 상태를 관리하는 State 변수를 정의합니다.
            val appState = remember { mutableStateOf(AppState.WELCOME) }

            when (appState.value) {
                AppState.WELCOME -> WelcomeScreen(onContinueClick = {
                    // "계속하기" 버튼 클릭 시, appState를 변경하여 LoginScreen으로 이동합니다.
                    appState.value = AppState.LOGIN
                })

                AppState.LOGIN -> LoginRoute(onLoginSuccess = {
                    // 로그인 성공 시, appState를 변경하여 MainScreen으로 이동합니다.
                    appState.value = AppState.MAIN
                })

                AppState.MAIN -> MainScreen(username = "사용자 이름")
            }
        }
    }
}

// 앱의 상태를 나타내는 enum 클래스를 정의합니다.
enum class AppState {
    WELCOME, LOGIN, MAIN
}

@Composable
fun MainNavigation(
    navController: NavHostController
) {
    val auth = false
    val initialRoute =
        if (auth) {
            RootScreen.Home.route
        } else {
            RootScreen.Login.route
        }

    NavHost(
        navController = navController,
        startDestination = initialRoute
    ) {

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(username: String) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(username)
            }
            )
        },
        content = { paddingValues: PaddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
//                TeamFinderNavHost(navController = navController)
                MainNavHost(navController = navController)
            }
        },
        bottomBar = { BottomNavigationBar(navController = navController) },
    )
}

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavRoutes.Home.route) { HomeScreen() }
        composable(NavRoutes.Project.route) { ProjectScreen() }
        composable(NavRoutes.Add.route) { AddScreen() }
        composable(NavRoutes.Chat.route) { ChatScreen() }
        composable(NavRoutes.Saved.route) { SavedScreen() }
    }
}


@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
//    https://developer.android.com/jetpack/compose/navigation?hl=ko#bottom-nav
    NavigationBar(containerColor = Color(0xFFFFFFFF),modifier = Modifier.height(72.dp)) {
        NavBarItems.NavBarItems.forEachIndexed { _, item ->
            NavigationBarItem(
                icon = {
                    Image(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.name,
                        modifier = Modifier.size(24.dp), // adjust the size here
                        contentScale = ContentScale.Fit,

                        )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Green,
                    indicatorColor = Color.White
                ),
                label = { Text(text = item.name) },
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}

