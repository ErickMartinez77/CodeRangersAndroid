package edu.upb.coderangersandroid.data.feed.network

import edu.upb.coderangersandroid.model.Post

interface FeedNetworkController {
    suspend fun getAllPosts(): List<Post>
}