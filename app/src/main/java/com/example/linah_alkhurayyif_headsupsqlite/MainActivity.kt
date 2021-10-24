package com.example.linah_alkhurayyif_headsupsqlite


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNewCelebrity.setOnClickListener {
            startActivity(Intent(this, AddCelebrities::class.java))
        }
    }
}