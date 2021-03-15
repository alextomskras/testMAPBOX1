package com.dreamer.testmapbox1.data.provider

interface LocationProvider {

    //    suspend fun hasLocationChanged(lastWeatherLocation: Coord?): Boolean
    suspend fun getPreferredLocationString(): String
//    suspend fun getPreferredLocationString1(): MutableList<String>
}