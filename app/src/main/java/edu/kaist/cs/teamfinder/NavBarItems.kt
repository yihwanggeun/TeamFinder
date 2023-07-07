package edu.kaist.cs.teamfinder

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import edu.kaist.cs.teamfinder.navbariconpack.Add
import edu.kaist.cs.teamfinder.navbariconpack.Chat
import edu.kaist.cs.teamfinder.navbariconpack.Connection
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.Save

object NavBarItems {

    val NavBarItems = listOf(
        NavBarItem(
            name = "Home",
            route = "home",
            icon = NavBarIconPack.Home
        ),
        NavBarItem(
            name = "Posting",
            route = "posting",
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
            name = "Star",
            route = "star",
            icon = NavBarIconPack.Save,
        ),
    )
}

@Composable
fun xmlToImageVector(id: Int): ImageVector {
    return ImageVector.vectorResource(id)
}