package edu.kaist.cs.teamfinder.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.Engineer
import edu.kaist.cs.teamfinder.Globals
import edu.kaist.cs.teamfinder.LeafScreen
import edu.kaist.cs.teamfinder.Project
import edu.kaist.cs.teamfinder.R
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.ProjectList
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.TopRateEngineer
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()).height(3000.dp)){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 30.dp, top = 40.dp),
                horizontalArrangement = Arrangement.End
            ){
                Image(
                    painter = painterResource(id = R.drawable.sample_image),
                    contentDescription = "Google logo",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
            }
            Text(
                text = "Hello\nOrlando Diggs.",
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 26.65.sp,
                    fontFamily = FontFamily(Font(R.font.dmsansbold)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF0D0140),
                ),
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Most Popular Engineer",
                style = TextStyle(
                    fontSize = 10.sp,
                    lineHeight = 10.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(300),
                    color = Color(0xFF0D0140),
                ),
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            val engineerList = listOf(
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample),
                Engineer("이황근", R.drawable.sample)
                // 기타 기술자 추가
            )
            TopRateEngineer(engineerList)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Find Your Job",
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(){
                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .padding(start = 16.dp)
                        .height(170.dp)
                        .background(
                            color = Color(0xFFAFECFE),
                            shape = RoundedCornerShape(size = 6.dp)
                        )
                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
                        Image(
                            painter = painterResource(id = R.drawable.react),
                            contentDescription = "react",
                            modifier = Modifier
                                .size(100.dp),


                            )
                        Text(
                            text = "44.5k",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF0D0140),
                            )
                        )
                        Text(
                            text = "App Project",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF0D0140),
                            )
                        )


                    }
                }
                Column {
                    Box(
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .width(170.dp)
                            .height(75.dp)
                            .background(
                                color = Color(0xFFBEAFFE),
                                shape = RoundedCornerShape(size = 6.dp)
                            ),

                        ){
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()){
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "66.8k",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(700),
                                    color = Color(0xFF0D0140),
                                )
                            )
                            Text(
                                text = "Web Project",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF0D0140),
                                )
                            )}
                    }
                    Box(
                        modifier = Modifier
                            .padding(start = 20.dp, top = 16.dp)
                            .width(170.dp)
                            .height(75.dp)
                            .background(
                                color = Color(0xFFFFD6AD),
                                shape = RoundedCornerShape(size = 6.dp)
                            )

                    ){Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()){
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "66.8k",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF0D0140),
                            )
                        )
                        Text(
                            text = "Software Project",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF0D0140),
                            )
                        )
                    }
                    }
                }


            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Recently Project List",
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.dmsans)),
                    fontWeight = FontWeight(700),
                )
            )
            val projectTag:ArrayList<String> = arrayListOf("React Native","Node Js")
            val projectList = listOf(
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag),
                Project("MadCamp Project", R.drawable.apple,"Web Project",4, projectTag)
                // 기타 기술자 추가
            )
            ProjectList(projectList)
        }
    }

}

@Composable
fun HomeNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "profile"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("profile") {
            ProfileScreen(
                onNavigateToFriends = { navController.navigate("friendsList") },
                /*...*/
            )
        }
        composable("friendslist") { FriendsListScreen(/*...*/) }
    }
}

@Composable
fun FriendsListScreen() {
    Text(text = "friendList")
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}