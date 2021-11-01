package edu.upb.coderangersandroid

import android.app.Application
import androidx.room.Room
import edu.upb.coderangersandroid.data.favorites.FavoritesRepository
import edu.upb.coderangersandroid.data.favorites.persistency.FavoritesPersistencyController
import edu.upb.coderangersandroid.data.favorites.persistency.FavoritesPersistencyControllerImp
import edu.upb.coderangersandroid.data.user.UserRepository
import edu.upb.coderangersandroid.data.user.network.UserNetworkController
import edu.upb.coderangersandroid.data.user.network.UserNetworkControllerImp
import edu.upb.coderangersandroid.databases.AppDatabase
import edu.upb.coderangersandroid.model.Favorite
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App: Application() {
    companion object{
        lateinit var db: AppDatabase
    }

    val appModule= module {
        single<FavoritesPersistencyController>{FavoritesPersistencyControllerImp()}
        single{ FavoritesRepository(get()) }
        single<UserNetworkController>{ UserNetworkControllerImp() }
        single{ UserRepository(get()) }
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, AppDatabase::class.java, "app-db").build()

        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }
}