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
        val tyre = getTyre()
        val tyreResult = tyre.validateTyre()
        //engine
        var engine = getEngine()
        var engineResult = engine.validateEngine()

        //remaining components
        val gear = Constants.ECO_GEAR
        val color = "red"
        val price = 1000000
        val vehicle = EconomicVehicle(tyre = tyre,gear=gear,color=color,price=price, speed = 0, engine = engine, isOn =
        false)
        val vehicleResult = vehicle.validateEconomicVehicle()
        assertEquals(tyreResult && engineResult && vehicleResult,true)

    }

    @Test
    fun whenVehicleComponentIsInValid(){
        //tyre
        val tyre = getTyre()
        val tyreResult = tyre.validateTyre()
        //engine
        var engine = getEngine()
        var engineResult = engine.validateEngine()

        //remaining components
        val gear = 10
        val color = "red"
        val price = Constants.ECO_CAR_PRICE
        val vehicle = EconomicVehicle(gear=gear,color=color,price=price, speed = 0, engine = engine, isOn =
        false)
        val vehicleResult = vehicle.validateEconomicVehicle()
        //tyre is default to null value
        //so false will be expected
        assertEquals(tyreResult && engineResult && vehicleResult,false)
    }

     fun getTyre() : Tyre {
        val tyre = Tyre()
        tyre.durability= 100
        tyre.diameter = 0.5
        tyre.thickNess = 2.0
        tyre.type = "tubeless"
        tyre.speedRating = 'H'
        return tyre
    }

     fun getEngine() : Engine {
        var engine =  Engine()
        engine.type = "petrol"
        engine.fuelCapacity = 25
        engine.power = 200
        engine.mileage = 40
        return engine
    }
}