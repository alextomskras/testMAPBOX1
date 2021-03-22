package com.dreamer.testmapbox1


import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.preference.PreferenceManager
import com.dreamer.testmapbox1.data.provider.LocationProvider
import com.dreamer.testmapbox1.data.provider.LocationProviderImpl
import com.google.android.gms.location.LocationServices
import com.jakewharton.threetenabp.AndroidThreeTen
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import com.dreamer.testmapbox1.BuildConfig;
import timber.log.Timber

const val LENGTH_LONG = 1
const val LENGTH_SHORT = 0

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
        checkFirstRun();
        Timber.plant(Timber.DebugTree())
    }

    private fun checkFirstRun() {
        val PREFS_NAME = "MyPrefsFile"
        val PREF_VERSION_CODE_KEY = "version_code"
        val DOESNT_EXIST = -1

        // Get current version code
        val currentVersionCode = BuildConfig.VERSION_CODE

        // Get saved version code
        val prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
        val savedVersionCode = prefs.getInt(PREF_VERSION_CODE_KEY, DOESNT_EXIST)

        // Check for first run or upgrade
        if (currentVersionCode == savedVersionCode) {
            toastCreate(getString(R.string.This_is_just_a_normal_run))
            // This is just a normal run
//            Toast.makeText(
//                this,
//                getString(R.string.This_is_just_a_normal_run),
//                Toast.LENGTH_LONG
//            ).show()
            return
        } else if (savedVersionCode == DOESNT_EXIST) {
            toastCreate(getString(R.string.This_Is_A_new_Install))
//            Toast.makeText(
//                this,
//                getString(R.string.This_Is_A_new_Install),
//                Toast.LENGTH_LONG
//            ).show()
            //This is a new install (or the user cleared the shared preferences)
        } else if (currentVersionCode > savedVersionCode) {
            toastCreate(getString(R.string.This_is_an_upgrade))
//            Toast.makeText(
//                this,
//                getString(R.string.This_is_an_upgrade),
//                Toast.LENGTH_LONG
//            ).show()
            //This is an upgrade
        }

        // Update the shared preferences with the current version code
        prefs.edit().putInt(PREF_VERSION_CODE_KEY, currentVersionCode).apply()
    }

    fun toastCreate(message: String) = Toast.makeText(
        this,
        message.toString().trim(),
        Toast.LENGTH_LONG
    ).show()
}