package edu.upb.coderangersandroid.data.user.network

import edu.upb.coderangersandroid.data.user.model.LoginRequest
import edu.upb.coderangersandroid.model.Post
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserAPI {
    @POST("/login")
    suspend fun login(@Body loginRequest: LoginRequest)
    @POST("/register")
    suspend fun register(@Body loginRequest: LoginRequest)
}