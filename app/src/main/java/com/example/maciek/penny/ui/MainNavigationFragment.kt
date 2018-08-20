package com.example.maciek.penny.ui

interface MainNavigationFragment {

    fun onBackPressed(): Boolean {
        return false
    }

    fun onUserInteraction() {}
    
}