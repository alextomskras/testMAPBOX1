package com.dreamer.testmapbox1.ui.dashboard

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dreamer.testmapbox1.ui.MainActivity
import com.dreamer.testmapbox1.R
import com.dreamer.testmapbox1.data.*
import com.mapbox.geojson.Feature
import com.mapbox.geojson.FeatureCollection
import com.mapbox.geojson.LineString
import com.mapbox.geojson.Point
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.Style
import com.mapbox.mapboxsdk.style.layers.LineLayer
import com.mapbox.mapboxsdk.style.layers.Property
import com.mapbox.mapboxsdk.style.layers.PropertyFactory
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var mapView: MapView? = null
    private lateinit var activity: MainActivity


    private var trekCoordinates: List<Point>? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as MainActivity
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        activity?.let { Mapbox.getInstance(it, getString(R.string.mapbox_access_token)) }
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })


//        setContentView(R.layout.activity_main)

        mapView = root.findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync { mapboxMap ->

//            mapboxMap.setStyle(Style.MAPBOX_STREETS) {
//
//// Map is set up and the style has loaded. Now you can add data or make other map adjustments
//                mapboxMap?.addMarker(
//                    MarkerOptions()
//                        .position(LatLng(48.85819, 2.29458))
//                        .title("Eiffel Tower")
//                )
//
//            }
            mapboxMap.setStyle(
                Style.OUTDOORS
            ) { style ->
                initRouteCoordinates()

                // Create the LineString from the list of coordinates and then make a GeoJSON
                // FeatureCollection so we can add the line to our map as a layer.
                style.addSource(
                        GeoJsonSource(
                                "line-source",
                                FeatureCollection.fromFeatures(
                                        arrayOf(
                                                Feature.fromGeometry(
//                                    LineString.fromLngLats(routeCoordinates!!)
                                                        LineString.fromLngLats(trekCoordinates!!)
                                                )
                                        )
                                )
                        )
                )

                // The layer properties for our line. This is where we make the line dotted, set the
                // color, etc.
                style.addLayer(
                    LineLayer("linelayer", "line-source").withProperties(
                        PropertyFactory.lineDasharray(arrayOf(0.01f, 2f)),
                        PropertyFactory.lineCap(Property.LINE_CAP_ROUND),
                        PropertyFactory.lineJoin(Property.LINE_JOIN_ROUND),
                        PropertyFactory.lineWidth(5f),
                        PropertyFactory.lineColor(Color.parseColor("#e55e5e"))
                    )
                )
            }

        }
        return root

    }

    @SuppressLint("Range")
    private fun initRouteCoordinates() {
        // Create a list to store our line coordinates.
        // Create a list to store our line coordinates.
        trekCoordinates = trek7().initTrekCoordinates()

    }

    override fun onResume() {
        super.onResume()
        mapView!!.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView!!.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView!!.onStop()
    }

    override fun onPause() {
        super.onPause()
        mapView!!.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView!!.onLowMemory()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        mapView?.onDestroy()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView!!.onDestroy()
    }

//    protected fun onSaveInstanceState(outState: Bundle?) {
//        super.onSaveInstanceState(outState!!)
//        mapView!!.onSaveInstanceState(outState)
//    }
}