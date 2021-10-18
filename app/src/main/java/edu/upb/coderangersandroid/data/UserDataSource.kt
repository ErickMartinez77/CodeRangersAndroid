package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.model.User

object UserDataSource {
    private var user: User? = User("username", "Erick", "Martinez", "")

    fun getUser(): User? {
        return user
    }

    fun setUser(user: User?) {
        this.user = user
    }
}