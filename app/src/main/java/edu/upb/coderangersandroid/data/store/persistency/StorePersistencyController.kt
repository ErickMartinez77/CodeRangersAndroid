package edu.upb.coderangersandroid.data.store.persistency

import edu.upb.coderangersandroid.model.Product
import kotlinx.coroutines.flow.Flow

interface StorePersistencyController {
    fun getAllProducts(): Flow<List<Product>>
    fun saveProducts(products: List<Product>)
}