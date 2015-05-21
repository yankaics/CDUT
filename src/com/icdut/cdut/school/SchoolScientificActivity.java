package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
//��ѧ�о�
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
		// ���ü���
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
			intentActivity(Uri.parse("http://www.igs.cdut.edu.cn/"));//���ʵ���
			break;
		case R.id.tv_scientific_reservoir:
			intentActivity(Uri.parse("http://www.sklg.cdut.edu.cn/"));//�����ص���
			break;
		case R.id.tv_scientific_geo_disaster:
			intentActivity(Uri.parse("http://www.sklgp.com/"));//�����ֺ�
			break;
		case R.id.tv_scientific_geo_engineering:
			intentActivity(Uri.parse("http://www.dzgc.cdut.edu.cn/index.html"));//���ʹ���
			break;
		}
	}
	//�����ͬ��textview��ʾ��ͬ�Ľ���Ū
	private void intentActivity(Uri uri) {
		Intent intent=new Intent();
		intent.setAction(Intent.ACTION_VIEW);
		intent.setData(uri);
		startActivity(intent);
	}
}
