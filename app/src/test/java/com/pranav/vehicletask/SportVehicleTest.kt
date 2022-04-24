package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class SportVehicleTest{

    @Test
    fun whenComponentIsValid(){
        val tyre = EconomicVehicleTest().getTyre()
        val engine = EconomicVehicleTest().getEngine()
        val sportVehicle = SportVehicle(tyre = tyre, engine = engine)
        sportVehicle.gear=Constants.SPORTS_GEAR
        sportVehicle.color="yellow"
        sportVehicle.price = Constants.SPORTS_CAR_PRICE
        val result = sportVehicle.validateSportVehicle()
        assertEquals(result,true)
    }

    @Test
    fun whenComponentIsInvalid(){
        val tyre = EconomicVehicleTest().getTyre()
        val engine = EconomicVehicleTest().getEngine()
        val sportVehicle = SportVehicle(tyre = tyre, engine = engine)
        val result = sportVehicle.validateSportVehicle()
        assertEquals(result,false)
    }
}