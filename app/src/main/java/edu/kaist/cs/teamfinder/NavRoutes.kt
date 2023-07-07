package edu.kaist.cs.teamfinder

sealed class NavRoutes(val route: String) {
    object Home: NavRoutes("home")
    object Posting: NavRoutes("posting")
    object Add: NavRoutes("add")
    object Chat: NavRoutes("chat")
    object Star: NavRoutes("star")
}
