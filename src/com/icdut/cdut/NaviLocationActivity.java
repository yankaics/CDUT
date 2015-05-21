package com.icdut.cdut;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BaiduMap.OnMapClickListener;
import com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;

public class NaviLocationActivity extends Activity {

	private Context context;
	MapView mapView = null;

	private Button btn_locate_self;
	private Button btn_overlays;
	// 地图定位
	private LocationClient mLocationClient;
	private MyLocationListener mLocationListener;
	private BaiduMap mBaiduMap;
	// 判断是否为第一次定位
	private boolean isFirstIn = true;
	// 定位模式
	private LocationMode tempMode = LocationMode.Battery_Saving;

	// 记录经纬度
	private double mLatitude;
	private double mLongtitude;

	// 覆盖物相关
	private BitmapDescriptor mMarker;
	private RelativeLayout mMakerLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		SDKInitializer.initialize(getApplicationContext());
		setContentView(R.layout.navi_location);
		context = this;
		iniMap();
		iniLocation();
		initMarker();
		
		btn_overlays.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				addOverlays(NaviInfo.infos);
			}
		});

		mBaiduMap.setOnMarkerClickListener(new OnMarkerClickListener() {

			@Override
			public boolean onMarkerClick(Marker marker) {
				// TODO Auto-generated method stub
				Bundle extraInfo = marker.getExtraInfo();
				NaviInfo info = (NaviInfo) extraInfo.getSerializable("info");
				Log.i("info", info.getName());
				ImageView iv = (ImageView) findViewById(R.id.maker_imageView);
				TextView tvMarkerName = (TextView)findViewById(R.id.tv_info_name);
				
				iv.setImageResource(info.getImgId());
				tvMarkerName.setText(info.getName());
				
				
				return true;
			}
		});

		mBaiduMap.setOnMapClickListener(new OnMapClickListener() {

			@Override
			public boolean onMapPoiClick(MapPoi arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void onMapClick(LatLng arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	private void initMarker() {
		// TODO Auto-generated method stub
		mMarker = BitmapDescriptorFactory.fromResource(R.drawable.maker);
		mMakerLayout = (RelativeLayout) findViewById(R.layout.maker_info);
	}

	// 添加覆盖物
	private void addOverlays(List<NaviInfo> infos) {
		mBaiduMap.clear();
		LatLng latLng = null;
		Marker marker = null;
		OverlayOptions options;

		for (NaviInfo info : infos) {
			// 经纬度
			latLng = new LatLng(info.getLatitude(), info.getLongtitude());
			Log.i("latitude", info.getLatitude() + "");
			Log.i("longtitude", info.getLongtitude() + "");
			// 图标
			options = new MarkerOptions().position(latLng).icon(mMarker)
					.zIndex(5);
			marker = (Marker) mBaiduMap.addOverlay(options);
			Bundle arg0 = new Bundle();
			arg0.putSerializable("info", info);
			marker.setExtraInfo(arg0);
		}

		MapStatusUpdate msu = MapStatusUpdateFactory.newLatLng(latLng);
		mBaiduMap.setMapStatus(msu);

	}

	private void iniLocation() {
		// TODO Auto-generated method stub
		// 初始化
		mLocationClient = new LocationClient(this);
		mLocationListener = new MyLocationListener();
		mLocationClient.registerLocationListener(mLocationListener);

		LocationClientOption option = new LocationClientOption();
		option.setLocationMode(tempMode);// 设置定位模式
		option.setCoorType("bd09ll");// 返回的定位结果是百度经纬度，默认值gcj02
		int span = 1000;// 隔时间请求
		option.setScanSpan(span);// 设置发起定位请求的间隔时间为5000ms
		option.setOpenGps(true);
		option.setIsNeedAddress(true);
		mLocationClient.setLocOption(option);
		btn_locate_self.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 定位到我的位置
				centerToMyLocation();
			}
		});
	}

	// 定位到我的位置
	private void centerToMyLocation() {
		// TODO Auto-generated method stub
		LatLng latlng = new LatLng(mLatitude, mLongtitude);
		MapStatusUpdate msu = MapStatusUpdateFactory.newLatLng(latlng);
		mBaiduMap.animateMapStatus(msu);
	}

	private void iniMap() {
		// TODO Auto-generated method stub
		mapView = (MapView) findViewById(R.id.bmapView);
		btn_locate_self = (Button) findViewById(R.id.btn_locate_self);
		btn_overlays = (Button) findViewById(R.id.btn_overlays);
		mBaiduMap = mapView.getMap();
		MapStatusUpdate msu = MapStatusUpdateFactory.zoomTo(15.0f);
		mBaiduMap.setMapStatus(msu);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		mapView.onResume();
	}

	@Override
	protected void onStart() {
		// 开启定位
		super.onStart();
		mBaiduMap.setMyLocationEnabled(true);
		// 开始定位
		if (!mLocationClient.isStarted())
			mLocationClient.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mapView.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		// 停止定位
		mBaiduMap.setMyLocationEnabled(false);
		mLocationClient.stop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mapView.onDestroy();
	}

	public class MyLocationListener implements BDLocationListener {

		@Override
		public void onReceiveLocation(BDLocation location) {
			MyLocationData data = new MyLocationData.Builder()
					.accuracy(location.getRadius())//
					.latitude(location.getLatitude())//
					.longitude(location.getLongitude())//
					.build();

			mBaiduMap.setMyLocationData(data);

			// 定位成功更新经纬度
			mLatitude = location.getLatitude();
			mLongtitude = location.getLongitude();

			if (isFirstIn) {
				// 是第一定位，将地图中心点移动到当前定位位置
				LatLng latlng = new LatLng(location.getLatitude(),
						location.getLongitude());
				MapStatusUpdate msu = MapStatusUpdateFactory.newLatLng(latlng);
				mBaiduMap.animateMapStatus(msu);

				// 设置比例尺为最小
				float f = mBaiduMap.getMaxZoomLevel();// 19.0
				// float m = mBaiduMap.getMinZoomLevel();//3.0
				MapStatusUpdate u = MapStatusUpdateFactory.newLatLngZoom(
						latlng, f - 2);
				mBaiduMap.animateMapStatus(u);
				isFirstIn = false;
				Toast.makeText(context, location.getAddrStr(),
						Toast.LENGTH_SHORT).show();
			}
		}

	}
}
