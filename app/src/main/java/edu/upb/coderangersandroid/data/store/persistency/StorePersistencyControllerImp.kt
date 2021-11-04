package edu.upb.coderangersandroid.data.store.persistency

import edu.upb.coderangersandroid.App
import edu.upb.coderangersandroid.model.Product
import kotlinx.coroutines.flow.Flow

class StorePersistencyControllerImp: StorePersistencyController {

    private val db = App.db

    override fun getAllProducts(): Flow<List<Product>> {
        return db.productDao().getAllProducts()
    }

    override fun saveProducts(products: List<Product>) {
        return db.productDao().saveAllProducts(products)
    }
}