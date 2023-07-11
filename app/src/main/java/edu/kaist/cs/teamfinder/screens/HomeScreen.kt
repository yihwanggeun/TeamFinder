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
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.ApplyScreen
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.ProjectDescription
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.ProjectDetailScreen
import edu.kaist.cs.teamfinder.edu.kaist.cs.teamfinder.screens.TopRateEngineer
import edu.kaist.cs.teamfinder.navbariconpack.Home
import edu.kaist.cs.teamfinder.navbariconpack.NavBarIconPack

@Composable
fun HomeScreen() {
    val navController = rememberNavController()

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
    var projectName = ""
    NavHost(navController, "projectList") {
        composable("projectList") {
            ProjectList(
                projectList,
                onProjectListClick = { it ->
                    projectName = it.projectName
                    navController.navigate("projectDetail")
                    println(it.projectName)
                }
            )
        }
        composable("projectDetail") { ProjectDetailScreen(projectName) }
    }

}




@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}