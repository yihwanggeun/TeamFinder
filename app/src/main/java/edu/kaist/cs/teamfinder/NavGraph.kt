package edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import edu.kaist.cs.teamfinder.LeafScreen
import edu.kaist.cs.teamfinder.RootScreen
import edu.kaist.cs.teamfinder.screens.Add
import edu.kaist.cs.teamfinder.screens.Chat
import edu.kaist.cs.teamfinder.screens.Home
import edu.kaist.cs.teamfinder.screens.Project
import edu.kaist.cs.teamfinder.screens.Saved

@Composable
fun TeamFinderNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = RootScreen.Home.route,
        modifier = modifier
    ) {
        HomeGraph(navController)
        ProjectGraph(navController)
        AddGraph(navController)
        ChatGraph(navController)
        SavedGraph(navController)
//        Composable(route = NavRoutes.Chat.route) {
//            Chat(
//                onChannelClick =  { channel ->
//                    navController.navigateSingleTopToChannel(channel)
//                }
//            )
//        }
// TODO: https://developer.android.com/codelabs/jetpack-compose-navigation?hl=ko#8
//        https://developer.android.com/guide/navigation/navigation-type-safety?hl=ko
//        loginGraph(navController = navController)
    }

}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }

private fun NavHostController.navigateSingleTopToChannel(channelId: String) {
    this.navigateSingleTopTo("${RootScreen.Chat.route}/$channelId")
}

private fun NavGraphBuilder.HomeGraph(navController: NavController) {
    navigation(
        route = RootScreen.Home.route,
        startDestination = LeafScreen.Home.route
    ) {
        showHome(navController)
    }
}

private fun NavGraphBuilder.showHome(navController: NavController) {
    composable(route = LeafScreen.Home.route) {
        Home()
    }
}

private fun NavGraphBuilder.ProjectGraph(navController: NavController) {
    navigation(
        route = RootScreen.Project.route,
        startDestination = LeafScreen.Project.route
    ) {
        showProject(navController)
    }
}

private fun NavGraphBuilder.showProject(navController: NavController) {
    composable(route = LeafScreen.Project.route) {
        Project()
    }
}

private fun NavGraphBuilder.AddGraph(navController: NavController) {
    navigation(
        route = RootScreen.Project.route,
        startDestination = LeafScreen.Project.route
    ) {
        showAdd(navController)
    }
}

private fun NavGraphBuilder.showAdd(navController: NavController) {
    composable(route = LeafScreen.Add.route) {
        Add()
    }
}

private fun NavGraphBuilder.ChatGraph(navController: NavController) {
    navigation(
        route = RootScreen.Chat.route,
        startDestination = LeafScreen.Chat.route
    ) {
        showChat(navController)
    }
}

private fun NavGraphBuilder.showChat(navController: NavController) {
    composable(route = LeafScreen.Chat.route) {
        Chat()
    }
}

private fun NavGraphBuilder.SavedGraph(navController: NavController) {
    navigation(
        route = RootScreen.Saved.route,
        startDestination = LeafScreen.Saved.route
    ) {
        showSaved(navController)
    }
}

private fun NavGraphBuilder.showSaved(navController: NavController) {
    composable(route = LeafScreen.Saved.route) {
        Saved()
    }
}

private fun NavGraphBuilder.LoginGraph(navController: NavController) {
    navigation(
        route = RootScreen.Project.route,
        startDestination = LeafScreen.Project.route
    ) {
        showProject(navController)
    }
}


//private fun NavGraphBuilder.bottomNavBar(navController: NavController) {
//    composable(RootScreen.Home.route) {
//        Home()
//    }
//
//    composable(RootScreen.Posting.route) {
//        Posting()
//    }
//
//    composable(RootScreen.Add.route) {
//        Add()
//    }
//
//    composable(RootScreen.Chat.route) {
//        Chat()
//    }
//
//    composable(RootScreen.Star.route) {
//        Star()
//    }
//}