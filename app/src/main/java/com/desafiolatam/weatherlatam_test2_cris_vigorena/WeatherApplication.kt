package com.desafiolatam.weatherlatam_test2_cris_vigorena

import android.app.Application
import com.desafiolatam.weatherlatam_test2_cris_vigorena.data.WeatherRepositoryImp
import com.desafiolatam.weatherlatam_test2_cris_vigorena.data.local.WeatherDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WeatherApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WeatherDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WeatherRepositoryImp(database.weatherDao()) }
}