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
//    lateinit var tv_name: TextView
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
      img_btn = view.findViewById(R.id.img_btn)
      img_btn.setOnClickListener {
          requireActivity().run{
              startActivity(Intent(this, ProfileImgActivity::class.java))
              finish()
          }
      }
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

//    private fun checkForm(userModel: UserModel) {
//        when {
//            userModel.name.toString().isNotEmpty() -> {
//                binding.tvName.text = getString(R.string.change)
//                isPreferenceEmpty = false
//            }
//            else -> {
//                binding.tvName.text = getString(R.string.save)
//                isPreferenceEmpty = true
//            }
//        }
//    }

//    private fun populateView(userModel: UserModel) {
//        binding.tvName.text = if (userModel.name.toString().isEmpty()) "Tidak Ada" else userModel.name
//    }

    companion object {
        private const val REQUEST_CODE = 100

        fun newInstance(): ProfileFragment{
            val fragment = ProfileFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

//    override fun onClick(v: View?) {
//        if (view?.id == R.id.img_btn) {
//            val intent = Intent(context, ProfileImgActivity::class.java)
//            when {
//                isPreferenceEmpty -> {
//                    intent.putExtra(ProfileImgActivity.EXTRA_TYPE_FORM, ProfileImgActivity.TYPE_ADD)
//                    intent.putExtra("USER", userModel)
//                }
//                else -> {
//                    intent.putExtra(ProfileImgActivity.EXTRA_TYPE_FORM, ProfileImgActivity.TYPE_EDIT)
//                    intent.putExtra("USER", userModel)
//                }
//            }
//            startActivityForResult(intent, REQUEST_CODE)
//        }
//    }


//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == REQUEST_CODE) {
//            if (resultCode == ProfileImgActivity.RESULT_CODE) {
//                userModel = data?.getParcelableExtra<UserModel>(ProfileImgActivity.EXTRA_RESULT) as UserModel
//                populateView(userModel)
//                checkForm(userModel)
//            }
//        }
//    }
}