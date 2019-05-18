package com.example.weatherapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


/// Models of daily forecast API
data class Coordinate(var lat: Float,var long: Float)

data class City(var name : String, var country : String,var coord : Coordinate) : Serializable

data class Weather(@SerializedName("dt") var date : Int
                   ,var temp: Temp
                   ,var pressure: Float
                   ,var humidity: Float
                   ,var weatherDetails : MutableList<WeatherDetail>) :Serializable

data class Temp(var day: Float
                ,var min:Float
                ,var max:Float
                ,var night:Float
                ,var eve:Float
                ,var morn:Float) :Serializable

data class WeatherDetail(var main: String
                         ,var desc : String
                         ,var icon : String) : Serializable

/// End

