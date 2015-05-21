package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

//校园文化
public class SchoolCampusCultureActivity extends Activity implements
		OnClickListener {

	private TextView tv_school_campus_youth_league;
	private TextView tv_school_campus_post_bar;
	private TextView tv_school_digital_pay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_campus_culture);
		init();

	}

	private void init() {
		// TODO Auto-generated method stub
		tv_school_campus_youth_league = (TextView) findViewById(R.id.tv_school_campus_youth_league);
		tv_school_campus_post_bar = (TextView) findViewById(R.id.tv_school_campus_post_bar);
		tv_school_digital_pay = (TextView) findViewById(R.id.tv_school_digital_pay);
		tv_school_campus_youth_league.setOnClickListener(this);
		tv_school_campus_post_bar.setOnClickListener(this);
		tv_school_digital_pay.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_school_campus_youth_league:
			intentActivity(Uri.parse("http://youth.cdut.edu.cn/"));//团委
			break;
		case R.id.tv_school_campus_post_bar:
			intentActivity(Uri.parse("http://tieba.baidu.com/f?kw=%B3%C9%B6%BC%C0%ED%B9%A4%B4%F3%D1%A7&fr=ala0"));//贴吧
			break;
		case R.id.tv_school_digital_pay:
			intentActivity(Uri.parse("http://202.115.131.69/OnlinePay/Login.aspx"));//交电费
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
