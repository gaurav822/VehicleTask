package com.pranav.vehicletask

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class EconomicVehicleTest{

    @Test
    fun whenVehicleComponentIsValid(){
        //tyre
        val durability= 100
        val diameter = 0.5
        val thickness = 2.0
        val type = "tubeless"
        val speedRating = 'H'
        var tyre = Tyre(durability = durability, diameter = diameter, thickNess = thickness, type = type, speedRating =
        speedRating)
        val tyreResult = tyre.validateTyre()
        //engine
        val enginetype = "petrol"
        val fuelCapacity = 25
        val power = 200
        val mileage = 40
        val engine = Engine(enginetype, fuelCapacity, power, mileage)
        val engineResult = engine.validateEngine()

        //remaining components
        val gear = 5
        val color = "red"
        val price = 1000000
        val vehicle = EconomicVehicle(tyre = tyre,gear=gear,color=color,price=price, speed = 0, engine = engine, isOn =
        false)
        val vehicleResult = vehicle.validateEconomicVehicle()
        val finalResult = tyreResult && engineResult && vehicleResult
        assertEquals(finalResult,true)

    }

    @Test
    fun whenVehicleComponentIsInValid(){

    }

}