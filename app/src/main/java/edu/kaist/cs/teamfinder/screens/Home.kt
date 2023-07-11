package edu.kaist.cs.teamfinder.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.kaist.cs.teamfinder.Engineer
import edu.kaist.cs.teamfinder.Project
import edu.kaist.cs.teamfinder.R


@Composable
fun Home(
        onProfileClick: () -> Unit,
//    onEngineerClick: (cid: String) -> Unit,
        onProjectClick: (projectId: String) -> Unit,
        onProjectTypeClick: (projectType: String) -> Unit,
        modifier: Modifier = Modifier
) {
//    val projectList = remember { ProjectRepo.getProjects() }
    val projectTag: ArrayList<String> = arrayListOf("React Native", "Node Js")
    val projectList = listOf(
            Project("MadCamp Project", R.drawable.apple, "Web Project", 4, projectTag),
            Project("MadCamp Project", R.drawable.apple, "Web Project", 4, projectTag),
            Project("MadCamp Project", R.drawable.apple, "Web Project", 4, projectTag),
    )
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
                modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .height(3000.dp)
        ) {
            Row(
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp, top = 40.dp),
                    horizontalArrangement = Arrangement.End
            ) {
                IconButton(onProfileClick) {
                    Image(
                            painter = painterResource(id = R.drawable.sample_image),
                            contentDescription = "Google logo",
                            modifier = Modifier
                                    .width(35.dp)
                                    .height(35.dp)
                    )
                }
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

            Row() {
                Box(
                        modifier = Modifier
                                .width(150.dp)
                                .padding(start = 16.dp)
                                .height(170.dp)
                                .background(
                                        color = Color(0xFFAFECFE),
                                        shape = RoundedCornerShape(size = 6.dp)
                                )
                ) {
                    Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                    ) {
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
                    WebType(
                            onProjectTypeClick,
                            modifier
                    )
                    Box(
                            modifier = Modifier
                                    .padding(start = 20.dp, top = 16.dp)
                                    .width(170.dp)
                                    .height(75.dp)
                                    .background(
                                            color = Color(0xFFFFD6AD),
                                            shape = RoundedCornerShape(size = 6.dp)
                                    )

                    ) {
                        Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.fillMaxSize()
                        ) {
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
            Project(
                    projectList,
                    onProjectClick,
                    modifier
            )
        }
    }


}

@Composable
private fun Project(
        projectList: List<Project>,
        onProfileClick: (projectId: String) -> Unit,
        modifier: Modifier = Modifier
) {
    Surface(modifier = modifier) {
        Box {
            ProjectList(projectList, onProfileClick)
        }
    }
}

@Composable
private fun ProjectList(
        projectList: List<Project>,
        onProjectClick: (String) -> Unit,
        modifier: Modifier = Modifier
) {
    Box(modifier) {
        LazyColumn {
            itemsIndexed(projectList) { index, project ->
                // projectSummary(project = project, onProjectClick = onProjectClick, index = index)

                Box(
                        modifier = Modifier
                                .padding(16.dp)
                                .width(400.dp)
                                .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(size = 6.dp)
                                )
                                .height(IntrinsicSize.Min),
                ) {
                    Column() {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Box(
                                    modifier = Modifier
                                            .size(60.dp) // 이미지 크기를 조절하십시오.
                                            .padding(start = 16.dp, top = 16.dp)
                                            .clip(CircleShape)
                                            .background(Color(0xFFD6CDFE))
                            ) {
                                Image(
                                        painter = painterResource(id = project.projectImageResourceId),
                                        contentDescription = project.projectName,
                                        modifier = Modifier
                                                .size(24.dp) // 이미지 크기를 조절하십시오.
                                                .clip(CircleShape)
                                                .align(Alignment.Center)

                                )

                            }
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                        text = "Schedule App Using Chat GPT to Improve",
                                        style = TextStyle(
                                                fontSize = 14.sp,
                                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                                fontWeight = FontWeight(700),
                                                color = Color(0xFF150B3D),
                                        ),
                                        modifier = Modifier.padding(start = 16.dp, top = 20.dp)
                                )
                                Text(
                                        text = "Web Project",
                                        style = TextStyle(
                                                fontSize = 12.sp,
                                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                                fontWeight = FontWeight(400),
                                                color = Color(0xFF524B6B),
                                        ),
                                        modifier = Modifier.padding(start = 16.dp, top = 4.dp),
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                )
                            }
                            Box(
                                    modifier = Modifier.padding(top = 16.dp, end = 16.dp),
                                    Alignment.TopEnd
                            ) {
                                Image(
                                        painter = painterResource(id = R.drawable.save2),
                                        contentDescription = "save",
                                        modifier = Modifier
                                                .size(24.dp) // 이미지 크기를 조절하십시오.
                                )
                            }

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(modifier = Modifier.padding(start = 18.dp)) {
                            val text = buildAnnotatedString {
                                withStyle(
                                        style = SpanStyle(
                                                color = Color.Black,
                                                fontFamily = FontFamily(Font(R.font.dmsansbold))
                                        )
                                ) {
                                    append("1명 / ")
                                }
                                withStyle(
                                        style = SpanStyle(
                                                color = Color(0xFFFCA34D),
                                                fontFamily = FontFamily(Font(R.font.dmsansbold)),
                                                textDecoration = TextDecoration.Underline
                                        )
                                ) {
                                    append("4명\n")
                                }
                            }

                            Text(
                                    text = text,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsansbold)),
                                    modifier = Modifier.height(20.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                Box(modifier = Modifier.weight(1f)) {
                                    // 첫번째 Box
                                    Row {
                                        Box(
                                                modifier = Modifier
                                                        .wrapContentWidth() // 가용 공간을 차지하도록 설정
                                                        .padding(bottom = 8.dp, start = 16.dp)
                                                        .height(30.dp)
                                                        .background(
                                                                color = Color(0x1ACBC9D4),
                                                                shape = RoundedCornerShape(size = 6.dp)
                                                        ),
                                                contentAlignment = Alignment.CenterStart // 왼쪽 정렬
                                        ) {
                                            Text(
                                                    text = "Django Developer",
                                                    style = TextStyle(
                                                            fontSize = 10.sp,
                                                            fontFamily = FontFamily(Font(R.font.dmsans)),
                                                            fontWeight = FontWeight(400),
                                                            color = Color(0xFF524B6B),
                                                    ),
                                                    modifier = Modifier.padding(8.dp)
                                            )
                                        }

                                        // 두번째 Box
                                        Box(
                                                modifier = Modifier
                                                        .wrapContentWidth() // 가용 공간을 차지하도록 설정
                                                        .height(30.dp)
                                                        .padding(start = 8.dp)
                                                        .background(
                                                                color = Color(0x1ACBC9D4),
                                                                shape = RoundedCornerShape(size = 6.dp)
                                                        ),
                                                contentAlignment = Alignment.CenterStart // 왼쪽 정렬
                                        ) {
                                            Text(
                                                    text = "Swift Developer",
                                                    style = TextStyle(
                                                            fontSize = 10.sp,
                                                            fontFamily = FontFamily(Font(R.font.dmsans)),
                                                            fontWeight = FontWeight(400),
                                                            color = Color(0xFF524B6B),
                                                    ),
                                                    modifier = Modifier.padding(8.dp)
                                            )
                                        }
                                    }
                                }
                                // 'Apply' 버튼
                                Box(
                                        modifier = Modifier
                                                .width(80.dp)
                                                .height(30.dp)
                                                .padding(end = 16.dp)
                                                .background(
                                                        color = Color(0x1AFF6B2C),
                                                        shape = RoundedCornerShape(size = 6.dp)
                                                ),
                                        contentAlignment = Alignment.Center,

                                        ) {
                                    val text = buildAnnotatedString {
                                        pushStringAnnotation(
                                                tag = "Apply",
                                                annotation = "Apply"
                                        ) // Use a tag to identify the clickable text
                                        withStyle(
                                                style = SpanStyle(
                                                        color = Color(0xFF524B6B),
                                                        textDecoration = TextDecoration.Underline
                                                )
                                        ) {
                                            append("Apply")
                                        }
                                        pop()
                                    }
                                    ClickableText(
                                            text = text,
                                            style = TextStyle(
                                                    fontSize = 10.sp,
                                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                                    fontWeight = FontWeight(400),
                                            ),
                                            modifier = Modifier.padding(4.dp),
                                            onClick = { offset ->
                                                text.getStringAnnotations(
                                                        tag = "Apply",
                                                        start = offset,
                                                        end = offset
                                                ).firstOrNull()?.let {
                                                    onProjectClick(project.projectName) // TODO: DeepLink
                                                }
                                            }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun WebType(
        onProjectTypeClick: (projectType: String) -> Unit,
        modifier: Modifier = Modifier
) {
    Box(
            modifier = Modifier
                    .padding(start = 20.dp)
                    .width(170.dp)
                    .height(75.dp)
                    .background(
                            color = Color(0xFFBEAFFE),
                            shape = RoundedCornerShape(size = 6.dp)
                    )
                    .clickable(onClick = { onProjectTypeClick("Web") }),

            ) {
        Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
        ) {
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
            )
        }
    }
}

// TODO: Project 속성적용
@Composable
fun ProjectSummary(
        project: Project,
        onProjectClick: (String) -> Unit,
        index: Int
) {
    Box(
            modifier = Modifier
                    .padding(16.dp)
                    .width(400.dp)
                    .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 6.dp)
                    )
                    .height(IntrinsicSize.Min),
    ) {
        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(
                        modifier = Modifier
                                .size(60.dp) // 이미지 크기를 조절하십시오.
                                .padding(start = 16.dp, top = 16.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFD6CDFE))
                ) {
                    Image(
                            painter = painterResource(id = project.projectImageResourceId),
                            contentDescription = project.projectName,
                            modifier = Modifier
                                    .size(24.dp) // 이미지 크기를 조절하십시오.
                                    .clip(CircleShape)
                                    .align(Alignment.Center)

                    )

                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                            text = "Schedule App Using Chat GPT to Improve",
                            style = TextStyle(
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(700),
                                    color = Color(0xFF150B3D),
                            ),
                            modifier = Modifier.padding(start = 16.dp, top = 20.dp)
                    )
                    Text(
                            text = "Web Project",
                            style = TextStyle(
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.dmsans)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF524B6B),
                            ),
                            modifier = Modifier.padding(start = 16.dp, top = 4.dp),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                    )
                }
                Box(
                        modifier = Modifier.padding(top = 16.dp, end = 16.dp),
                        Alignment.TopEnd
                ) {
                    Image(
                            painter = painterResource(id = R.drawable.save2),
                            contentDescription = "save",
                            modifier = Modifier
                                    .size(24.dp) // 이미지 크기를 조절하십시오.
                    )
                }

            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.padding(start = 18.dp)) {
                val text = buildAnnotatedString {
                    withStyle(
                            style = SpanStyle(
                                    color = Color.Black,
                                    fontFamily = FontFamily(Font(R.font.dmsansbold))
                            )
                    ) {
                        append("1명 / ")
                    }
                    withStyle(
                            style = SpanStyle(
                                    color = Color(0xFFFCA34D),
                                    fontFamily = FontFamily(Font(R.font.dmsansbold)),
                                    textDecoration = TextDecoration.Underline
                            )
                    ) {
                        append("4명\n")
                    }
                }

                Text(
                        text = text,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.dmsansbold)),
                        modifier = Modifier.height(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Box(modifier = Modifier.weight(1f)) {
                        // 첫번째 Box
                        Row {
                            Box(
                                    modifier = Modifier
                                            .wrapContentWidth() // 가용 공간을 차지하도록 설정
                                            .padding(bottom = 8.dp, start = 16.dp)
                                            .height(30.dp)
                                            .background(
                                                    color = Color(0x1ACBC9D4),
                                                    shape = RoundedCornerShape(size = 6.dp)
                                            ),
                                    contentAlignment = Alignment.CenterStart // 왼쪽 정렬
                            ) {
                                Text(
                                        text = "Django Developer",
                                        style = TextStyle(
                                                fontSize = 10.sp,
                                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                                fontWeight = FontWeight(400),
                                                color = Color(0xFF524B6B),
                                        ),
                                        modifier = Modifier.padding(8.dp)
                                )
                            }

                            // 두번째 Box
                            Box(
                                    modifier = Modifier
                                            .wrapContentWidth() // 가용 공간을 차지하도록 설정
                                            .height(30.dp)
                                            .padding(start = 8.dp)
                                            .background(
                                                    color = Color(0x1ACBC9D4),
                                                    shape = RoundedCornerShape(size = 6.dp)
                                            ),
                                    contentAlignment = Alignment.CenterStart // 왼쪽 정렬
                            ) {
                                Text(
                                        text = "Swift Developer",
                                        style = TextStyle(
                                                fontSize = 10.sp,
                                                fontFamily = FontFamily(Font(R.font.dmsans)),
                                                fontWeight = FontWeight(400),
                                                color = Color(0xFF524B6B),
                                        ),
                                        modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                    // 'Apply' 버튼
                    Box(
                            modifier = Modifier
                                    .width(80.dp)
                                    .height(30.dp)
                                    .padding(end = 16.dp)
                                    .background(
                                            color = Color(0x1AFF6B2C),
                                            shape = RoundedCornerShape(size = 6.dp)
                                    ),
                            contentAlignment = Alignment.Center,

                            ) {
                        val text = buildAnnotatedString {
                            pushStringAnnotation(
                                    tag = "Apply",
                                    annotation = "Apply"
                            ) // Use a tag to identify the clickable text
                            withStyle(
                                    style = SpanStyle(
                                            color = Color(0xFF524B6B),
                                            textDecoration = TextDecoration.Underline
                                    )
                            ) {
                                append("Apply")
                            }
                            pop()
                        }
                        ClickableText(
                                text = text,
                                style = TextStyle(
                                        fontSize = 10.sp,
                                        fontFamily = FontFamily(Font(R.font.dmsans)),
                                        fontWeight = FontWeight(400),
                                ),
                                modifier = Modifier.padding(4.dp),
                                onClick = { offset ->
                                    text.getStringAnnotations(
                                            tag = "Apply",
                                            start = offset,
                                            end = offset
                                    ).firstOrNull()?.let {
                                        onProjectClick(project.projectName) // TODO: DeepLink
                                    }
                                }
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    Home(
            onProfileClick = { },
//        onEngineerClick = { },
            onProjectClick = { },
            onProjectTypeClick = { },
            Modifier
    )
}
