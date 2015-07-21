package com.d.stalker.extend;

import com.baidu.mapapi.SDKInitializer;

import android.app.Application;

public class StalkerApp extends Application{
	 @Override
	    public void onCreate() {
	    	 super.onCreate();
	        SDKInitializer.initialize(this);
	       
	        
	    }
}
