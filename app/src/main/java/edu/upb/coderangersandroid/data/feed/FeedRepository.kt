package edu.upb.coderangersandroid.data.feed

import android.util.Log
import edu.upb.coderangersandroid.NetworkUtils
import edu.upb.coderangersandroid.data.feed.network.FeedNetworkControllerImp
import edu.upb.coderangersandroid.data.feed.persistency.FeedPersistencyController
import edu.upb.coderangersandroid.model.Post
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class FeedRepository(private val network: FeedNetworkControllerImp, private val persistence: FeedPersistencyController) {
    fun getAllPostList(): Flow<List<Post>> {
        return persistence.getAllPosts()
    }

    fun searchPosts(query: String): List<Post> {
        return persistence.searchPosts(query)
    }

    fun updatePosts():Flow<Any>{
        return flow{
            try {
                if(NetworkUtils.isOnline) {
                    val posts = network.getAllPosts()
                    persistence.savePosts(posts)
                    emit(posts)
                }
            } catch (e: Exception) {
                Log.e("ERROR", e.message!!)
            }
        }
    }
}