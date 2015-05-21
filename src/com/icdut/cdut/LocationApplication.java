package com.icdut.cdut;

import android.app.Application;

import com.baidu.location.LocationClient;
import com.icdut.cdut.NaviLocationActivity.MyLocationListener;

public class LocationApplication extends Application {

	private boolean isFirstIn=true;

	@Override
	public void onCreate() {
		super.onCreate();
	}
}
