package com.icdut.cdut;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentPerson extends Fragment implements OnClickListener {

	Intent intent;
	private Button btnStudent;
	private Button btnTeacher;

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
				.inflate(R.layout.fragment_person, container, false);
		return view;
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		init();
	}

	private void init() {
		btnStudent = (Button) getActivity().findViewById(R.id.btn_student);
		btnTeacher = (Button) getActivity().findViewById(R.id.btn_teacher);
		btnStudent.setOnClickListener(this);
		btnTeacher.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_student:
			intentActivity(Uri.parse("http://202.115.133.186/Login.html"));//学生登陆
			break;

		case R.id.btn_teacher:
			intentActivity(Uri.parse("http://202.115.133.172/Login.html"));//教师登陆
			break;
		}
	}
	private void intentActivity(Uri uri) {
		intent=new Intent();
		intent.setAction(Intent.ACTION_VIEW);
		intent.setData(uri);
		startActivity(intent);
	}
}