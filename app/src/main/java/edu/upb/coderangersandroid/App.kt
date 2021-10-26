package edu.upb.coderangersandroid

import android.app.Application
import androidx.room.Room
import edu.upb.coderangersandroid.databases.AppDatabase

class App: Application() {
    companion object{
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, AppDatabase::class.java, "app-db").build()
    }
}