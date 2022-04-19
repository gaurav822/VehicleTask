package com.pranav.vehicletask

import junit.framework.TestCase
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun testCalculator(){
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4,result)
    }

    @Test
    fun testDivideBy2(){
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1,result)

    }

}
