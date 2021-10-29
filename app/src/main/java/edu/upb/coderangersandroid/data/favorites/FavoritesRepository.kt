package edu.upb.coderangersandroid.data.favorites

import edu.upb.coderangersandroid.data.favorites.persistency.FavoritesPersistencyController
import edu.upb.coderangersandroid.model.Favorite
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FavoritesRepository(private val persistence : FavoritesPersistencyController) {

    fun getFavoritesForPostId(postId:Int): Flow<Favorite>{
        return persistence.getFavoritesForPostId(postId)
    }
    fun getFavorites(): List<Favorite>{
        return persistence.getFavorites()
    }
    fun saveFavorite(favorite: Favorite):Flow<Any>{
        return flow {
            persistence.saveFavorite(favorite)
        }
    }
    fun deleteFavorite(favorite: Favorite):Flow<Any>{
        return flow {
            persistence.deleteFavorite(favorite)
        }
    }

}