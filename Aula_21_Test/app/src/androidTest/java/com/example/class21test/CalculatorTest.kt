package com.example.class21test

import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    private val calculator = MainActivity.Calculator()

    @Test
    fun sum1() {
        val expected = 6
        val result = calculator.sum(first = 3, second = 3)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun sum2() {
        val expected = -4
        val result = calculator.sum(-2, -2)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun sub1() {
        val expected = 0
        val result = calculator.sub(10, 10)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun div1() {
        val expected = 2
        val result = calculator.div(10, 5)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun parimpar1() {
        val expected = 0
        val result = calculator.parimpar(10)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun parimpar2() {
        val expected = 1
        val result = calculator.parimpar(11)
        Assert.assertEquals(expected, result)
    }

    @Test
    fun `test if 2 raised to 2nd power returns 4`() {
        val result = calculator.exponentiation(base = 2.0, exponent = 2.0)
        Assert.assertEquals(4.0, result, 0.0)
    }

    @Test
    fun `test if 2 raised to 10 power returns 1024`() {
        val result = calculator.exponentiation(base = 2.0, exponent = 10.0)
        Assert.assertEquals(1024.0, result, 0.0)
    }

    @Test
    fun `test if a prime number returns true`() {
        val result = calculator.isPrimeNumber(number = 7)
        Assert.assertTrue(result)
    }

    @Test
    fun `test if a composite number returns false`() {
        val result = calculator.isPrimeNumber(number = 10)
        Assert.assertFalse(result)
    }
}