package edu.upb.coderangersandroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Product (@PrimaryKey val id: Int,
                    val name:String,
                    val price: Double,
                    val imageUrl: String,
                    val description: String): Serializable