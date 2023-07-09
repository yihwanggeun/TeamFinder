package edu.kaist.cs.teamfinder

sealed class Screen(val route : String) {
    object LoginActivity : Screen(route = "Login")
    object MainActivity  : Screen(route = "Main")
}