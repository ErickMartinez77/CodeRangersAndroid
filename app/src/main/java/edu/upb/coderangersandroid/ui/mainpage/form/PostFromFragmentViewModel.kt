package edu.upb.coderangersandroid.ui.mainpage.form

import androidx.lifecycle.ViewModel
import edu.upb.coderangersandroid.data.feed.FeedRepository
import kotlinx.coroutines.flow.Flow
import org.koin.java.KoinJavaComponent.inject

class PostFromFragmentViewModel : ViewModel() {

    private val feedRepository by inject(FeedRepository::class.java)

    fun post(publisher: String, shortDescription: String, imageUrl:String, ownerName: String, phone: String): Flow<Any>{
        return feedRepository.post(publisher,shortDescription, imageUrl, ownerName, phone)
    }
}
