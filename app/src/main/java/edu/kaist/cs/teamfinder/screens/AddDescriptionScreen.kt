package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import edu.kaist.cs.teamfinder.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddDescriptionScreen() {
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
                text = "Add a project information",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF150B3D),
                )
            )

            Spacer(modifier = Modifier.height(24.dp))
            Row(modifier = Modifier.fillMaxWidth()){
                Image(
                    painter = painterResource(id = R.drawable.sample),
                    contentDescription = "sample",
                    modifier = Modifier
                            .padding(start = 16.dp, top = 16.dp)
                            .size(36.dp) // 이미지 크기를 조절하십시오.
                            .clip(CircleShape)

                )
                Column(modifier = Modifier.weight(1f)){
                    Text(
                        text = "Michael Jackson",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.dmsans)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF150B3D),
                        ),
                        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                    )
                    Text(
                        text = "Web Developer",
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

            Spacer(modifier = Modifier.height(24.dp))  // Add this line

            Text(
                text = "Project Name",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))  // Add this line
            var project_name by remember{
                mutableStateOf("")
            }
            TextField(
                value = project_name,
                onValueChange = { project_name = it },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFFFFFF),
                    textColor = Color.Gray,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(24.dp))  // Add this line
            Text(
                text = "Project Type",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))  // Add this line
            var project_type by remember{
                mutableStateOf("")
            }
            TextField(
                value = project_type,
                onValueChange = { project_type = it },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFFFFFF),
                    textColor = Color.Gray,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(24.dp))  // Add this line
            Text(
                text = "Based On Framework",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))  // Add this line
            var framework by remember{
                mutableStateOf("")
            }
            TextField(
                value = framework,
                onValueChange = { framework = it },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFFFFFF),
                    textColor = Color.Gray,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(24.dp))  // Add this line
            Text(
                text = "Description",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))  // Add this line
            var project_description by remember{
                mutableStateOf("")
            }
            TextField(
                value = project_description,
                onValueChange = { project_description = it },
                modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFFFFFFF),
                    textColor = Color.Gray,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(16.dp))  // Add this line
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                Button(
                    onClick = {

                    },
                    shape = RoundedCornerShape(size = 6.dp),
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
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "Gather",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 10.sp,
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
fun AddDescriptionScreenPreview(){
    AddDescriptionScreen()
}