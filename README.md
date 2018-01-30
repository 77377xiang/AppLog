# AppLog
封装 log
封装 applog 自己的 库

 日志记录功能，能记录各种日志，包括各种级别VERBOSE,DEBUG, INFO, WARN, ERROR，如果调整级别，将相应的隐藏日志的打印 
 日志提供打印到文件中的功能，每个进程打印一个文件，可以为特定的日志指定单独打印到一个文件中 
 根据APP是Debug还是Release 状态自动的开启关闭日志打印功能 
 提供日志打开关闭的开关 
 日志文件可上传至指定的服务器  需要自己实现
 日志打印到文件中格式必须记录 那个文件(那个类)， 那个方法，多少行等信息
 
 
    
        使用  
        项目 的 build.gradle
        
        maven { url "https://jitpack.io" }

       app 的 build.gradle

      dependencies { compile 'com.github.77377xiang:AppLog:v1.0' }
  
  
  
  
 
     RuntimeEnv.init(this); // 初始化运行时 相关信息日志库
     
       LogManager.openLog(false); //  日志开关 release  默认不打开
       
       LogManager.writeFile(true); // 释放写入文件  默认写入

        // 获得错误  再次打开app 返回自己服务
        
        File crashFile = LogManager.getCrashFile();
        
        if (crashFile!=null){
        
            LogManager.d("MyAppLaction", "文件名称："+crashFile.getName() + "文件路经"+crashFile.getPath() );
            
            // 做上传
        }
        
        
        
        
     
