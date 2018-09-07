package com.kpa.nonameproject.common

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kpa.nonameproject.R
import com.kpa.nonameproject.base.BaseActivity
import com.kpa.nonameproject.image.RequestImageFragment
import com.kpa.nonameproject.utils.FragmentUtils
import kotlinx.android.synthetic.main.common_activity.*

/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class SharedActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.common_activity)
        val index = intent.getIntExtra(INTENT_NAME_INDEX, -1)
        when (index) {
            0 -> {
                dataListName[index]
                FragmentUtils.add(supportFragmentManager,RequestImageFragment.newInstance(),R.id.common_shared_fl,{index})
            }
        }
    }

    companion object {
        const val INTENT_NAME_INDEX = "index"
        fun startActivity(context: Context, index: Int) {
            val intent = Intent(context, SharedActivity::class.java)
            intent.putExtra(INTENT_NAME_INDEX, index)
            context.startActivity(intent)
        }
    }

}
