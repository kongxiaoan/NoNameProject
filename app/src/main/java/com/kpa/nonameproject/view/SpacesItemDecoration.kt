package com.kpa.nonameproject.view

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
class SpacesItemDecoration(private var top: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        outRect.top = top
    }
}