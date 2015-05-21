package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SchoolCultivationActivity extends Activity implements
		OnClickListener {

	private TextView tv_shcool_cultivation_undergraduate;
	private TextView tv_cultivation_postgraduate;
	private TextView tv_cultivation_specialized;
	private TextView tv_cultivation_continuing;
	private TextView tv_cultivation_international;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_cultivation);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		tv_shcool_cultivation_undergraduate = (TextView) findViewById(R.id.tv_shcool_cultivation_undergraduate);
		tv_cultivation_postgraduate = (TextView) findViewById(R.id.tv_cultivation_postgraduate);
		tv_cultivation_specialized = (TextView) findViewById(R.id.tv_cultivation_specialized);
		tv_cultivation_continuing = (TextView) findViewById(R.id.tv_cultivation_continuing);
		tv_cultivation_international = (TextView) findViewById(R.id.tv_cultivation_international);
		// 设置监听
		tv_shcool_cultivation_undergraduate.setOnClickListener(this);
		tv_cultivation_postgraduate.setOnClickListener(this);
		tv_cultivation_specialized.setOnClickListener(this);
		tv_cultivation_continuing.setOnClickListener(this);
		tv_cultivation_international.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_shcool_cultivation_undergraduate:
			intentActivity(Uri.parse("http://www.aao.cdut.edu.cn/aao/"));//本科生教育
			break;
		case R.id.tv_cultivation_postgraduate:
			intentActivity(Uri.parse("http://www.gra.cdut.edu.cn/index.html"));//研究生教育
			break;
		case R.id.tv_cultivation_specialized:
			intentActivity(Uri.parse("http://www.yyjs.cdut.edu.cn/"));//专科生教育
			break;
		case R.id.tv_cultivation_continuing:
			intentActivity(Uri.parse("http://www.jjy.cdut.edu.cn/"));//继续教育
			break;
		case R.id.tv_cultivation_international:
			intentActivity(Uri.parse("http://www.zy.cdut.edu.cn/"));//国际教育
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
