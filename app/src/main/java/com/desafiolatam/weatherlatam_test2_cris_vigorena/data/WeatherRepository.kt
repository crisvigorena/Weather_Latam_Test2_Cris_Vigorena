package com.desafiolatam.weatherlatam_test2_cris_vigorena.data

import com.desafiolatam.weatherlatam_test2_cris_vigorena.data.remote.ServiceResponse
import com.desafiolatam.weatherlatam_test2_cris_vigorena.model.WeatherDto
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getRemoteWeatherData(): Flow<ServiceResponse<WeatherDto?>>
    suspend fun getWeatherData(): Flow<List<WeatherDto>?>
    suspend fun getWeatherDataById(id: Int): Flow<WeatherDto?>
    suspend fun insertData(weatherDto: WeatherDto)
    suspend fun clearAll()
}