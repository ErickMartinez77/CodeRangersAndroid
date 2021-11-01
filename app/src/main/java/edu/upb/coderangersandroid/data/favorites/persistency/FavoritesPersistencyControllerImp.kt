package edu.upb.coderangersandroid.data.favorites.persistency

import edu.upb.coderangersandroid.App
import edu.upb.coderangersandroid.model.Favorite
import kotlinx.coroutines.flow.Flow


class FavoritesPersistencyControllerImp: FavoritesPersistencyController {

    private val db = App.db
    override fun getFavoritesForPostId(postId: Int): Flow<Favorite> {
        return db.favoritesDao().getFavoritesForPostId(postId)
    }

    override fun getFavorites(): List<Favorite> {
        return db.favoritesDao().getAllFavorites()
    }
    override fun saveFavorite(favorite: Favorite){
        return db.favoritesDao().saveToFavorite(favorite)
    }
    override fun deleteFavorite(favorite: Favorite) {
        return db.favoritesDao().deleteFavorite(favorite)
    }

}