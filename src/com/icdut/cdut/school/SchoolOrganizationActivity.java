package com.icdut.cdut.school;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.icdut.cdut.R;
//组织机构
public class SchoolOrganizationActivity extends Activity implements
		OnClickListener {
	Intent intent;

	public Intent getIntent() {
		return intent;
	}

	// 定义组织机构页面的textview
	private TextView tv_organization_party_committee_office;
	private TextView tv_organization_party_membership_committee;
	private TextView tv_organization_discipline_inspection_office;
	private TextView tv_organization_school_party;
	private TextView tv_organization_propaganda_department;

	private TextView tv_organization_school_work;
	private TextView tv_organization_mental_health;
	private TextView tv_organization_armed_forces;
	private TextView tv_organization_school_union;
	private TextView tv_organization_school_committee;

	private TextView tv_organization_headmaster_office;
	private TextView tv_organization_student_affairs;
	private TextView tv_organization_security_office;
	private TextView tv_organization_graduate_faculty;
	private TextView tv_organization_personnel_division;

	private TextView tv_organization_present_plan;
	private TextView tv_organization_acdemic_affairs;
	private TextView tv_organization_sience_department;
	private TextView tv_organization_editors_center;
	private TextView tv_organization_audit_division;

	private TextView tv_organization_planing_office;
	private TextView tv_organization_general_services;
	private TextView tv_organization_lab_management;
	private TextView tv_organization_external_cooperation;
	private TextView tv_organization_campus_planning;

	private TextView tv_organization_retired_office;
	private TextView tv_organization_graduate_school;
	private TextView tv_organization_earth_sciences;
	private TextView tv_organization_energy_resources;
	private TextView tv_organization_environmental_civil_engineering;

	private TextView tv_organization_geophysical_institute;
	private TextView tv_organization_nuclear_technology;
	private TextView tv_organization_materials_chemical;
	private TextView tv_organization_administrative_science;
	private TextView tv_organization_politics;

	private TextView tv_organization_grammar_shcool;
	private TextView tv_organization_foreign_college;
	private TextView tv_organization_business_college;
	private TextView tv_organization_institute_science_art;
	private TextView tv_organization_physical_education;

	private TextView tv_organization_information_science;
	private TextView tv_organization_tourism;
	private TextView tv_organization_sedimentary;
	private TextView tv_organization_continuing_education;
	private TextView tv_organization_leshan_engineering;

	private TextView tv_organization_national_research_geological;
	private TextView tv_organization_disaster_prevention;
	private TextView tv_organization_geological_survey;
	private TextView tv_organization_library;
	private TextView tv_organization_archives;

	private TextView tv_organization_museum;
	private TextView tv_organization_infirmary;
	private TextView tv_organization_logistic_service_group;
	private TextView tv_organization_property;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_organization);
		init();
	}

	private void init() {
		tv_organization_party_committee_office = (TextView) findViewById(R.id.tv_organization_party_committee_office);
		tv_organization_party_membership_committee = (TextView) findViewById(R.id.tv_organization_party_membership_committee);
		tv_organization_discipline_inspection_office = (TextView) findViewById(R.id.tv_organization_discipline_inspection_office);
		tv_organization_school_party = (TextView) findViewById(R.id.tv_organization_school_party);
		tv_organization_propaganda_department = (TextView) findViewById(R.id.tv_organization_propaganda_department);

		tv_organization_school_work = (TextView) findViewById(R.id.tv_organization_school_work);
		tv_organization_mental_health = (TextView) findViewById(R.id.tv_organization_mental_health);
		tv_organization_armed_forces = (TextView) findViewById(R.id.tv_organization_armed_forces);
		tv_organization_school_union = (TextView) findViewById(R.id.tv_organization_school_union);
		tv_organization_school_committee = (TextView) findViewById(R.id.tv_organization_school_committee);

		tv_organization_headmaster_office = (TextView) findViewById(R.id.tv_organization_headmaster_office);
		tv_organization_student_affairs = (TextView) findViewById(R.id.tv_organization_student_affairs);
		tv_organization_security_office = (TextView) findViewById(R.id.tv_organization_security_office);
		tv_organization_graduate_faculty = (TextView) findViewById(R.id.tv_organization_graduate_faculty);
		tv_organization_personnel_division = (TextView) findViewById(R.id.tv_organization_personnel_division);

		tv_organization_present_plan = (TextView) findViewById(R.id.tv_organization_present_plan);
		tv_organization_acdemic_affairs = (TextView) findViewById(R.id.tv_organization_acdemic_affairs);
		tv_organization_sience_department = (TextView) findViewById(R.id.tv_organization_sience_department);
		tv_organization_editors_center = (TextView) findViewById(R.id.tv_organization_editors_center);
		tv_organization_audit_division = (TextView) findViewById(R.id.tv_organization_audit_division);

		tv_organization_planing_office = (TextView) findViewById(R.id.tv_organization_planing_office);
		tv_organization_general_services = (TextView) findViewById(R.id.tv_organization_general_services);
		tv_organization_lab_management = (TextView) findViewById(R.id.tv_organization_lab_management);
		tv_organization_external_cooperation = (TextView) findViewById(R.id.tv_organization_external_cooperation);
		tv_organization_campus_planning = (TextView) findViewById(R.id.tv_organization_campus_planning);

		tv_organization_retired_office = (TextView) findViewById(R.id.tv_organization_retired_office);
		tv_organization_graduate_school = (TextView) findViewById(R.id.tv_organization_graduate_school);
		tv_organization_earth_sciences = (TextView) findViewById(R.id.tv_organization_earth_sciences);
		tv_organization_energy_resources = (TextView) findViewById(R.id.tv_organization_energy_resources);
		tv_organization_environmental_civil_engineering = (TextView) findViewById(R.id.tv_organization_environmental_civil_engineering);

		tv_organization_geophysical_institute = (TextView) findViewById(R.id.tv_organization_geophysical_institute);
		tv_organization_nuclear_technology = (TextView) findViewById(R.id.tv_organization_nuclear_technology);
		tv_organization_materials_chemical = (TextView) findViewById(R.id.tv_organization_materials_chemical);
		tv_organization_administrative_science = (TextView) findViewById(R.id.tv_organization_administrative_science);
		tv_organization_politics = (TextView) findViewById(R.id.tv_organization_politics);

		tv_organization_grammar_shcool = (TextView) findViewById(R.id.tv_organization_grammar_shcool);
		tv_organization_foreign_college = (TextView) findViewById(R.id.tv_organization_foreign_college);
		tv_organization_business_college = (TextView) findViewById(R.id.tv_organization_business_college);
		tv_organization_institute_science_art = (TextView) findViewById(R.id.tv_organization_institute_science_art);
		tv_organization_physical_education = (TextView) findViewById(R.id.tv_organization_physical_education);

		tv_organization_information_science = (TextView) findViewById(R.id.tv_organization_information_science);
		tv_organization_tourism = (TextView) findViewById(R.id.tv_organization_tourism);
		tv_organization_sedimentary = (TextView) findViewById(R.id.tv_organization_sedimentary);
		tv_organization_continuing_education = (TextView) findViewById(R.id.tv_organization_continuing_education);
		tv_organization_leshan_engineering = (TextView) findViewById(R.id.tv_organization_leshan_engineering);

		tv_organization_national_research_geological = (TextView) findViewById(R.id.tv_organization_national_research_geological);
		tv_organization_disaster_prevention = (TextView) findViewById(R.id.tv_organization_disaster_prevention);
		tv_organization_geological_survey = (TextView) findViewById(R.id.tv_organization_geological_survey);
		tv_organization_library = (TextView) findViewById(R.id.tv_organization_library);
		tv_organization_archives = (TextView) findViewById(R.id.tv_organization_archives);

		tv_organization_museum = (TextView) findViewById(R.id.tv_organization_museum);
		tv_organization_infirmary = (TextView) findViewById(R.id.tv_organization_infirmary);
		tv_organization_logistic_service_group = (TextView) findViewById(R.id.tv_organization_logistic_service_group);
		tv_organization_property = (TextView) findViewById(R.id.tv_organization_property);

		// 设置监听

		tv_organization_party_committee_office.setOnClickListener(this);
		tv_organization_party_membership_committee.setOnClickListener(this);
		tv_organization_discipline_inspection_office.setOnClickListener(this);
		tv_organization_school_party.setOnClickListener(this);
		tv_organization_propaganda_department.setOnClickListener(this);

		tv_organization_school_work.setOnClickListener(this);
		tv_organization_mental_health.setOnClickListener(this);
		tv_organization_armed_forces.setOnClickListener(this);
		tv_organization_school_union.setOnClickListener(this);
		tv_organization_school_committee.setOnClickListener(this);

		tv_organization_headmaster_office.setOnClickListener(this);
		tv_organization_student_affairs.setOnClickListener(this);
		tv_organization_security_office.setOnClickListener(this);
		tv_organization_graduate_faculty.setOnClickListener(this);
		tv_organization_personnel_division.setOnClickListener(this);

		tv_organization_present_plan.setOnClickListener(this);
		tv_organization_acdemic_affairs.setOnClickListener(this);
		tv_organization_sience_department.setOnClickListener(this);
		tv_organization_editors_center.setOnClickListener(this);
		tv_organization_audit_division.setOnClickListener(this);

		tv_organization_planing_office.setOnClickListener(this);
		tv_organization_general_services.setOnClickListener(this);
		tv_organization_lab_management.setOnClickListener(this);
		tv_organization_external_cooperation.setOnClickListener(this);
		tv_organization_campus_planning.setOnClickListener(this);

		tv_organization_retired_office.setOnClickListener(this);
		tv_organization_graduate_school.setOnClickListener(this);
		tv_organization_earth_sciences.setOnClickListener(this);
		tv_organization_energy_resources.setOnClickListener(this);
		tv_organization_environmental_civil_engineering
				.setOnClickListener(this);

		tv_organization_geophysical_institute.setOnClickListener(this);
		tv_organization_nuclear_technology.setOnClickListener(this);
		tv_organization_materials_chemical.setOnClickListener(this);
		tv_organization_administrative_science.setOnClickListener(this);
		tv_organization_politics.setOnClickListener(this);

		tv_organization_grammar_shcool.setOnClickListener(this);
		tv_organization_foreign_college.setOnClickListener(this);
		tv_organization_business_college.setOnClickListener(this);
		tv_organization_institute_science_art.setOnClickListener(this);
		tv_organization_physical_education.setOnClickListener(this);

		tv_organization_information_science.setOnClickListener(this);
		tv_organization_tourism.setOnClickListener(this);
		tv_organization_sedimentary.setOnClickListener(this);
		tv_organization_continuing_education.setOnClickListener(this);
		tv_organization_leshan_engineering.setOnClickListener(this);

		tv_organization_national_research_geological.setOnClickListener(this);
		tv_organization_disaster_prevention.setOnClickListener(this);
		tv_organization_geological_survey.setOnClickListener(this);
		tv_organization_library.setOnClickListener(this);
		tv_organization_archives.setOnClickListener(this);

		tv_organization_museum.setOnClickListener(this);
		tv_organization_infirmary.setOnClickListener(this);
		tv_organization_logistic_service_group.setOnClickListener(this);
		tv_organization_property.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_organization_party_committee_office:
			intentActivity(Uri.parse("http://www.office.cdut.edu.cn/"));//党委办公室
			break;
		case R.id.tv_organization_party_membership_committee:
			intentActivity(Uri.parse("http://www.jfdw.cdut.edu.cn/"));//机关党委办公室
			break;
		case R.id.tv_organization_discipline_inspection_office:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/jw/default.html"));//纪委办公室
			break;
		case R.id.tv_organization_school_party:
			intentActivity(Uri.parse("http://www.zuzhibu.cdut.edu.cn/"));//组织部办公室
			break;
		case R.id.tv_organization_propaganda_department:
			intentActivity(Uri.parse("http://www.xctz.cdut.edu.cn/"));//宣传部办公室
			break;
		case R.id.tv_organization_school_work:
			intentActivity(Uri.parse("http://www.xsc.cdut.edu.cn/"));//党委学生办公室
			break;
		case R.id.tv_organization_mental_health:
			intentActivity(Uri.parse("http://www.xljk.cdut.edu.cn/"));//心理健康教育中心
			break;
		case R.id.tv_organization_armed_forces:
			intentActivity(Uri.parse("http://www.bwc.cdut.edu.cn/"));//党委武装部
			break;
		case R.id.tv_organization_school_union:
			intentActivity(Uri.parse("http://www.gh.cdut.edu.cn/"));//校工会
			break;
		case R.id.tv_organization_school_committee:
			intentActivity(Uri.parse("http://youth.cdut.edu.cn/"));//校团委
			break;
		case R.id.tv_organization_headmaster_office:
			intentActivity(Uri.parse("http://www.office.cdut.edu.cn/"));//校长办公室
			break;
		case R.id.tv_organization_student_affairs:
			intentActivity(Uri.parse("http://www.xsc.cdut.edu.cn/"));//学生工作处
			break;
		case R.id.tv_organization_security_office:
			intentActivity(Uri.parse("http://www.bwc.cdut.edu.cn/"));//保卫处
			break;
		case R.id.tv_organization_graduate_faculty:
			intentActivity(Uri.parse("http://www.gra.cdut.edu.cn/index.html"));//研究生院
			break;
		case R.id.tv_organization_personnel_division:
			intentActivity(Uri.parse("http://www.rsc.cdut.edu.cn/recruitment/?tid=0&cid=3"));//人事部
			break;
		case R.id.tv_organization_present_plan:
			intentActivity(Uri.parse("http://www.jcc.cdut.edu.cn/financeIndex/index.jsp"));//计划教材处
			break;
		case R.id.tv_organization_acdemic_affairs:
			intentActivity(Uri.parse("http://www.aao.cdut.edu.cn/aao/"));//教务处
			break;

		case R.id.tv_organization_sience_department:
			intentActivity(Uri.parse("http://www.kjc.cdut.edu.cn/"));//科技处
			break;
		case R.id.tv_organization_editors_center:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/type_gxlm/0203000102.html#"));//学术期刊中心
			break;
		case R.id.tv_organization_audit_division:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/sjc/default.html"));//审计处
			break;
		case R.id.tv_organization_planing_office:
			intentActivity(Uri.parse("http://202.115.137.125/"));//发展规划处
			break;
		case R.id.tv_organization_general_services:
			intentActivity(Uri.parse("http://www.zw.cdut.edu.cn/"));//总务处
			break;
		case R.id.tv_organization_lab_management:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/szc/default.html"));//实验室
			break;
		case R.id.tv_organization_external_cooperation:
			intentActivity(Uri.parse("http://www.ice.cdut.edu.cn/"));//对外合作交流
			break;
		case R.id.tv_organization_campus_planning:
			intentActivity(Uri.parse("http://cdlg.s1.loginid.cn/index.aspx"));//校园规划
			break;
		case R.id.tv_organization_retired_office:
			intentActivity(Uri.parse("http://www.ltx.cdut.edu.cn/"));//离退休
			break;
		case R.id.tv_organization_graduate_school:
			intentActivity(Uri.parse("http://www.gra.cdut.edu.cn/index.html"));//研究生院
			break;
		case R.id.tv_organization_earth_sciences:
			intentActivity(Uri.parse("http://www.ces.cdut.edu.cn/"));//地科院
			break;
		case R.id.tv_organization_energy_resources:
			intentActivity(Uri.parse("http://www.energy.cdut.edu.cn/index.html"));//能源学院
			break;
		case R.id.tv_organization_environmental_civil_engineering:
			intentActivity(Uri.parse("http://hgy.cdut.edu.cn/"));//环工院
			break;
		case R.id.tv_organization_geophysical_institute:
			intentActivity(Uri.parse("http://www.cog.cdut.edu.cn/"));//地物院
			break;
		case R.id.tv_organization_nuclear_technology:
			intentActivity(Uri.parse("http://www.cnae.cdut.edu.cn/"));//核自院
			break;
		case R.id.tv_organization_materials_chemical:
			intentActivity(Uri.parse("http://www.cmcc.cdut.edu.cn/"));//材化院
			break;
		case R.id.tv_organization_administrative_science:
			intentActivity(Uri.parse("http://www.cim.cdut.edu.cn/"));//管科院
			break;
		case R.id.tv_organization_politics:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/zzxy/default.html"));//政治学院
			break;
		case R.id.tv_organization_grammar_shcool:
			intentActivity(Uri.parse("http://www.wfxy.cdut.edu.cn/"));//文法学院
			break;
		case R.id.tv_organization_foreign_college:
			intentActivity(Uri.parse("http://www.clc.cdut.edu.cn/"));//外国语学院
			break;
		case R.id.tv_organization_business_college:
			intentActivity(Uri.parse("http://www.cc.cdut.edu.cn/"));//商学院
			break;
		case R.id.tv_organization_institute_science_art:
			intentActivity(Uri.parse("http://www.ccsa.cdut.edu.cn/"));//传艺院
			break;
		case R.id.tv_organization_physical_education:
			intentActivity(Uri.parse("http://www.tyxy.cdut.edu.cn/"));//体育学院
			break;
		case R.id.tv_organization_information_science:
			intentActivity(Uri.parse("http://www.cist.cdut.edu.cn/"));//信科院
			break;
		case R.id.tv_organization_tourism:
			intentActivity(Uri.parse("http://www.turp.cdut.edu.cn/"));//旅游学院
			break;
		case R.id.tv_organization_sedimentary:
			intentActivity(Uri.parse("http://www.cdut.edu.cn/cjdzyjy/default.html"));//趁机地质研究院
			break;
		case R.id.tv_organization_continuing_education:
			intentActivity(Uri.parse("http://www.jjy.cdut.edu.cn/"));//继续教育学院
			break;
		case R.id.tv_organization_leshan_engineering:
			intentActivity(Uri.parse("http://www.cdutetc.cn/index.html"));//乐山工程技术学院
			break;
		case R.id.tv_organization_national_research_geological:
			intentActivity(Uri.parse("http://www.sklg.cdut.edu.cn/"));//油气
			break;
		case R.id.tv_organization_disaster_prevention:
			intentActivity(Uri.parse("http://www.sklgp.com/"));//地质灾害防治
			break;
		case R.id.tv_organization_geological_survey:
			intentActivity(Uri.parse("http://www.igs.cdut.edu.cn/"));//地质调查
			break;
		case R.id.tv_organization_library:
			intentActivity(Uri.parse("http://www.lib.cdut.edu.cn/"));//图书馆
			break;
		case R.id.tv_organization_archives:
			intentActivity(Uri.parse("http://www.archive.cdut.edu.cn/"));//档案馆
			break;
		case R.id.tv_organization_museum:
			intentActivity(Uri.parse("http://www.museum.cdut.edu.cn/"));//博物馆
			break;
		case R.id.tv_organization_infirmary:
			intentActivity(Uri.parse("http://www.hospital.cdut.edu.cn/"));//校医院
			break;
		case R.id.tv_organization_logistic_service_group:
			intentActivity(Uri.parse("http://www.service.cdut.edu.cn/"));//后勤
			break;
		case R.id.tv_organization_property:
			intentActivity(Uri.parse("http://www.lgzc.cdut.edu.cn/"));//地质资产
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
