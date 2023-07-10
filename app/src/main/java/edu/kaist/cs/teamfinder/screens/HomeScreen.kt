package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.Globals
import edu.kaist.cs.teamfinder.LeafScreen
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack

@Composable
fun HomeScreen() {
    println(Globals.globalUser)
    val navController = rememberNavController()
    Column {
        Box(modifier = Modifier) {
            Image(
                imageVector = NavBarIconPack.Home,
                contentDescription = "home",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
            )
        }
        Button(
            onClick = {
                navController.navigate(LeafScreen.Profile.route)
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Profile")
        }
    }

}

@Composable
fun HomeNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "profile"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("profile") {
            ProfileScreen(
                onNavigateToFriends = { navController.navigate("friendsList") },
                /*...*/
            )
        }
        composable("friendslist") { FriendsListScreen(/*...*/) }
    }
}

@Composable
fun FriendsListScreen() {
    Text(text = "friendList")
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}