package com.example.maciek.penny.di

import com.example.maciek.penny.MainApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApplication) = application.applicationContext

}