package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Post

object TempDataSource {
    val postList = mutableListOf<Post>(
        Post(
            publisher = "Plomero" ,
            shortDescription = "Plomero con 5 años de experiencia en construcciones de edificios y casas",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfrCpMwWuUX7RQ9faN1IGzuRlnSFInU75oNg&usqp=CAU",
            ownerName = "Mauricio Ayllon",
            phone = 75409548
        ),
        Post(
            publisher = "Mecánico" ,
            shortDescription = "Se arregla cualquier tipo de automóvil, tanto caja mecánica como automática ",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxuisYgMzkRXLWAHEGr0nv1JRa_Xc9XeSVJA&usqp=CAU",
            ownerName = "Mauricio vejarano",
            phone = 71446548
        ),
        Post(
            publisher = "Pintor" ,
            shortDescription = "Se pinta dormitorios, cocinas, hasta Fachadas externas",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRf0_jpp2Q_YqBzpGYmfC7NqGTFEs3qni2OKg&usqp=CAU",
            ownerName = "Erick Martinez",
            phone = 73098346
        ),
        Post(
            publisher = "Servicio Técnico de Celulares" ,
            shortDescription = "Se arreglan celulares android y Ios",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9UPPb129gDteN5FtcoXbUWWXjByYVnhAKsg&usqp=CAU",
            ownerName = "Jorge Lopez",
            phone = 72900043
        ),
        Post(
            publisher = "Jardinero" ,
            shortDescription = "Superviso las plantas de su jardin así como los espacios verdes",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRw0nk5mw8CWiieHqekvsl_bttQhDcVWy6goQ&usqp=CAU",
            ownerName = "Kevin Pomier",
            phone = 74637899
        )
    )
}