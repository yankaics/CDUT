package com.icdut.cdut;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	private ArrayList<Fragment> fragmentList;

	public ViewPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragment) {  
        super(fm);  
        this.fragmentList = fragment;  
    }  

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		return fragmentList.get(index);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragmentList.size();
	}

	
}
