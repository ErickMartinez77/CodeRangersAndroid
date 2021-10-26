package edu.upb.coderangersandroid.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.upb.coderangersandroid.databases.daos.PostsDao
import edu.upb.coderangersandroid.model.Post

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun postsDao(): PostsDao
}