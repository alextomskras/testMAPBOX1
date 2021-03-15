package com.dreamer.testmapbox1


import android.app.Application
import android.content.Context
import androidx.preference.PreferenceManager
import com.dreamer.testmapbox1.data.provider.LocationProvider
import com.dreamer.testmapbox1.data.provider.LocationProviderImpl
import com.dreamer.testmapbox1.ui.LoginActivity
import com.dreamer.testmapbox1.ui.MainActivity
import com.dreamer.testmapbox1.ui.RegisterActivity
import com.google.android.gms.location.LocationServices
import com.jakewharton.threetenabp.AndroidThreeTen
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class MapBoxApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@MapBoxApplication))

//       bind() from singleton { LoginActivity(instance()) }
//        bind() from singleton { RegisterActivity(instance())}
//        bind() from singleton { MainActivity(instance()) }
//        bind() from singleton { instance<ForecastDatabase>().weatherLocationDao() }
//        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
//        bind() from singleton { ApixuWeatherApiService(instance()) }
//        bind() from singleton { OpenWeatherApiService(instance()) }
//        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind() from provider { LocationServices.getFusedLocationProviderClient(instance<Context>()) }
        bind<LocationProvider>() with singleton { LocationProviderImpl(instance(), instance()) }
//        bind<ForecastRepository>() with singleton { ForecastRepositoryImpl(instance(), instance(), instance(), instance(), instance()) }
//        bind<UnitProvider>() with singleton { UnitProviderImpl(instance()) }
//        bind() from provider { CurrentWeatherViewModelFactory(instance(), instance()) }
//        bind() from provider { FutureListWeatherViewModelFactory(instance(), instance()) }
//        bind() from factory { detailDate: LocalDateTime -> FutureDetailWeatherViewModelFactory(detailDate, instance(), instance()) }

    }

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false)
    }
}