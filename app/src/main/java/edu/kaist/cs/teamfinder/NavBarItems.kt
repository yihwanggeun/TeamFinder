package edu.kaist.cs.teamfinder

import edu.kaist.cs.teamfinder.navbariconpack.Add
import edu.kaist.cs.teamfinder.navbariconpack.Chat
import edu.kaist.cs.teamfinder.navbariconpack.Connection
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack
import edu.kaist.cs.teamfinder.navbariconpack.Save

object NavBarItems {

    val NavBarItems = listOf(
        NavBarItem(
            name = "Home",
            route = "home",
            icon = NavBarIconPack.Home
        ),
        NavBarItem(
            name = "Project",
            route = "project",
            icon = NavBarIconPack.Connection,
        ),
        NavBarItem(
            name = "Add",
            route = "add",
            icon = NavBarIconPack.Add,
        ),
        NavBarItem(
            name = "Chat",
            route = "chat",
            icon = NavBarIconPack.Chat,
        ),
        NavBarItem(
            name = "Saved",
            route = "saved",
            icon = NavBarIconPack.Save,
        ),
    )
}