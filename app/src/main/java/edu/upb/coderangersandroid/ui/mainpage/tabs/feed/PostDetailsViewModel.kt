package edu.upb.coderangersandroid.ui.mainpage.tabs.feed

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import edu.upb.coderangersandroid.data.favorites.FavoritesRepository
import edu.upb.coderangersandroid.data.favorites.persistency.FavoritesPersistencyControllerImp
import edu.upb.coderangersandroid.data.feed.FeedRepository
import edu.upb.coderangersandroid.data.feed.network.FeedNetworkControllerImp
import edu.upb.coderangersandroid.data.feed.persistency.FeedPersistencyControllerImp
import edu.upb.coderangersandroid.model.Favorite
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.java.KoinJavaComponent.inject

class PostDetailsViewModel : ViewModel() {
    private val favoriteRepository by inject(FavoritesRepository::class.java)
    val favorite = MutableLiveData<Favorite?>()

    fun getAllFavorites(): List<Favorite> {
        return favoriteRepository.getFavorites()
    }

    fun getFavoriteForPostId(postId: Int){
        favoriteRepository.getFavoritesForPostId(postId).onEach {
            favorite.postValue(it)
        }.launchIn(CoroutineScope(Dispatchers.IO))
    }

    fun saveFavorite(favorite: Favorite ){
        favoriteRepository.saveFavorite(favorite).launchIn(CoroutineScope(Dispatchers.IO))
    }

    fun deleteFavorite(favorite: Favorite){
        favoriteRepository.deleteFavorite(favorite).launchIn(CoroutineScope(Dispatchers.IO))
    }
}

