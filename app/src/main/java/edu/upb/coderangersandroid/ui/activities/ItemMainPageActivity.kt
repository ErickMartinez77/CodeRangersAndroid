package edu.upb.coderangersandroid.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.upb.coderangersandroid.R

class ItemMainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_item_feed)
    }
}