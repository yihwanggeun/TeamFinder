package edu.kaist.cs.teamfinder

import Posting
import edu.kaist.cs.teamfinder.screens.Star
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.screens.Add
import edu.kaist.cs.teamfinder.screens.Chat
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Hello World
        setContent {
            TeamFinderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
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
                NavigationHost(navController = navController)

            }
        },
        bottomBar = { BottomNavigationBar(navController = navController) },
    )
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val selectedItem by remember { mutableStateOf(0) }

    NavigationBar {
        NavBarItems.NavBarItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.name) },
                label = { Text(text = item.name ) },
                selected = selectedItem == index,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }

}

@Composable
fun NavigationHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route,
//        builder =
    ) {
        composable(NavRoutes.Home.route) {
            Home()
        }

        composable(NavRoutes.Posting.route) {
            Posting()
        }

        composable(NavRoutes.Add.route) {
            Add()
        }

        composable(NavRoutes.Chat.route) {
            Chat()
        }

        composable(NavRoutes.Star.route) {
            Star()
        }


    }

}
