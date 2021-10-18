package edu.upb.coderangersandroid.model

import java.io.Serializable

data class Post(val publisher: String,
                val shortDescription: String,
                val imageUrl: String,
                val ownerName: String,
                val phone:Int): Serializable
