package edu.upb.coderangersandroid.data.store.network

import edu.upb.coderangersandroid.model.Product
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StoreNetworkControllerImp: StoreNetwokController {

    val client = Retrofit.Builder().baseUrl("http://192.168.0.4:1880")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(StoreAPI::class.java)

    override suspend fun getAllProducts(): List<Product> {
        return client.getAllProducts()
    }
}