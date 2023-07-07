package edu.kaist.cs.teamfinder.navbariconpack

import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

object NavBarIconPack

private var __NavBarIcons: ____KtList<ImageVector>? = null

val NavBarIconPack.NavBarIcons: ____KtList<ImageVector>
  get() {
    if (__NavBarIcons != null) {
      return __NavBarIcons!!
    }
    __NavBarIcons = listOf(Home, Connection, Add, Chat, Save)
    return __NavBarIcons!!
  }
