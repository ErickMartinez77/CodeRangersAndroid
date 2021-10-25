package edu.upb.coderangersandroid.data.feed.persistency

import edu.upb.coderangersandroid.model.Post

interface FeedPersistencyController {
    fun getAllPosts(): List<Post>
    fun savePosts(posts: List<Post>)
    fun searchPosts(query: String): List<Post>
}
