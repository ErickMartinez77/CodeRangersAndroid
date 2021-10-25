package edu.upb.coderangersandroid.ui.mainpage.tabs.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import edu.upb.coderangersandroid.data.feed.FeedRepository
import edu.upb.coderangersandroid.data.feed.network.FeedNetworkControllerImp
import edu.upb.coderangersandroid.data.feed.persistency.FeedPersistencyControllerImp
import kotlinx.coroutines.Dispatchers

class PostViewModel: ViewModel() {
    val feedRepository = FeedRepository(FeedNetworkControllerImp(), FeedPersistencyControllerImp())

    val post = feedRepository.getAllPostList().asLiveData(Dispatchers.IO)

    fun searchPosts(query: String) {
        if (query.isNotBlank()) {
            feedRepository.searchPosts(query)
        } else {
            feedRepository.searchPosts("")
        }
    }


}

