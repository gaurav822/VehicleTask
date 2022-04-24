package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)

class EngineTest{

    @Test
    fun whenEngineComponentIsValid(){
        var engine =  Engine()
        engine.type = "petrol"
        engine.fuelCapacity = 25
        engine.power = 200
        //engine.mileage = 40
        var result = engine.validateEngine()
        assertEquals(result,true)
    }

    @Test
    fun whenEngineComponentIsInvalid(){
        var engine =  Engine()
        engine.type = "petrol"
        engine.fuelCapacity = 25
        engine.power = 200
        //engine.mileage = 40
        var result = engine.validateEngine()
        assertEquals(result,false)
    }
}