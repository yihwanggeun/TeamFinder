package edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.kaist.cs.teamfinder.R

@Composable
fun AddDetailScreen(){

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "Web",
                modifier = Modifier
                    .size(24.dp)// 이미지 크기를 조절하십시오.
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Choose Framework",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "FrontEnd",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "React",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "JavaScript",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "Angular",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "Vue.js",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "BackEnd",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "Node.js",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "Django",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "MySQL",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .width(400.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .height(IntrinsicSize.Min)
            ) {
                Row(modifier = Modifier.padding(16.dp).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){


                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "ORACLE",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.addbutton),
                        contentDescription = "Web",
                        modifier = Modifier
                            .size(24.dp) // 이미지 크기를 조절하십시오.

                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun AddDetailScreenPreview(){
    AddDetailScreen()
}