package com.icdut.cdut.school;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.icdut.cdut.R;

//ʦ�ʶ���ҳ��
public class SchoolFacultiesActivity extends Activity{
	
	private TextView tv_school_faculties;
	
	private  String textContent="		ѧУʼ�ռ�ֵ����˲ţ������ƽ��˲�ǿУս�ԣ�����ʵʩ�˲Ź��̣�ͨ����Щ��Ľ���ͷ�չ��ѧУʦ�ʶ�������ˮƽ�����������𲽽�����һ֧�ṹ��������������ҵ�������ȶ��ͳ���������ʦ�ʶ��顣����2013��4�£�ѧУ���н�ְ��2200���ˣ����и��߼�������ְ��697�ˣ�����˶ʿ������ѧλ1352�ˡ�ѧУ���й���Ժѧ���������Ա1�ˡ�ȫ���ܳ�רҵ�����˲�1�ˡ����Ҽ���ͻ�����׵�������ר��1�ˡ�����Ժ����������������23�ˡ�������������ѧ����Ƹ���ڡ�1�ˡ������͡���ǧ���˲Ź��̡����Ҽ���ѡ5�ˡ��Ĵ�ʡѧ���ͼ�����ͷ��19�ˡ��Ĵ�ʡ��ͻ�����׵�����ר��19�ˡ��Ĵ�ʡѧ���ͼ�����ͷ�˺���ѡ37�ˣ����ҽܳ������ѧ��������2�ˡ����ҡ�973����Ŀ��ϯ��ѧ��1�ˡ��й�����Ƽ��������3�ˡ���������У�����ʦ�������1�ˡ���ѡ�������������������˲������ƻ����͡������������˲�֧�ּƻ���7�ˡ��Ĵ�ʡ����Ƽ��������8�ˡ��Ĵ�ʡ�Ƽ��ܳ����׽������1�ˡ����Ĺ���ʿ�ѧ�������1�ˡ���Ӣ�������ʦ�������5�ˡ��Ƽ���������ʿ�ѧ�����������3�ˣ����Ҽ���ѧ�Ŷ�1���������������Ŷ�1�����Ĵ�ʡʡ����У�����Ŷ�5�����Ĵ�ʡ�Ƽ������Ŷ�2��;�Ĵ�ʡ�����˼ƻ���������Ŀ1�ˡ�������Ŀ1�ˡ�������Ŀ3�ˡ�";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_faculties);
		init();
	}

	private void init() {
		tv_school_faculties=(TextView) findViewById(R.id.tv_school_faculties);
		tv_school_faculties.setText(textContent);
	}
}
