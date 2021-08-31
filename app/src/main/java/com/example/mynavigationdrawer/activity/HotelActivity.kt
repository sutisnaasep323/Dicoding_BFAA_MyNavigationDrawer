package com.example.mynavigationdrawer.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynavigationdrawer.R

class HotelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)

        supportActionBar?.title = "Hotel Activity"
    }
}