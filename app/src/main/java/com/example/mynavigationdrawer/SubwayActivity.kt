package com.example.mynavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubwayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)

        supportActionBar?.title = "Nav Drawer 4.1.1"
    }
}