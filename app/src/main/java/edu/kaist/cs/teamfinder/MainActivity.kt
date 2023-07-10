package edu.kaist.cs.teamfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.TeamFinderNavHost
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme

class MainActivity : ComponentActivity() {
    private val remoteDataSource = UserRemoteDataSource(RetrofitInstance.loginService)
    private val userRepository = UserRepository(remoteDataSource) // UserRepository 인스턴스 생성
    private val viewModelFactory =
        LoginViewModelFactory(userRepository) // LoginViewModelFactory 인스턴스 생성
    private val loginViewModel: LoginViewModel by viewModels { viewModelFactory } // LoginViewModel 인스턴스 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TeamFinderTheme(dynamicColor = false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
//                    LoginScreen(loginViewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold (
        topBar = { TopAppBar(title = {
                    Text("Navigation Bar Demo")
                }
            )
        },
        content = { paddingValues: PaddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                TeamFinderNavHost(navController = navController)

            }
        },
        bottomBar = { BottomNavigationBar(navController = navController) },
    )
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
//    https://developer.android.com/jetpack/compose/navigation?hl=ko#bottom-nav
    NavigationBar {
        NavBarItems.NavBarItems.forEachIndexed { _, item ->
            NavigationBarItem(
                icon = { Image(imageVector = item.icon, contentDescription = item.name) },
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

