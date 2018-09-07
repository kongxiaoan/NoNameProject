package com.kpa.nonameproject.base

import android.app.Application
import com.kpa.nonameproject.utils.FragmentUtils

/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FragmentUtils.init(this)
    }
}