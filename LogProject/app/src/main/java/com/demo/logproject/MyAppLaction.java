package com.demo.logproject;

import android.app.Application;


import com.log.library.common.RuntimeEnv;
import com.log.library.log.LogManager;

import java.io.File;

/**
 * Created by hexiang on 18/1/30.
 */

public class MyAppLaction extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RuntimeEnv.init(this); // 初始化运行时 相关 信息
        LogManager.openLog(false); //  日志开关 release  默认不不打开
        LogManager.writeFile(true); // 释放写入文件  默认写入

        // 获得错误  返回自己服务
        File crashFile = LogManager.getCrashFile();
        if (crashFile!=null){
            LogManager.d("MyAppLaction", "文件名称："+crashFile.getName() + "文件路经"+crashFile.getPath() );
        }
    }






}


