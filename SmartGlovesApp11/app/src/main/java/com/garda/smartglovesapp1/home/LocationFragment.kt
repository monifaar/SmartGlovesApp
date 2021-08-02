package com.garda.smartglovesapp1.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.garda.smartglovesapp1.R
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions



class LocationFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = view.findViewById<MapView>(R.id.mapView)
        mapFragment.getMapAsync(this)
        mapFragment.onCreate(arguments)
    }

    companion object {
        fun newInstance(): LocationFragment{
            val fragment = LocationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
//         Add a marker in Sydney and move the camera
        val uB = LatLng(-7.951916, 112.613896)
        mMap.addMarker(MarkerOptions().position(uB).title("Now in Brawijaya University"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uB))

    }
}