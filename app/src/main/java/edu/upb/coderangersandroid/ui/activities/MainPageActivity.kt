package edu.upb.coderangersandroid.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.ui.fragments.FeedFragment
import edu.upb.coderangersandroid.ui.fragments.ProfileFragment
import edu.upb.coderangersandroid.ui.fragments.StoreFragment

class MainPageActivity : AppCompatActivity() {

    private val profileFragment = ProfileFragment()
    private val feedFragment = FeedFragment()
    private val storeFragment = StoreFragment()

    lateinit var bottonNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        bottonNavigationView = findViewById(R.id.bottomNavigationView)
        bottonNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menuItemProfile -> {
                    replaceFragment(R.id.container,profileFragment)
                }
                R.id.menuItemFeed -> {
                    replaceFragment(R.id.container,feedFragment)
                }
                R.id.menuItemStore -> {
                    replaceFragment(R.id.container,storeFragment)
                }
            }
            true
        }
        bottonNavigationView.selectedItemId = R.id.menuItemFeed
    }
}