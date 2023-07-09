package edu.kaist.cs.teamfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.screens.Add
import edu.kaist.cs.teamfinder.screens.Chat
import edu.kaist.cs.teamfinder.screens.Home
import edu.kaist.cs.teamfinder.screens.Posting
import edu.kaist.cs.teamfinder.screens.Star
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Hello World
        setContent {
            TeamFinderTheme(dynamicColor = false) {
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

    var selectedItem by remember { mutableIntStateOf(value = 0) }

    NavigationBar {
        NavBarItems.NavBarItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Image(imageVector = item.icon, contentDescription = item.name) },
                label = { Text(text = item.name ) },
                selected = selectedItem == index,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        selectedItem = index
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
