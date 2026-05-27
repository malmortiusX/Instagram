package com.example.lazycolrowcoilactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolrowcoilactivity.model.Post
import com.example.lazycolrowcoilactivity.ui.screens.FeedScreen
import com.example.lazycolrowcoilactivity.ui.theme.LazyColRowCoilActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FeedScreen()
        }
    }
}

@Composable
fun BasicFeedList(posts: List<Post>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            vertical = 8.dp
        ),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            items = posts,
            key = { post -> post.id }
        ) { post ->
            PostCard(post = post)
        }

    }
}

@Composable
fun FeedWithIndex(posts: List<Post>) {
    LazyColumn {
        itemsIndexed(posts) { index, post ->
            Text("Post #$index: ${post.username}")
        }
    }
}

@Composable
fun PostCard(post: Post) {
    TODO("Not yet implemented")
}