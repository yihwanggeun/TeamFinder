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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import com.google.gson.Gson
import edu.kaist.cs.teamfinder.Globals
import edu.kaist.cs.teamfinder.LoginRoute
import edu.kaist.cs.teamfinder.R
import edu.kaist.cs.teamfinder.User
import edu.kaist.cs.teamfinder.apiService
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun ProjectDetailScreen(projectName: String?) {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF9F9F9))) {

        // Big Box including Image

        //Spacer(modifier = Modifier.height(100.dp))
        // Box with background and Text
        Column {
            Box(modifier = Modifier.padding(top = 70.dp)) {

                Box(
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth()
                        .height(114.dp)
                        .background(Color(0xFFF3F2F2)),
                    contentAlignment = Alignment.Center
                ) {
                    Column() {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Schedule App Using Chat GPT to Improve",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF0D0140),
                                textAlign = TextAlign.Center
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            Text(
                                modifier = Modifier.weight(1f), text = "React Native",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF0D0140),
                                    textAlign = TextAlign.Center
                                )
                            )

                            Text(
                                modifier = Modifier.weight(1f), text = "React Native",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF0D0140),
                                    textAlign = TextAlign.Center
                                )
                            )

                            Text(
                                modifier = Modifier.weight(1f), text = "React Native",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF0D0140),
                                    textAlign = TextAlign.Center
                                )
                            )
                        }
                    }

                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Box(
                        modifier = Modifier
                            .size(80.dp) // Adjust the size of your image
                            .clip(CircleShape)
                            .background(Color(0xFFD6CDFE)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.apple),
                            contentDescription = "apple",
                            modifier = Modifier
                                .size(24.dp) // Adjust the size of your image
                                .clip(CircleShape)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(48.dp))
            Text(
                text = "Job Description",
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )

            Text(
                text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem ...",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF524B6B),
                )
            )

            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Requirements",
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF150B3D),
                )
            )
            Text(
                text = "· Sed ut perspiciatis unde omnis iste natus error sit.",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF524B6B),
                )
            )
            Text(
                text = "· Sed ut perspiciatis unde omnis iste natus error sit.",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF524B6B),
                )
            )
            Text(
                text = "· Sed ut perspiciatis unde omnis iste natus error sit.",
                modifier = Modifier.padding(16.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF524B6B),
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(size = 6.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF130160)),
                    modifier = Modifier
                        .width(266.dp)
                        .height(50.dp)
                        .shadow(
                            elevation = 62.dp,
                            spotColor = Color(0x2E99ABC6),
                            ambientColor = Color(0x2E99ABC6)
                        )


                ) {
                    Text(
                        text = "APPLY NOW",
                        color = Color.White
                    )
                }


            }
        }

    }
}

@Preview
@Composable
fun ProjectDetailScreenPreview() {
    ProjectDetailScreen(projectName = "")
}
