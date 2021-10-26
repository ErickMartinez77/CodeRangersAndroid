package edu.upb.coderangersandroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Post(@PrimaryKey val id: Int,
                val publisher: String,
                val shortDescription: String,
                val imageUrl: String,
                val ownerName: String,
                val phone:Int): Serializable
