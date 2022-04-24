package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TyreTest{

    @Test
    fun whenTyreComponentsIsValid(){
        val tyre = Tyre()
        tyre.durability= 100
        tyre.diameter = 0.5
        tyre.thickNess = 2.0
        tyre.type = "tubeless"
        tyre.speedRating = Constants.speedRating.keys.elementAt(0)
        val result = tyre.validateTyre()
        assertEquals(result,true)
    }

    @Test
    fun whenTyreComponentsIsInValid(){
        val tyre = Tyre()
        //tyre.durability= 100
        //tyre.diameter = 0.5
        //tyre.thickNess = 2.0
        //tyre.type = "tubeless"
        //tyre.speedRating = 'H'
        val result = tyre.validateTyre()
        assertEquals(result,false)
    }


}