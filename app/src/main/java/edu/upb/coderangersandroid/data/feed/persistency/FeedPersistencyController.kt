package edu.upb.coderangersandroid.data.feed.persistency

import edu.upb.coderangersandroid.model.Post
import kotlinx.coroutines.flow.Flow

interface FeedPersistencyController {
    fun getAllPosts(): Flow<List<Post>>
    fun savePosts(posts: List<Post>)
    fun searchPosts(query: String): List<Post>
}
