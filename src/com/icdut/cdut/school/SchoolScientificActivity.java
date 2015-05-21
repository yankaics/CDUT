package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
//科学研究
public class SchoolScientificActivity extends Activity implements
		OnClickListener {

	private TextView tv_scientific_geological;
	private TextView tv_scientific_reservoir;
	private TextView tv_scientific_geo_disaster;
	private TextView tv_scientific_geo_engineering;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_scientific);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		tv_scientific_geological = (TextView) findViewById(R.id.tv_scientific_geological);
		tv_scientific_reservoir = (TextView) findViewById(R.id.tv_scientific_reservoir);
		tv_scientific_geo_disaster = (TextView) findViewById(R.id.tv_scientific_geo_disaster);
		tv_scientific_geo_engineering = (TextView) findViewById(R.id.tv_scientific_geo_engineering);
		// 设置监听
		tv_scientific_geological.setOnClickListener(this);
		tv_scientific_reservoir.setOnClickListener(this);
		tv_scientific_geo_disaster.setOnClickListener(this);
		tv_scientific_geo_engineering.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_scientific_geological:
			intentActivity(Uri.parse("http://www.igs.cdut.edu.cn/"));//地质调查
			break;
		case R.id.tv_scientific_reservoir:
			intentActivity(Uri.parse("http://www.sklg.cdut.edu.cn/"));//油气藏地质
			break;
		case R.id.tv_scientific_geo_disaster:
			intentActivity(Uri.parse("http://www.sklgp.com/"));//地质灾害
			break;
		case R.id.tv_scientific_geo_engineering:
			intentActivity(Uri.parse("http://www.dzgc.cdut.edu.cn/index.html"));//地质工程
			break;
		}
	}
	//点击不同的textview显示不同的接卖弄
	private void intentActivity(Uri uri) {
		Intent intent=new Intent();
		intent.setAction(Intent.ACTION_VIEW);
		intent.setData(uri);
		startActivity(intent);
	}
}
