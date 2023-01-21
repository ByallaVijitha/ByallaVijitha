package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle as AndroidOsBundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: AndroidOsBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}