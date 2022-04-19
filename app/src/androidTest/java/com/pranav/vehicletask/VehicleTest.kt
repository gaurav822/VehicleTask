package com.pranav.vehicletask

import junit.framework.TestCase.assertNotNull
import org.junit.Test
import junit.framework.TestCase.assertEquals


class VehicleTest {

    @Test
    fun sut(){
        val v = getSportVehicle()
        assertNotNull(v)
    }

    @Test
    fun sutEco(){
        val eco = getEconomicVehicle()
        assertNotNull(eco)
    }

    @Test
    fun vehicle_should_start_on_start(){
        var vehicle = getSportVehicle()
        var result = vehicle.start()
        assertEquals(result,"sports running...")

    }

    @Test
    fun design_new_sports_vehicle(){
        var sportVehicle = getSportVehicle()
        var tyre = Tyre(tyreType = "tubeless", hasExtraOnBack = true)
        sportVehicle.tyre = tyre
        sportVehicle.engineType = "petrol"
        sportVehicle.gear=6
        sportVehicle.price=1000000
        sportVehicle.color="green"
        sportVehicle.start()
        assertEquals(sportVehicle.isOn,true)

    }

    @Test
    fun design_new_economic_vehicle(){
        var economicVehicle = getEconomicVehicle()
        var tyre = Tyre(tyreType = "tubeless", hasExtraOnBack = false)
        economicVehicle.tyre = tyre
        economicVehicle.engineType = "diseal"
        economicVehicle.gear=5
        economicVehicle.price=2000000
        economicVehicle.start()
        assertEquals(economicVehicle.isOn,true)
    }

    private fun getSportVehicle() : SportVehicle{
        return SportVehicle()
    }

    private fun getEconomicVehicle() : EconomicVehicle{
        return EconomicVehicle()
    }

    private fun getVehicleDetails(vehicle: Vehicle){

    }
}