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

	// ����ؼ�
	private TextView tv_introduction;// ѧУ�ſ�
	private TextView tv_organization;// ��֯����
	private TextView tv_faculties;// ʦ�ʶ���
	private TextView tv_cultivation;// �˲�����
	private TextView tv_admission_employment;// ������ҵ
	private TextView tv_scientific_research;// ��ѧ�о�
	private TextView tv_discipline_construction;// ѧ�ƽ���
	private TextView tv_digital_campus;// ����У԰
	private TextView tv_campus_culture;// У԰�Ļ�

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

	// ��ʼ���󶨿ؼ�
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
		// ���ü���
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
			Toast.makeText(getActivity(), "ѧУ�ſ�", Toast.LENGTH_SHORT).show();	
			Intent intent1=new Intent(getActivity(),SchoolContentActivity.class);
			startActivity(intent1);
			break;
		case R.id.tv_organization:
			Toast.makeText(getActivity(), "��֯����", Toast.LENGTH_SHORT).show();
			Intent intent2=new Intent(getActivity(),SchoolOrganizationActivity.class);
			startActivity(intent2);
			break;
		case R.id.tv_faculties:
			Toast.makeText(getActivity(), "ʦ�ʶ���", Toast.LENGTH_SHORT).show();
			Intent intent3=new Intent(getActivity(),SchoolFacultiesActivity.class);
			startActivity(intent3);
			break;
		case R.id.tv_cultivation:
			Toast.makeText(getActivity(), "�˲�����", Toast.LENGTH_SHORT).show();
			Intent intent4=new Intent(getActivity(),SchoolCultivationActivity.class);
			startActivity(intent4);
			break;
		case R.id.tv_admission_employment:
			Toast.makeText(getActivity(), "������ҵ", Toast.LENGTH_SHORT).show();
			Intent intent5=new Intent(getActivity(),SchoolAdmissionActivity.class);
			startActivity(intent5);
			break;
		case R.id.tv_scientific_research:
			Toast.makeText(getActivity(), "��ѧ�о�", Toast.LENGTH_SHORT).show();
			Intent intent6=new Intent(getActivity(),SchoolScientificActivity.class);
			startActivity(intent6);
			break;
		case R.id.tv_discipline_construction:
			Toast.makeText(getActivity(), "ѧ�ƽ���", Toast.LENGTH_SHORT).show();
			Intent intent7=new Intent(getActivity(),SchoolDisciplineActivity.class);
			startActivity(intent7);
			break;
		case R.id.tv_digital_campus:
			Toast.makeText(getActivity(), "����У԰", Toast.LENGTH_SHORT).show();
			Intent intent8=new Intent(getActivity(),SchoolDigitalCampusActivity.class);
			startActivity(intent8);
			break;
		case R.id.tv_campus_culture:
			Toast.makeText(getActivity(), "У԰�Ļ�", Toast.LENGTH_SHORT).show();
			Intent intent9=new Intent(getActivity(),SchoolCampusCultureActivity.class);
			startActivity(intent9);
			break;

		}
	}
}
