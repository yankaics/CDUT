package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

//����У԰
public class SchoolDigitalCampusActivity extends Activity implements
		OnClickListener {

	private TextView tv_school_digital_library;

	private TextView tv_school_digital_archives;
	private TextView tv_school_digital_museum;
	private TextView tv_school_digital_financial;
	private TextView tv_school_digtial_news;
	private TextView tv_school_digital_image_network;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_digital_campus);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		tv_school_digital_library = (TextView) findViewById(R.id.tv_school_digital_library);
		tv_school_digital_archives = (TextView) findViewById(R.id.tv_school_digital_archives);
		tv_school_digital_museum = (TextView) findViewById(R.id.tv_school_digital_museum);
		tv_school_digital_financial = (TextView) findViewById(R.id.tv_school_digital_financial);
		tv_school_digtial_news = (TextView) findViewById(R.id.tv_school_digtial_news);
		tv_school_digital_image_network = (TextView) findViewById(R.id.tv_school_digital_image_network);

		// ���ü���
		tv_school_digital_library.setOnClickListener(this);
		tv_school_digital_archives.setOnClickListener(this);
		tv_school_digital_museum.setOnClickListener(this);
		tv_school_digital_financial.setOnClickListener(this);
		tv_school_digtial_news.setOnClickListener(this);
		tv_school_digital_image_network.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_school_digital_library:
			intentActivity(Uri.parse("http://www.lib.cdut.edu.cn/"));//����ͼ���
			break;
		case R.id.tv_school_digital_archives:
			intentActivity(Uri.parse("http://www.archive.cdut.edu.cn/"));//���ֵ�����
			break;
		case R.id.tv_school_digital_museum:
			intentActivity(Uri.parse("http://www.museum.cdut.edu.cn/"));//���ֲ����
			break;
		case R.id.tv_school_digital_financial:
			intentActivity(Uri.parse("http://www.jcc.cdut.edu.cn/financeIndex/index.jsp"));//���ֲ���
			break;
		case R.id.tv_school_digtial_news:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/xww/default.html"));//������
			break;
		case R.id.tv_school_digital_image_network:
			intentActivity(Uri.parse("http://photo.cdut.edu.cn/photo/index.php"));//ͼƬ��
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
