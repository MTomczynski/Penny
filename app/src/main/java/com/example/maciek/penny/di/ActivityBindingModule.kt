package com.example.maciek.penny.di

import com.example.maciek.penny.MainActivity
import dagger.Module

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    internal abstract fun mainActivity() : MainActivity

}