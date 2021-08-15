package com.garda.smartglovesapp1.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.bluetooth.BluetoothActivity
import com.garda.smartglovesapp1.profile.ProfileImgActivity

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img_btn:ImageButton = view.findViewById(R.id.butut_btn)
        img_btn.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, BluetoothActivity::class.java))
                finish()
            }
        }
    }
    companion object {
        fun newInstance(): HomeFragment{
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}