package com.example.mudandoactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonReturn = findViewById<Button>(R.id.button_Two)

        if (intent?.action == Intent.ACTION_SEND && intent?.type == "text/plain") {
            val text = intent?.getStringExtra(Intent.EXTRA_TEXT)
            val textView = findViewById<TextView>(R.id.txtShare)
            textView.text = text
        }


        buttonReturn.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java).apply {
            }
            startActivity(intent)
        }
    }
}