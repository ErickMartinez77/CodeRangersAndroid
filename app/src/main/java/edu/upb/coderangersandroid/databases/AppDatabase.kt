package edu.upb.coderangersandroid.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.upb.coderangersandroid.databases.daos.FavoriteDao
import edu.upb.coderangersandroid.databases.daos.PostsDao
import edu.upb.coderangersandroid.model.Favorite
import edu.upb.coderangersandroid.model.Post

@Database(entities = [Post::class, Favorite::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun postsDao(): PostsDao
    abstract fun favoritesDao(): FavoriteDao
}