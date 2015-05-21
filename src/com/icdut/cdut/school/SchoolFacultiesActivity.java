package com.icdut.cdut.school;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.icdut.cdut.R;

//师资队伍页面
public class SchoolFacultiesActivity extends Activity{
	
	private TextView tv_school_faculties;
	
	private  String textContent="		学校始终坚持党管人才，积极推进人才强校战略，大力实施人才工程，通过近些年的建设和发展，学校师资队伍整体水平不断提升，逐步建立起一支结构合理、素质优良、业务精深、相对稳定和充满活力的师资队伍。截至2013年4月，学校共有教职工2200余人，具有副高级及以上职称697人，具有硕士及以上学位1352人。学校现有国务院学科评议组成员1人、全国杰出专业技术人才1人、国家级有突出贡献的中青年专家1人、国务院政府特殊津贴获得者23人、教育部“长江学者特聘教授”1人、新世纪“百千万人才工程”国家级人选5人、四川省学术和技术带头人19人、四川省有突出贡献的优秀专家19人、四川省学术和技术带头人后备人选37人；国家杰出青年科学基金获得者2人、国家“973”项目首席科学家1人、中国青年科技奖获得者3人、教育部高校青年教师奖获得者1人、入选教育部“跨世纪优秀人才培养计划”和“新世纪优秀人才支持计划”7人、四川省青年科技奖获得者8人、四川省科技杰出贡献奖获得者1人、李四光地质科学奖获得者1人、霍英东青年教师奖获得者5人、黄汲清青年地质科学技术奖获得者3人；国家级教学团队1个、教育部创新团队1个、四川省省属高校创新团队5个、四川省科技创新团队2个;四川省“百人计划”长期项目1人、青年项目1人、短期项目3人。";
	
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
