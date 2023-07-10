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
            icon = R.drawable.home,
        ),
        NavBarItem(
            name = "Project",
            route = "project",
            icon = R.drawable.connection,
        ),
        NavBarItem(
            name = "Add",
            route = "add",
            icon = R.drawable.add,
        ),
        NavBarItem(
            name = "Chat",
            route = "chat",
            icon = R.drawable.chat,
        ),
        NavBarItem(
            name = "Saved",
            route = "saved",
            icon = R.drawable.save,
        ),
    )
}