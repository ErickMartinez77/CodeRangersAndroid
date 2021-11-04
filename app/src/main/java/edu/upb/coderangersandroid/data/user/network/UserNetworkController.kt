package edu.upb.coderangersandroid.data.user.network

interface UserNetworkController {
    suspend fun login(username: String, password:String)
    suspend fun register(username: String, password:String)
}