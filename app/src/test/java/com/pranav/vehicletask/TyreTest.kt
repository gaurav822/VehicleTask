package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TyreTest{

    @Test
    fun whenTyreComponentsIsValid(){
        val durability= 100
        val diameter = 0.5
        val thickness = 2.0
        val type = "tubeless"
        val speedRating = 'H'
        val result = Tyre(durability = durability, diameter = diameter, thickNess = thickness, type = type, speedRating = speedRating)
            .validateTyre()
        assertEquals(result,true)
    }

    @Test
    fun whenTyreComponentsIsInValid(){
        val durability= 0
        val diameter = 0.5
        val thickness = 2.0
        val type = "tubeless"
        val speedRating = 'H'
        val result = Tyre(durability = durability, diameter = diameter, thickNess = thickness, type = type, speedRating = speedRating)
            .validateTyre()
        assertEquals(result,false)
    }


}