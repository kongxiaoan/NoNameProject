package com.kpa.nonameproject.image

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kpa.nonameproject.R
import com.kpa.nonameproject.base.DataListName

/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class RequestImageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_request_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = arguments!!.getSerializable(DataListName.COMMON_FRAGMENT_TAG.toString()) as MutableList<*>
        list.forEach {
            print("传递过来的值 = ${it.toString()}")
        }
        init(view)
    }

    private fun init(view: View) {

    }

    companion object {
        fun newInstance(): RequestImageFragment = RequestImageFragment()
    }
}
