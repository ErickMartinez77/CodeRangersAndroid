package edu.upb.coderangersandroid.model

import java.io.Serializable

class User(val username: String, var firstName: String, var lastName: String, val profilePictureUrl: String) : Serializable {}
