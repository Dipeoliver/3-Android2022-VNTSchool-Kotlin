package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.buttonOne.setText("CLicar")
        binding.textView.text = "Casa"
        setContentView(binding.root)
    }
}