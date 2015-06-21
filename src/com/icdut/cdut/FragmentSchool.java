package com.icdut.cdut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.icdut.cdut.school.SchoolAdmissionActivity;
import com.icdut.cdut.school.SchoolCampusCultureActivity;
import com.icdut.cdut.school.SchoolContentActivity;
import com.icdut.cdut.school.SchoolCultivationActivity;
import com.icdut.cdut.school.SchoolDigitalCampusActivity;
import com.icdut.cdut.school.SchoolDisciplineActivity;
import com.icdut.cdut.school.SchoolFacultiesActivity;
import com.icdut.cdut.school.SchoolOrganizationActivity;
import com.icdut.cdut.school.SchoolScientificActivity;

public class FragmentSchool extends Fragment implements OnClickListener {

	// 定义控件
	private TextView tv_introduction;// 学校概况
	private TextView tv_organization;// 组织机构
	private TextView tv_faculties;// 师资队伍
	private TextView tv_cultivation;// 人才培养
	private TextView tv_admission_employment;// 招生就业
	private TextView tv_scientific_research;// 科学研究
	private TextView tv_discipline_construction;// 学科建设
	private TextView tv_digital_campus;// 数字校园
	private TextView tv_campus_culture;// 校园文化

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater
				.inflate(R.layout.fragment_shcool, container, false);
		return view;
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		init();
	}

	// 初始化绑定控件
	private void init() {
		// TODO Auto-generated method stub
		
		tv_introduction = (TextView) getActivity().findViewById(
				R.id.tv_introduction);
		tv_organization = (TextView) getActivity().findViewById(
				R.id.tv_organization);
		tv_faculties = (TextView) getActivity().findViewById(R.id.tv_faculties);

		tv_cultivation = (TextView) getActivity().findViewById(
				R.id.tv_cultivation);
		tv_admission_employment = (TextView) getActivity().findViewById(
				R.id.tv_admission_employment);
		tv_scientific_research = (TextView) getActivity().findViewById(
				R.id.tv_scientific_research);

		tv_discipline_construction = (TextView) getActivity().findViewById(
				R.id.tv_discipline_construction);
		tv_digital_campus = (TextView) getActivity().findViewById(
				R.id.tv_digital_campus);
		tv_campus_culture = (TextView) getActivity().findViewById(
				R.id.tv_campus_culture);
		// 设置监听
		tv_introduction.setOnClickListener(this);
		tv_organization.setOnClickListener(this);
		tv_faculties.setOnClickListener(this);
		tv_cultivation.setOnClickListener(this);
		tv_admission_employment.setOnClickListener(this);
		tv_scientific_research.setOnClickListener(this);
		tv_discipline_construction.setOnClickListener(this);
		tv_digital_campus.setOnClickListener(this);
		tv_campus_culture.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		case R.id.tv_introduction:
			Toast.makeText(getActivity(), "学校概况", Toast.LENGTH_SHORT).show();	
			Intent intent1=new Intent(getActivity(),SchoolContentActivity.class);
			startActivity(intent1);
			break;
		case R.id.tv_organization:
			Toast.makeText(getActivity(), "组织机构", Toast.LENGTH_SHORT).show();
			Intent intent2=new Intent(getActivity(),SchoolOrganizationActivity.class);
			startActivity(intent2);
			break;
		case R.id.tv_faculties:
			Toast.makeText(getActivity(), "师资队伍", Toast.LENGTH_SHORT).show();
			Intent intent3=new Intent(getActivity(),SchoolFacultiesActivity.class);
			startActivity(intent3);
			break;
		case R.id.tv_cultivation:
			Toast.makeText(getActivity(), "人才培养", Toast.LENGTH_SHORT).show();
			Intent intent4=new Intent(getActivity(),SchoolCultivationActivity.class);
			startActivity(intent4);
			break;
		case R.id.tv_admission_employment:
			Toast.makeText(getActivity(), "招生就业", Toast.LENGTH_SHORT).show();
			Intent intent5=new Intent(getActivity(),SchoolAdmissionActivity.class);
			startActivity(intent5);
			break;
		case R.id.tv_scientific_research:
			Toast.makeText(getActivity(), "科学研究", Toast.LENGTH_SHORT).show();
			Intent intent6=new Intent(getActivity(),SchoolScientificActivity.class);
			startActivity(intent6);
			break;
		case R.id.tv_discipline_construction:
			Toast.makeText(getActivity(), "学科建设", Toast.LENGTH_SHORT).show();
			Intent intent7=new Intent(getActivity(),SchoolDisciplineActivity.class);
			startActivity(intent7);
			break;
		case R.id.tv_digital_campus:
			Toast.makeText(getActivity(), "数字校园", Toast.LENGTH_SHORT).show();
			Intent intent8=new Intent(getActivity(),SchoolDigitalCampusActivity.class);
			startActivity(intent8);
			break;
		case R.id.tv_campus_culture:
			Toast.makeText(getActivity(), "校园文化", Toast.LENGTH_SHORT).show();
			Intent intent9=new Intent(getActivity(),SchoolCampusCultureActivity.class);
			startActivity(intent9);
			break;

		}
	}
}
