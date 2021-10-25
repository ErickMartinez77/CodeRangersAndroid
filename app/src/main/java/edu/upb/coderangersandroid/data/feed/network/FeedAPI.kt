package edu.upb.coderangersandroid.data.feed.network

import edu.upb.coderangersandroid.model.Post
import retrofit2.http.GET
import retrofit2.http.POST

interface FeedAPI {
    @GET("/posts")
    suspend fun getAllPosts(): List<Post>

    @POST("/posts/1928398")
    suspend fun addNewPost(): List<Post>
    //TODO  check the numbers.
}