package com.example.aula10

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buttonAdd: Button
    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check3: CheckBox
    private lateinit var rButton1: RadioButton
    private lateinit var rButton2: RadioButton
    private lateinit var rButton3: RadioButton
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1 = findViewById(R.id.checkBox1)
        check2 = findViewById(R.id.checkBox2)
        check3 = findViewById(R.id.checkBox3)

        rButton1 = findViewById(R.id.radio_button1)
        rButton2 = findViewById(R.id.radio_button2)
        rButton3 = findViewById(R.id.radio_button3)

        radioGroup = findViewById(R.id.radioGroup)

        buttonAdd = findViewById<Button>(R.id.button_Add)
        var count: Int = 0

        buttonAdd.text = savedInstanceState?.getString("KEY_TEXT") ?: "0"

        buttonAdd.setOnClickListener {
            count++
            buttonAdd.text = count.toString()
        }
        radioButton()
        check()
    }

    private fun radioButton() {
        radioGroup.apply {
            setOnCheckedChangeListener { _, i ->
                when (i) {
                    rButton1.id -> {
                        Toast.makeText(context, "Radio 1", Toast.LENGTH_SHORT).show()
                    }
                    rButton2.id -> {
                        Toast.makeText(context, "Radio 2", Toast.LENGTH_SHORT).show()
                    }
                    rButton3.id -> {
                        Toast.makeText(context, "Radio 3", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun check() {
        check1.apply {
            setOnCheckedChangeListener { _, i ->
                if (isChecked) Toast.makeText(context, "check 1 ON", Toast.LENGTH_SHORT).show()
                else Toast.makeText(context, "check 1 OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val text = buttonAdd.text.toString()
        println(text)
        outState.putString("KEY_TEXT", text)
    }
}