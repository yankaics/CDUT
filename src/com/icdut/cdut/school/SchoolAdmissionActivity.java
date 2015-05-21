package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SchoolAdmissionActivity extends Activity implements
		OnClickListener {

	private TextView tv_admission_specialized;
	private TextView tv_admission_graduate;
	private TextView tv_admission_adult_education;
	private TextView tv_admission_recruitment;
	private TextView tv_admission_international_recruitment;
	private TextView tv_admission_employment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_admission);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		tv_admission_specialized = (TextView) findViewById(R.id.tv_admission_specialized);
		tv_admission_graduate = (TextView) findViewById(R.id.tv_admission_graduate);
		tv_admission_adult_education = (TextView) findViewById(R.id.tv_admission_adult_education);
		tv_admission_recruitment = (TextView) findViewById(R.id.tv_admission_recruitment);
		tv_admission_international_recruitment = (TextView) findViewById(R.id.tv_admission_international_recruitment);
		tv_admission_employment = (TextView) findViewById(R.id.tv_admission_employment);
		// 设置监听
		tv_admission_specialized.setOnClickListener(this);
		tv_admission_graduate.setOnClickListener(this);
		tv_admission_adult_education.setOnClickListener(this);
		tv_admission_recruitment.setOnClickListener(this);
		tv_admission_international_recruitment.setOnClickListener(this);
		tv_admission_employment.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_admission_specialized:
			intentActivity(Uri.parse("http://www.zs.cdut.edu.cn/"));//本科生招生
			break;
		case R.id.tv_admission_graduate:
			intentActivity(Uri.parse("http://www.gra.cdut.edu.cn/index.html"));//研究生招生
			break;
		case R.id.tv_admission_adult_education:
			intentActivity(Uri.parse("http://www.jjy.cdut.edu.cn/jxjy/cjzsjz.aspx"));//成教生招生
			break;
		case R.id.tv_admission_recruitment:
			intentActivity(Uri.parse("http://www.jjy.cdut.edu.cn/c6.aspx"));//自考招生
			break;
		case R.id.tv_admission_international_recruitment:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/type/020300010505.html"));//留学生招生
			break;
		case R.id.tv_admission_employment:
			intentActivity(Uri.parse("http://www.jy.cdut.edu.cn/"));//就业信息
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
