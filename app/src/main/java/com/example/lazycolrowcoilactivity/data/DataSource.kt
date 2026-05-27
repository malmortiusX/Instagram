package com.example.lazycolrowcoilactivity.data

import com.example.lazycolrowcoilactivity.model.Post
import com.example.lazycolrowcoilactivity.model.Story

object DataSource {
    fun getPosts(): List<Post> = listOf(
        Post(
            1,
            "android_developer",
            "https://picsum.photos/sed/user1/200/200",
            "https://picsum.photos/seed/post1/800/800",
            1_204,
            "Explorando Jetpack Compose 🚀 #Android #Kotlin"
        ),
        Post(
            2,
            "kotlin_ninja",
            "https://picsum.photos/seed/user2/200/200",
            "https://picsum.photos/seed/post2/800/800",
            847,
            "Data classes son la mejor feature de Kotlin ♥️",
            true
        ),
        Post(
            3,
            "compose_ui",
            "https://picsum.photos/seed/user3/200/200",
            "https://picsum.photos/seed/post3/800/800",
            3_456,
            "Material3 + Compose = perfecta combinacion 🎨️"
        ),
        Post(
            4,
            "google_devs",
            "https://picsum.photos/seed/user4/200/200",
            "https://picsum.photos/seed/post4/800/800",
            12_891,
            "Android 15 trae increibles mejoras de performance! 📱️"
        ),
        Post(
            5,
            "mobile_craft",
            "https://picsum.photos/seed/user5/200/200",
            "https://picsum.photos/seed/post5/800/800",
            629,
            "LazyColumn vs Recycler️view: ¿Cuál prefieres? 🤔"
        ),
        Post(
            6,
            "ux_android",
            "https://picsum.photos/seed/user6/200/200",
            "https://picsum.photos/seed/post6/800/800",
            2_103,
            "Animaciones fluidas con animate*AsState 💫️"
        ),
        Post(
            7,
            "dev_colombia",
            "https://picsum.photos/seed/user7/200/200",
            "https://picsum.photos/seed/post7/800/800",
            445,
            "Coil hace super faácil cargar imagenes en Compose 🖼️️",
            true
        ),
        Post(
            8,
            "kotlin_ninja",
            "https://picsum.photos/seed/user8/200/200",
            "https://picsum.photos/seed/post8/800/800",
            777,
            "Hilt facilita la vida al gestionar dependencias en proyectos grandes 💉",
            true
        ),
        Post(
            9,
            "kotlin_ninja",
            "https://picsum.photos/seed/user9/200/200",
            "https://picsum.photos/seed/post9/800/800",
            19_865,
            "Manejando procesos en segundo plano como un pro con Kotlin Coroutines ⚡",
            true
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(
            1,
            "Tu historia",
            "",
            false
        ),
        Story(
            2,
            "android_dev",
            "https://picsum.photos/seed/s2/200/200"
        ),
        Story(
            3,
            "kotlin_fan",
            "https://picsum.photos/seed/s3/200/200"
        ),
        Story(
            4,
            "google_io",
            "https://picsum.photos/seed/s4/200/200",
            true
        ),
        Story(
            5,
            "el_androide",
            "https://picsum.photos/seed/s5/200/200",
            true
        ),
        Story(
            6,
            "pixel_pro",
            "https://picsum.photos/seed/s6/200/200"
        ),
        Story(
            7,
            "pixel_pro2",
            "https://picsum.photos/seed/s7/200/200"
        )
    )
}