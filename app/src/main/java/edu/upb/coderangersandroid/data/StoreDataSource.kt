package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Product

object StoreDataSource {

    private val productList = mutableListOf<Product>(
        Product(
            id = 1,
            name = "Caja de Herramientas",
            price = 40.00,
            imageUrl = "https://www.kingtony.com/upload/products/911-000CR02.png",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque dignissim pulvinar turpis a euismod. Morbi placerat pellentesque enim, rutrum porttitor metus tincidunt facilisis. Integer sit amet augue risus. In a dui urna. Proin id commodo tortor, mattis dignissim nisl. Vivamus accumsan id metus et semper. Etiam eget nisi sit amet ipsum hendrerit elementum eu nec sapien. Sed vehicula ex ut lectus sodales lobortis. Aenean convallis sapien dolor, cursus fermentum nisi dignissim ac. Curabitur facilisis, urna eget tincidunt tincidunt, tortor mauris consectetur nisi, id dictum nibh magna ac neque. Donec sed bibendum lorem, eu laoreet nibh. Cras porttitor ultrices elit sit amet efficitur. Suspendisse semper sit amet est vel commodo. Fusce consectetur est faucibus neque scelerisque, sit amet commodo erat accumsan. Cras vel lectus in libero laoreet tempor vitae nec elit.\n" +
                    "\n" +
                    "Morbi eu sodales tortor, ac facilisis lectus. In vitae nisi in nisi convallis ornare. Integer volutpat elit ac est sagittis feugiat. Praesent nec suscipit ligula. Ut viverra lorem eu volutpat iaculis. Aliquam malesuada gravida posuere. Duis id dui vel turpis venenatis consequat. Suspendisse ultrices sollicitudin justo nec iaculis."
        ),
        Product(
            id = 2,
            name = "Cables UTP",
            price = 35.00,
            imageUrl = "https://www.securame.com/images/c_utp2.png",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque dignissim pulvinar turpis a euismod. Morbi placerat pellentesque enim, rutrum porttitor metus tincidunt facilisis. Integer sit amet augue risus. In a dui urna. Proin id commodo tortor, mattis dignissim nisl. Vivamus accumsan id metus et semper. Etiam eget nisi sit amet ipsum hendrerit elementum eu nec sapien. Sed vehicula ex ut lectus sodales lobortis. Aenean convallis sapien dolor, cursus fermentum nisi dignissim ac. Curabitur facilisis, urna eget tincidunt tincidunt, tortor mauris consectetur nisi, id dictum nibh magna ac neque. Donec sed bibendum lorem, eu laoreet nibh. Cras porttitor ultrices elit sit amet efficitur. Suspendisse semper sit amet est vel commodo. Fusce consectetur est faucibus neque scelerisque, sit amet commodo erat accumsan. Cras vel lectus in libero laoreet tempor vitae nec elit.\n" +
                    "\n" +
                    "Morbi eu sodales tortor, ac facilisis lectus. In vitae nisi in nisi convallis ornare. Integer volutpat elit ac est sagittis feugiat. Praesent nec suscipit ligula. Ut viverra lorem eu volutpat iaculis. Aliquam malesuada gravida posuere. Duis id dui vel turpis venenatis consequat. Suspendisse ultrices sollicitudin justo nec iaculis."
        ),
        Product(
            id = 3,
            name = "Impresora 3D",
            price = 350.50,
            imageUrl = "https://bigrep.com/wp-content/uploads/2018/08/one-home.png",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque dignissim pulvinar turpis a euismod. Morbi placerat pellentesque enim, rutrum porttitor metus tincidunt facilisis. Integer sit amet augue risus. In a dui urna. Proin id commodo tortor, mattis dignissim nisl. Vivamus accumsan id metus et semper. Etiam eget nisi sit amet ipsum hendrerit elementum eu nec sapien. Sed vehicula ex ut lectus sodales lobortis. Aenean convallis sapien dolor, cursus fermentum nisi dignissim ac. Curabitur facilisis, urna eget tincidunt tincidunt, tortor mauris consectetur nisi, id dictum nibh magna ac neque. Donec sed bibendum lorem, eu laoreet nibh. Cras porttitor ultrices elit sit amet efficitur. Suspendisse semper sit amet est vel commodo. Fusce consectetur est faucibus neque scelerisque, sit amet commodo erat accumsan. Cras vel lectus in libero laoreet tempor vitae nec elit.\n" +
                    "\n" +
                    "Morbi eu sodales tortor, ac facilisis lectus. In vitae nisi in nisi convallis ornare. Integer volutpat elit ac est sagittis feugiat. Praesent nec suscipit ligula. Ut viverra lorem eu volutpat iaculis. Aliquam malesuada gravida posuere. Duis id dui vel turpis venenatis consequat. Suspendisse ultrices sollicitudin justo nec iaculis."
        )
    )

    fun getProducts(): MutableList<Product> {
        return productList
    }
}