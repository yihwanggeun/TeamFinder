package edu.kaist.cs.teamfinder

import androidx.compose.ui.graphics.vector.ImageVector
import edu.kaist.cs.teamfinder.navbariconpack.Add
import edu.kaist.cs.teamfinder.navbariconpack.Chat
import edu.kaist.cs.teamfinder.navbariconpack.Connection
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.Save
import kotlin.collections.List as ____KtList

object NavBarIconPack

private var __NavBarIcons: ____KtList<ImageVector>? = null

val NavBarIconPack.NavBarIcons: ____KtList<ImageVector>
  get() {
    if (__NavBarIcons != null) {
      return __NavBarIcons!!
    }
    __NavBarIcons= listOf(Home, Connection, Add, Chat, Save)
    return __NavBarIcons!!
  }
