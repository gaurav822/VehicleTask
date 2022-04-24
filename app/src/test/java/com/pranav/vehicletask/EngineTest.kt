package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)

class EngineTest{

    @Test
    fun whenEngineComponentIsValid(){
        val type = "petrol"
        val fuelCapacity = 25
        val power = 200
        val mileage = 40
        val result = Engine(type, fuelCapacity, power, mileage).validateEngine()
        assertEquals(result,true)
    }

    @Test
    fun whenEngineComponentIsInvalid(){
        val type = "petrol"
        val fuelCapacity = 25
        val power = 100
        val mileage = 40
        val result = Engine(type, fuelCapacity, power, mileage).validateEngine()
        assertEquals(result,false)
    }
}