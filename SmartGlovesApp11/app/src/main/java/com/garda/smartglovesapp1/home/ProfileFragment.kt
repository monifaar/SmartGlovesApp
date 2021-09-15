package com.garda.smartglovesapp1.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.databinding.FragmentProfileBinding
import com.garda.smartglovesapp1.profile.ProfileImgActivity
import com.garda.smartglovesapp1.profile.model.UserModel
import com.garda.smartglovesapp1.profile.model.UserPreference

class ProfileFragment : Fragment() {

    lateinit var img_btn: ImageButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      img_btn = view.findViewById(R.id.img_btn)

    }



    companion object {
        private const val REQUEST_CODE = 100

        fun newInstance(): ProfileFragment{
            val fragment = ProfileFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }





}