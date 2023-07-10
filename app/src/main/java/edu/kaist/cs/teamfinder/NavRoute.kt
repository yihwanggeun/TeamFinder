package edu.kaist.cs.teamfinder

sealed class RootScreen(val route: String) {
    object Home : RootScreen("home_root")
    object Project : RootScreen("project_root")
    object Add : RootScreen("add_root")
    object Chat : RootScreen("chat_root")
    object Saved : RootScreen("saved_root")
    object Login : RootScreen("login_root")
}

sealed class LeafScreen(val route: String) {
    object Home : LeafScreen("home")
    object Project : LeafScreen("project")
    object Add : LeafScreen("add")
    object Chat : LeafScreen("chat")

    object Channel : LeafScreen("channel")
    object Saved : LeafScreen("saved")
    object Login : LeafScreen("login")
}