package edu.upb.coderangersandroid.ui.mainpage.tabs.store

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import edu.upb.coderangersandroid.data.store.StoreRepository
import edu.upb.coderangersandroid.data.store.network.StoreNetworkControllerImp
import edu.upb.coderangersandroid.data.store.persistency.StorePersistencyControllerImp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn

class ProductViewModel: ViewModel() {

    private val storeRepository = StoreRepository(StoreNetworkControllerImp(), StorePersistencyControllerImp())

    val productsList = storeRepository.getAllProducts().asLiveData(Dispatchers.IO)

    fun updateStore(): Job{
        return storeRepository.updateProducts().launchIn(CoroutineScope(Dispatchers.IO))
    }
}