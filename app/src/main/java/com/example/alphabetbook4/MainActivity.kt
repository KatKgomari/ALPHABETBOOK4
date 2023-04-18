package com.example.alphabetbook4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextPage(view: View){
        val intent = Intent(this, LetterPages::class.java)
        if (view != null) {
            intent.putExtra("imageID", view.id)
        }
        startActivity(intent)
    }

}