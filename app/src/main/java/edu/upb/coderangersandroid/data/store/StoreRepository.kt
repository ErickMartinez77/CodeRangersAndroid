package edu.upb.coderangersandroid.data.store

import android.util.Log
import edu.upb.coderangersandroid.NetworkUtils
import edu.upb.coderangersandroid.data.store.network.StoreNetwokController
import edu.upb.coderangersandroid.data.store.persistency.StorePersistencyController
import edu.upb.coderangersandroid.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class StoreRepository (private val network: StoreNetwokController, private val persistency: StorePersistencyController) {
    fun getAllProducts(): Flow<List<Product>> {
        return persistency.getAllProducts()
    }

    fun updateProducts(): Flow<Any>{
        return flow {
            try {
                if (NetworkUtils.isOnline){
                    val products = network.getAllProducts()
                    persistency.saveProducts(products)
                    emit(products)
                }
            } catch (e: Exception){
                Log.e("ERROR", e.message!!)
            }
        }
    }
}