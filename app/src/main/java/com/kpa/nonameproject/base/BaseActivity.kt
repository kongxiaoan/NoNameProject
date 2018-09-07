package com.kpa.nonameproject.base

import android.support.v7.app.AppCompatActivity
/**
 *author: mr.kong
 *Date:2018/9/7
 *description:
 *project name:NoNameProject
 **/
open class BaseActivity : AppCompatActivity() {
    val dataListName = arrayListOf("获取网络图片", "获取网页代码", "获取xml并且多种方式解析"
            , "获取json并解析", "单线程下载大文件", "多线程下载大文件", "多线程断点续传大文件", "get方式提交数据", "post方式提交数据",
            "通过Http协议上传文件", "TCP/IP协议与Socket通信", "Socket协议断点续传", "流行的框架")
}