package edu.upb.coderangersandroid.data.feed

import android.util.Log
import edu.upb.coderangersandroid.data.feed.network.FeedNetworkControllerImp
import edu.upb.coderangersandroid.data.feed.persistency.FeedPersistencyController
import edu.upb.coderangersandroid.model.Post
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class FeedRepository(val network: FeedNetworkControllerImp, val persistency: FeedPersistencyController) {
    fun getAllPostList(): Flow<List<Post>> {
        return flow{
            emit(persistency.getAllPosts())
            try {
                if(/*isNetworkConnected(context)*/true) {
                    val posts = network.getAllPosts()
                    persistency.savePosts(posts)
                    emit(posts)
                }
            } catch (e: Exception) {
                Log.e("ERROR", e.message!!)
            }
        }
    }

    fun searchPosts(query: String): List<Post> {
        return persistency.searchPosts(query)
    }
}