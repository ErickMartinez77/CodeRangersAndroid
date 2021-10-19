package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Product

object StoreDataSource {

    val productList = mutableListOf<Product>(
        Product(
            name = "Caja de Herramientas",
            price = 40.00,
            imageUrl = "https://lh3.googleusercontent.com/proxy/H2zMa_DU29ZYEtGsrdZMBRk-s-uQM0LaNCRD53Sdg8JSfWcllXRMBzza5q9IBaKxgj1XVFJqrxMX9hyhZkAZ8Ibi2jD_9_FEIBw2XJYADUJm8E9HF9k"
        ),
        Product(
            name = "Cables UTP",
            price = 35.00,
            imageUrl = "https://www.securame.com/images/c_utp2.png"
        ),
        Product(
            name = "Impresora 3D",
            price = 350.50,
            imageUrl = "https://bigrep.com/wp-content/uploads/2018/08/one-home.png"
        )
    )
}