package com.garda.smartglovesapp1.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.databinding.FragmentProfileBinding
import com.garda.smartglovesapp1.profile.model.UserModel
import com.garda.smartglovesapp1.profile.model.UserPreference

class ProfileFragment : Fragment() {

//    lateinit var img_profile: ImageButton
//
//    private lateinit var mUserPreference: UserPreference
//
//    private var isPreferenceEmpty = false
//    private lateinit var userModel: UserModel
//
//    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        img_profile = view.findViewById(R.id.img_profile)
//        img_profile.setOnClickListener {
//
//
//        }
//        binding = FragmentProfileBinding.inflate(layoutInflater)
//        binding.root
//
//        mUserPreference = UserPreference(view.context)
//        showExistingPreference()
    }

//    private fun showExistingPreference() {
//        userModel = mUserPreference.getUser()
//        populateView(userModel)
//        checkForm(userModel)
//    }
//
//    private fun checkForm(userModel: UserModel) {
//        TODO("Not yet implemented")
//    }
//
//    private fun populateView(userModel: UserModel) {
//        binding.tvName.text = if (userModel.name.toString().isEmpty()) "Tidak Ada" else userModel.name
//    }

    companion object {
        fun newInstance(): ProfileFragment{
            val fragment = ProfileFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}