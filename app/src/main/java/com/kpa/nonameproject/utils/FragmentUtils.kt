package com.kpa.nonameproject.utils

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.kpa.nonameproject.base.DataListName
/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
@SuppressLint("StaticFieldLeak")
object FragmentUtils {
    private lateinit var mContext: Context
    fun init(context: Context) {
        if (!FragmentUtils::mContext.isInitialized) {
            this.mContext = context
        }
    }


    fun <T> add(fragmentManager: FragmentManager, fragment: Fragment, @IdRes intRed: Int, vararg args: T) {
        val list = arrayListOf<T>()
        for (t in args) {
            list.add(t)
        }
        val beginTransaction = fragmentManager.beginTransaction()
        val bundle = Bundle()
        bundle.putSerializable(DataListName.COMMON_FRAGMENT_TAG.toString(), list)
        fragment.arguments = bundle
        beginTransaction.replace(intRed, fragment)
        beginTransaction.commit()
    }
}