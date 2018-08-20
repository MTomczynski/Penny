package com.example.maciek.penny.util

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

//todo WAT?
inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}