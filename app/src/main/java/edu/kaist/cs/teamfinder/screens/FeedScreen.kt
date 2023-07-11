package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.kaist.cs.teamfinder.Feed
import edu.kaist.cs.teamfinder.R
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme

@Composable
fun FeedScreen(feedList: ArrayList<Feed>) {
    LazyColumn{
        items(feedList){ feed ->
            Box(
                modifier = Modifier
                        .padding(16.dp)
                        .width(400.dp)
                        .background(
                                color = Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(size = 16.dp)
                        )
                        .height(IntrinsicSize.Min)
            ){
                Column(){
                    Row(modifier = Modifier.fillMaxWidth()){
                        Image(
                            painter = painterResource(id = feed.imageResourceId),
                            contentDescription = feed.name,
                            modifier = Modifier
                                    .padding(start = 16.dp, top = 16.dp)
                                    .size(36.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)

                        )
                        Column(modifier = Modifier.weight(1f)){
                            Text(
                                text = feed.name,
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(700),
                                    color = Color(0xFF150B3D),
                                ),
                                modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                            )
                            Text(
                                text = feed.date,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF524B6B),
                                ),
                                modifier = Modifier.padding(start = 16.dp,top = 2.dp),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = feed.title,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.padding(16.dp)
                    )
                    //Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = feed.note,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF524B6B),
                        ),
                    modifier = Modifier.padding(16.dp)
                    )
                    Box(
                        modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))// Change to your preferred purple color
                                .background(color = Color(0xFFD6CDFE))

                    ){
                        Row(verticalAlignment = Alignment.CenterVertically){
                            Image(
                                painter = painterResource(id = R.drawable.like),
                                contentDescription = "like",
                                modifier = Modifier
                                        .padding(start = 16.dp, top = 16.dp)
                                        .size(18.dp) // 이미지 크기를 조절하십시오.

                            )
                            Text(
                                text = feed.like.toString(),
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF6F6B80),
                                ),
                                modifier = Modifier.padding(start = 4.dp, top = 16.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.comment),
                                contentDescription = "like",
                                modifier = Modifier
                                        .padding(start = 16.dp, top = 16.dp)
                                        .size(18.dp) // 이미지 크기를 조절하십시오.

                            )
                            Text(
                                text = feed.comment.toString(),
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF6F6B80),
                                ),
                                modifier = Modifier.padding(start = 4.dp, top = 16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FeedView(){
    TeamFinderTheme {
        val feedList:ArrayList<Feed> = arrayListOf(
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
            ,
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
            ,
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
            ,
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
            ,
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
            ,
            Feed("Michael Jackson",
                R.drawable.sample,"What are the characteristics of a fake job call form?",
                "Because I always find fake job calls so I'm confused which job to take can you share your knowledge here? thank you","1hour ago",
                14,30)
        )

        FeedScreen(feedList)
    }
}