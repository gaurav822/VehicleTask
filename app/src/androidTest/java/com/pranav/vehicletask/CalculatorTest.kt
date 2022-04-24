package com.pranav.vehicletask

import android.media.Image
import junit.framework.TestCase
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Test

class CalculatorTest {

    @Test
    fun testCalculator(){
        val calculator = Calculator()
        val result = calculator.parse("2 - 2")
        assertEquals(4,result)
    }

    @Test
    fun testDivideBy2(){
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1,result)

    }

    @Test
    fun sut(){
        val vehicle = getSut()
        assertNotNull(vehicle)

    }

    @Test
    fun helicopter_should_start_on_start(){
        val vehicle = getSut()
        var result = vehicle.start()
        assertEquals(result, "starting..")

    }


    @Test
    fun helicopter_speed_is_zero_when_starting(){
        val vehicle = getSut()
        var result = vehicle.start()
        assertEquals(vehicle.getSpeed(), 0)

    }


    @Test
    fun helicopter_should_fly_when_speed_is_300(){
        val vehicle = getSut()
        vehicle.start()
        var result = vehicle.setSpeed(300)
        assertEquals(vehicle.getSpeed(), 300)
12
    }

    fun getSut():Helicoptor {
        return  Helicoptor()
    }

}
