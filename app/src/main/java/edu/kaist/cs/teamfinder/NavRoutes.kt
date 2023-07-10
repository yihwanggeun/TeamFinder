package edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Project : NavRoutes("project")
    object Add : NavRoutes("add")
    object Chat : NavRoutes("chat")
    object Saved : NavRoutes("saved")
}