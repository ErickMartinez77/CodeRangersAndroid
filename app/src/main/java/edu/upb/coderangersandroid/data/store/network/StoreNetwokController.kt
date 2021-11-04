package edu.upb.coderangersandroid.data.store.network

import edu.upb.coderangersandroid.model.Product

interface StoreNetwokController {
    suspend fun getAllProducts(): List<Product>
}