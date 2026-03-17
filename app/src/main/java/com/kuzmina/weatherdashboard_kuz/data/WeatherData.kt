package com.kuzmina.weatherdashboard_kuz.data

import android.health.connect.datatypes.units.Temperature

data class WeatherData(
    val temperature: Int? = null,
    val himidity: Int? = null,
    val windSpeed: Int? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)