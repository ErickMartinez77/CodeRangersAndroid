package edu.upb.coderangersandroid.data.feed.network

import edu.upb.coderangersandroid.data.feed.model.PostRequest
import edu.upb.coderangersandroid.model.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class FeedNetworkControllerImp : FeedNetworkController {
    val client = Retrofit.Builder().baseUrl("http://192.168.0.12:1880")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FeedAPI::class.java)

    override suspend fun getAllPosts(): List<Post> {
        return client.getAllPosts()
    }

    override suspend fun post(publisher: String, shortDescription: String, imageUrl:String, ownerName: String, phone: String){
        return client.post(PostRequest(publisher,shortDescription, imageUrl, ownerName, phone))
    }
}