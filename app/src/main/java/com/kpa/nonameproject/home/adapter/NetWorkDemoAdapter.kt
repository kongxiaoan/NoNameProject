package com.kpa.nonameproject.home.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.kpa.nonameproject.R
/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class NetWorkDemoAdapter(data: MutableList<String>) : BaseQuickAdapter<String, BaseViewHolder>(R.layout.home_recycle_item, data) {
    override fun convert(helper: BaseViewHolder, item: String) {
        helper.getView<TextView>(R.id.home_recycle_item_tv).text = item
    }
}