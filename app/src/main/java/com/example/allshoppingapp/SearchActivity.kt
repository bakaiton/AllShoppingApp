package com.example.allshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_search.*
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchButton.setOnClickListener{
            finish()
            val intent = Intent(application, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}