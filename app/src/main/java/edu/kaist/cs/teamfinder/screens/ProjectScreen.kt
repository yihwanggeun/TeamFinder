package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.kaist.cs.teamfinder.Feed
import edu.kaist.cs.teamfinder.R
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme

@Composable
fun ProjectScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).height(5000.dp)) {
            val feedList: ArrayList<Feed> = arrayListOf(
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                ),
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                ),
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                ),
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                ),
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                ),
                Feed(
                    "Michael Jackson",
                    R.drawable.sample,
                    "What are the characteristics of a fake job call form?",
                    "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you",
                    "1hour ago",
                    14,
                    30
                )
            )

            FeedScreen(feedList)
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(size = 16.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFD6CDFE)),
                modifier = Modifier
                    .width(266.dp)
                    .height(50.dp)
                    .shadow(
                        elevation = 62.dp,
                        spotColor = Color(0x2E99ABC6),
                        ambientColor = Color(0x2E99ABC6)
                    )


            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        fontSize = 14.sp,
                        text = "POSTING",
                        color = Color(0xFF130160),
                        letterSpacing = 0.84.sp,
                    )

                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun ProjectScreenView() {
    TeamFinderTheme {
        ProjectScreen()
    }
}