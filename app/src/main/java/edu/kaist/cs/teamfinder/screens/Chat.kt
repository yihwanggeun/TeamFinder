package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.kaist.cs.teamfinder.navbariconpack.Chat
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack

@Composable
fun Chat() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            imageVector = NavBarIconPack.Chat,
            contentDescription = "Chat",
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Chat() {
//    val navController = rememberNavController()
//    val context = LocalContext.current
//
//    Scaffold(
//        bottomBar = { BottomNavigationBar(navController = navController) },
//        content = { paddingValues: PaddingValues ->
//            Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
//                ChatTheme {
//                    ChannelsScreen(
//                        title = stringResource(id = R.string.app_name),
//                        isShowingSearch = true,
//                        onItemClick = { channel ->
//                            context.startActivity(MessagesActivity.getIntent(context, channel.cid))
//                        },
//                        onBackPressed = { finish() }
//                    )
//                }
//            }
//        }
//    )
//}