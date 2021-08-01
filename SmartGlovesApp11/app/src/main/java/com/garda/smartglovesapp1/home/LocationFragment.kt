package com.garda.smartglovesapp1.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.garda.smartglovesapp1.R


class LocationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

    companion object {
        fun newInstance(): LocationFragment{
            val fragment = LocationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}