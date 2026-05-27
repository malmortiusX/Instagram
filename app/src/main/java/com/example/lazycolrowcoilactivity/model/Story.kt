package com.example.lazycolrowcoilactivity.model

data class Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val hasSeen: Boolean = false
)
