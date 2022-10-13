package com.example.class21test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    internal class Calculator {
        fun sum(first: Int, second: Int) = first + second

        fun sub(first: Int, second: Int) = first - second

        fun div(first: Int, second: Int) = first / second

        fun parimpar(first: Int) = first % 2

        fun exponentiation(base: Double, exponent: Double): Double {
            return base.pow(exponent)
        }

        fun isPrimeNumber(number: Int): Boolean {
            for (i in 2..number / 2) {
                if (number % i == 0) {
                    return false
                }
            }
            return true
        }
    }
}