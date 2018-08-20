package com.example.maciek.penny

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.example.maciek.penny.ui.MainNavigationFragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var currentFragment: MainNavigationFragment

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                Timber.d("Opened home tab")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                Timber.d("Opened dashboard")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun <F> replaceFragment(fragment: F) where F : Fragment, F : MainNavigationFragment {
        supportFragmentManager
    }

    override fun onBackPressed() {
        if(!currentFragment.onBackPressed()) {
            super.onBackPressed()
        }
    }


    override fun onUserInteraction() {
        super.onUserInteraction()
        currentFragment.onUserInteraction()
    }
}
