package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.kaist.cs.teamfinder.navbariconpack.Connection
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack

@Composable
fun Posting() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            imageVector = NavBarIconPack.Connection,
            contentDescription = "home",
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}