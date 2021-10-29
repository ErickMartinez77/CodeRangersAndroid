package edu.upb.coderangersandroid.data.favorites.persistency

import edu.upb.coderangersandroid.model.Favorite
import kotlinx.coroutines.flow.Flow

interface FavoritesPersistencyController {
    fun getFavoritesForPostId(postId: Int): Flow<Favorite>
    fun getFavorites(): List<Favorite>
    fun saveFavorite(favorite: Favorite)
    fun deleteFavorite(favorite: Favorite)

}