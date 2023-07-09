package edu.kaist.cs.teamfinder.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import edu.kaist.cs.teamfinder.MessagesActivity
import edu.kaist.cs.teamfinder.R
import io.getstream.chat.android.compose.ui.channels.ChannelsScreen
import io.getstream.chat.android.compose.ui.theme.ChatTheme

@Composable
fun Chat() {
    val context = LocalContext.current

    ChatTheme {
        ChannelsScreen(
            title = stringResource(id = R.string.app_name),
            isShowingSearch = true,
            onItemClick = { channel ->
                context.startActivity(MessagesActivity.getIntent(context, channel.cid))
            },
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