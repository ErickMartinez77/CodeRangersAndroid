package edu.upb.coderangersandroid.databases.daos

import androidx.room.*
import edu.upb.coderangersandroid.model.Favorite
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteDao {
    @Query("SELECT * FROM favorite WHERE postId=:postId")
    fun getFavoritesForPostId(postId: Int): Flow<Favorite>

    @Query("SELECT * FROM favorite")
    fun getAllFavorites(): List<Favorite>

    @Insert
    fun saveToFavorite(favorite: Favorite)

    @Delete
    fun deleteFavorite(favorite: Favorite)
}