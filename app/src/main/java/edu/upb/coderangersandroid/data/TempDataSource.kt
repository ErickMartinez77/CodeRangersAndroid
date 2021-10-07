package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Post

object TempDataSource {
    val postList = mutableListOf<Post>(
        Post(
            publisher = "Plomer" ,
            shortDescription = "Plomero con 5 años de experiencia en construcciones de edificios y casas",
            imageUrl = ""
        ),
        Post(
            publisher = "Mecanico" ,
            shortDescription = "Se arregla cualquier tipo de automóvil, tanto caja mecánica como automática ",
            imageUrl = ""
        ),
        Post(
            publisher = "Pintor" ,
            shortDescription = "Se pinta dormitorios, cocinas, hasta Fachadas externas",
            imageUrl = ""
        ),
        Post(
            publisher = "Servicio Técnico de Celulares" ,
            shortDescription = "Se arreglan celulares android y Ios",
            imageUrl = ""
        ),
        Post(
            publisher = "Jardinero" ,
            shortDescription = "Superviso las plantas de su jardin así como los espacios verdes",
            imageUrl = ""
        )
    )
}