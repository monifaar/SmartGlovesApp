package com.garda.smartglovesapp1.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.garda.smartglovesapp1.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private val mOnNavigation = BottomNavigationView.OnNavigationItemSelectedListener {item ->
    when(item.itemId) {
        R.id.nav_home -> {
            val fragment = HomeFragment.newInstance()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }

        R.id.nav_loc -> {
            val fragment = LocationFragment.newInstance()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }

        R.id.nav_profile -> {
            val fragment = LocationFragment.newInstance()
            addFragment(fragment)
            return@OnNavigationItemSelectedListener true
        }
    }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigation)
        val fragment = LocationFragment.newInstance()
        addFragment(fragment)
    }
}