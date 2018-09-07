package com.kpa.nonameproject.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.kpa.nonameproject.R
import com.kpa.nonameproject.base.BaseActivity
import com.kpa.nonameproject.common.SharedActivity
import com.kpa.nonameproject.home.adapter.NetWorkDemoAdapter
import com.kpa.nonameproject.view.SpacesItemDecoration
import kotlinx.android.synthetic.main.home_activity.*
/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        homeMainActivityRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        homeMainActivityRv.addItemDecoration(SpacesItemDecoration(10))
        val netWorkDemoAdapter = NetWorkDemoAdapter(dataListName)
        homeMainActivityRv.adapter = netWorkDemoAdapter
        netWorkDemoAdapter.setOnItemClickListener { adapter, view, position ->
            SharedActivity.startActivity(this,position)
        }
    }

}
