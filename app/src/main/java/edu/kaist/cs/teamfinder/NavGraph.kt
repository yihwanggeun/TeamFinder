package edu.kaist.cs.teamfinder

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import edu.kaist.cs.teamfinder.screens.AddScreen
import edu.kaist.cs.teamfinder.screens.ChatScreen
import edu.kaist.cs.teamfinder.screens.HomeScreen
import edu.kaist.cs.teamfinder.screens.ProfileScreen
import edu.kaist.cs.teamfinder.screens.SavedScreen

@Composable
fun SetupNavGraphBottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = RootScreen.Home.route,
        modifier = modifier
    ) {
        addHomeGraph(navController)
        addProjectGraph(navController)
        addAddGraph(navController)
        addChatGraph(navController)
        addSavedGraph(navController)
//        Composable(route = NavRoutes.Chat.route) {
//            Chat(
//                onChannelClick =  { channel ->
//                    navController.navigateSingleTopToChannel(channel)
//                }
//            )
//        }
//        composable(
//            "profile?userId={userId}",
//            arguments = listOf(navArgument("userId") { defaultValue = "user1234" })
//        ) { backStackEntry ->
//            Profile(navController, backStackEntry.arguments?.getString("userId"))
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

fun NavGraphBuilder.addHomeGraph(navController: NavController) {
    navigation(
        route = RootScreen.Home.route,
        startDestination = LeafScreen.Home.route
    ) {
        showHome(navController)
        composable(route = LeafScreen.Profile.route) {
            ProfileScreen(
                onNavigateToFriends = { navController.navigate("") }
            )
        }
    }
}

fun NavGraphBuilder.showHome(navController: NavController) {
    composable(route = LeafScreen.Home.route) {
        HomeScreen()
    }
}

fun NavGraphBuilder.showProfile(navController: NavController) {
    composable(route = LeafScreen.Profile.route) {
        ProfileScreen(
            onNavigateToFriends = { navController.navigate(LeafScreen.Home.route) }
        )
    }
}

fun NavGraphBuilder.addProjectGraph(navController: NavController) {
    navigation(
        route = RootScreen.Project.route,
        startDestination = LeafScreen.Project.route
    ) {
        showProject(navController)
    }
}

fun NavGraphBuilder.showProject(navController: NavController) {
    composable(route = LeafScreen.Project.route) {
//        ProjectScreen()
    }
}

private fun NavGraphBuilder.addAddGraph(navController: NavController) {
    navigation(
        route = RootScreen.Project.route,
        startDestination = LeafScreen.Project.route
    ) {
        showAdd(navController)
    }
}

private fun NavGraphBuilder.showAdd(navController: NavController) {
    composable(route = LeafScreen.Add.route) {
        AddScreen()
    }
}

fun NavGraphBuilder.addChatGraph(navController: NavController) {
    navigation(
        route = RootScreen.Chat.route,
        startDestination = LeafScreen.Chat.route
    ) {
        showChat(navController)
    }
}

fun NavGraphBuilder.showChat(navController: NavController) {
    composable(route = LeafScreen.Chat.route) {
        ChatScreen()
    }
}

fun NavGraphBuilder.addSavedGraph(navController: NavController) {
    navigation(
        route = RootScreen.Saved.route,
        startDestination = LeafScreen.Saved.route
    ) {
        showSaved(navController)
    }
}

fun NavGraphBuilder.showSaved(navController: NavController) {
    composable(route = LeafScreen.Saved.route) {
        SavedScreen()
    }
}

fun NavGraphBuilder.addLoginGraph(navController: NavController) {
    navigation(
        route = RootScreen.Login.route,
        startDestination = LeafScreen.Welcome.route
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