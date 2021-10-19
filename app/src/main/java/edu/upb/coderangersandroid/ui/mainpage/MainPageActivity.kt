package edu.upb.coderangersandroid.ui.mainpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.ui.mainpage.tabs.feed.FeedFragment
import edu.upb.coderangersandroid.ui.mainpage.tabs.ProfileFragment
import edu.upb.coderangersandroid.ui.mainpage.tabs.StoreFragment

class MainPageActivity : AppCompatActivity() {

    private val profileFragment = ProfileFragment()
    private val feedFragment = FeedFragment()
    private val storeFragment = StoreFragment()

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        supportActionBar?.hide()

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_cont) as NavHostFragment
        val navController = navHostFragment?.navController
        bottomNavigationView.setupWithNavController(navController)


    }
}