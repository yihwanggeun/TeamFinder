package edu.kaist.cs.teamfinder

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Star

object NavBarItems {

    val NavBarItems = listOf(
        NavBarItem(
            name = "Home",
            route = "home",
            icon = Icons.Rounded.Home,
        ),
        NavBarItem(
            name = "Posting",
            route = "posting",
            icon = Icons.Rounded.MailOutline,
        ),
        NavBarItem(
            name = "Add",
            route = "add",
            icon = Icons.Rounded.Add,
        ),
        NavBarItem(
            name = "Chat",
            route = "chat",
            icon = Icons.Rounded.Send,
        ),
        NavBarItem(
            name = "Star",
            route = "star",
            icon = Icons.Rounded.Star,
        ),
    )
}