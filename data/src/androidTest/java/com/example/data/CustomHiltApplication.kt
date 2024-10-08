package com.example.data

import android.app.Application
import android.util.Log
import dagger.hilt.android.testing.CustomTestApplication
import timber.log.Timber

open class CustomHiltApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.i("애플리케이션 생성 후 비즈니스 로직 수행")
    }
}

@CustomTestApplication(CustomHiltApplication::class)
interface MyCustom{

}
