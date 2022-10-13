package com.example.aula20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText

    private lateinit var messageButton: Button

    private lateinit var textMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.edt_name1)
        messageButton = findViewById(R.id.button_show_message)
        textMessage = findViewById(R.id.text_message)

        messageButton.setOnClickListener {
        val name = editTextName.text.toString()
            textMessage.text =  getString(R.string.hello, name)
        }

        editTextName.addTextChangedListener { text ->
            if (text?.isBlank() == true) {
                messageButton.visibility = View.INVISIBLE
            }else{
                messageButton.visibility = View.VISIBLE
            }
        }
    }
}