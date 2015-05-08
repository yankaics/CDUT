package com.icdut.cdut;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

	// 四个fragment;
	private FragmentSchool fragmentSchool;
	private FragmentNews fragmentNews;
	private FragmentNavi fragmentNavi;
	private FragmentPerson fragmentPerson;
	// 定义ViewPager
	private ViewPager viewPager;
	private ArrayList<Fragment> fraList;
	private ViewPagerAdapter viewPagerAdapter;
	// 定义layout对象
	private RelativeLayout school_layout;
	private RelativeLayout news_layout;
	private RelativeLayout Navi_layout;
	private RelativeLayout person_layout;
	// 定义TextView;
	private TextView tv_school;
	private TextView tv_news;
	private TextView tv_navi;
	private TextView tv_person;
	// 定义颜色值
	final int GRAY = 0xFF999999;
	final int GREEN = 0xFF45C01A;
	final int SCHOOL_FRAGMENT = 0;
	final int NEWS_FRAGMENT = 1;
	final int NAVI_FRAGMENT = 2;
	final int PERSON_FRAGMENT = 3;
	// 定义一个Onclick全局对象
	public MyOnClick myclick;
	public MyPageChangeListener myPageChange;

	public FragmentManager fManager=getSupportFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViewPager();
		initView();
		initState();
	}

	//初始化第一个text默认选中颜色改变
	private void initState() {
		tv_school.setTextColor(GREEN);
		viewPager.setCurrentItem(SCHOOL_FRAGMENT);
	}

	private void initViewPager() {
		fraList = new ArrayList<Fragment>();
		fragmentSchool = new FragmentSchool();
		fragmentNavi = new FragmentNavi();
		fragmentNews = new FragmentNews();
		fragmentPerson = new FragmentPerson();
		fraList.add(fragmentSchool);
		fraList.add(fragmentNews);
		fraList.add(fragmentNavi);
		fraList.add(fragmentPerson);
		viewPagerAdapter = new ViewPagerAdapter(fManager, fraList);
	}

	private void initView() {
		
		myclick = new MyOnClick();  
        myPageChange = new MyPageChangeListener();
		// 绑定控件
		viewPager = (ViewPager) findViewById(R.id.vPager);
		school_layout = (RelativeLayout) findViewById(R.id.school_layout);
		news_layout = (RelativeLayout) findViewById(R.id.news_layout);
		Navi_layout = (RelativeLayout) findViewById(R.id.navi_layout);
		person_layout = (RelativeLayout) findViewById(R.id.person_layout);

		tv_school = (TextView) findViewById(R.id.school_txt);
		tv_news = (TextView) findViewById(R.id.news_txt);
		tv_navi = (TextView) findViewById(R.id.navi_txt);
		tv_person = (TextView) findViewById(R.id.person_txt);

		viewPager.setAdapter(viewPagerAdapter);
		viewPager.setOnPageChangeListener(myPageChange);
		school_layout.setOnClickListener(myclick);
		news_layout.setOnClickListener(myclick);
		Navi_layout.setOnClickListener(myclick);
		person_layout.setOnClickListener(myclick);
	}

	public class MyOnClick implements OnClickListener {

		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			clearChioce();
			iconChange(view.getId());
		}

	}

	public class MyPageChangeListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			if (arg0 == 2) {
				int i = viewPager.getCurrentItem();
				clearChioce();
				iconChange(i);
			}
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void iconChange(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case R.id.school_layout:
		case SCHOOL_FRAGMENT:
			tv_school.setTextColor(GREEN);
			viewPager.setCurrentItem(SCHOOL_FRAGMENT);
			break;
		case R.id.news_layout:
		case NEWS_FRAGMENT:
			tv_news.setTextColor(GREEN);
			viewPager.setCurrentItem(NEWS_FRAGMENT);
			break;
		case R.id.navi_layout:
		case NAVI_FRAGMENT:
			tv_navi.setTextColor(GREEN);
			viewPager.setCurrentItem(NAVI_FRAGMENT);
			break;
		case R.id.person_layout:
		case PERSON_FRAGMENT:
			tv_person.setTextColor(GREEN);
			viewPager.setCurrentItem(PERSON_FRAGMENT);
			break;

		default:
			break;
		}
	}

	// 清空选中状态
	public void clearChioce() {
		// TODO Auto-generated method stub
		tv_school.setTextColor(GRAY);
		tv_news.setTextColor(GRAY);
		tv_navi.setTextColor(GRAY);
		tv_person.setTextColor(GRAY);
	}
}
