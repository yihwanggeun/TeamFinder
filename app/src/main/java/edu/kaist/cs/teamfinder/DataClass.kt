package edu.kaist.cs.teamfinder

data class User(
    val email: String?,
    val password: String?,
    val fullname: String?,
    val photo_url: String?,
)

data class Engineer(
    val name: String,
    val imageResourceId: Int
)

data class Project(
    val projectName: String,
    val projectImageResourceId: Int,
    val projectType: String,
    val projectMax: Int,
    val projectTag: ArrayList<String>
)