package edu.upb.coderangersandroid.data.store.network

import edu.upb.coderangersandroid.model.Product
import retrofit2.http.GET

interface StoreAPI {
    @GET("/products")
    suspend fun getAllProducts(): List<Product>
}