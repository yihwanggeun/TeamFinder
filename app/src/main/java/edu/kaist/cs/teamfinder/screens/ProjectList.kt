package edu.kaist.cs.teamfinder.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import edu.kaist.cs.teamfinder.Project
import edu.kaist.cs.teamfinder.R
import edu.kaist.cs.teamfinder.ui.theme.TeamFinderTheme


@Composable
fun ProjectList1(
        projectList: List<Project>,
        onProjectClick: (String) -> Unit
) {
    val navController = rememberNavController()
}

@Preview(showBackground = true)
@Composable
fun ProjectView() {
    TeamFinderTheme {

        val projectTag:ArrayList<String> = arrayListOf("React Native","Node Js")
        val projectList = listOf(
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag),
            Project("MadCamp Project",R.drawable.apple,"Web Project",4, projectTag)
            // 기타 기술자 추가
        )
        ProjectList1(projectList, onProjectClick = {})
    }
}
