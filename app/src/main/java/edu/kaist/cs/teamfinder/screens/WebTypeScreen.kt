package edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.kaist.cs.teamfinder.R

@Composable
fun WebTypeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF9F9F9))) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()).height(5000.dp)) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Specialization",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.dmsansbold)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150A33),

                    )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "FrontEnd",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150A33),

                    )
            )

            Row {

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                    ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.react),
                                contentDescription = "react",
                                modifier = Modifier
                                    .size(60.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "React",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.angular),
                                contentDescription = "react",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Aungular",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
            Row {

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.javascript),
                                contentDescription = "react",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Java Script",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.vue),
                                contentDescription = "react",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Vue.js",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "BackEnd",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150A33),

                    )
            )

            Row {

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.django),
                                contentDescription = "django",
                                modifier = Modifier
                                    .size(60.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Django",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.nodejs),
                                contentDescription = "nodejs",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Node Js",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
            Row {

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mysql),
                                contentDescription = "mysql",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "My SQL",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(160.dp)
                        .height(180.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )

                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier.padding(top = 32.dp)
                                .size(70.dp) // 이미지 크기를 조절하십시오.
                                .clip(CircleShape)
                                .background(Color(0xFFF9F9F9))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.oracle),
                                contentDescription = "oracle",
                                modifier = Modifier
                                    .size(40.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                            )

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "ORACLE",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF150B3D),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }

        }
    }

}

@Preview
@Composable
fun WebTypeScreenPreview() {
    WebTypeScreen()
}
