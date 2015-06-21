package com.icdut.cdut;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//添加覆盖物所需要用到的数据
public class NaviInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3422160342969666083L;
	/**
	 * 
	 */
	//经纬度
	private double latitude;
	private double longtitude;
	//图片
	private int imgId;
	private String name;
	
	public static List<NaviInfo> infos=new ArrayList<NaviInfo>();
	
	public NaviInfo(double latitude, double longtitude, int imgId, String name) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.imgId = imgId;
		this.name = name;
	}
	
	static
	{
		infos.add(new NaviInfo(30.6800900000,104.1458210000,R.drawable.yidongguojijiudian,"怡东国际酒店"));
		infos.add(new NaviInfo(30.6802690000,104.1473180000,R.drawable.diqiuwulixueyuan,"地球物理学院"));
		infos.add(new NaviInfo(30.6799580000,104.1472680000,R.drawable.xinxikexueyujishuxueyaun,"信息科学与技术学院"));
		infos.add(new NaviInfo(30.6797100000,104.1479050000,R.drawable.tushuguan,"图书馆"));
		infos.add(new NaviInfo(30.6794150000,104.1475570000,R.drawable.diqiukexuexueyuan,"地球科学学院"));
		infos.add(new NaviInfo(30.6801440000,104.1508540000,R.drawable.nengyuanxueyuan,"能源学院"));
		infos.add(new NaviInfo(30.6814260000,104.1501960000,R.drawable.huanjingyutumugongchengxueyuan,"环境与土木工程学院"));
		infos.add(new NaviInfo(30.6798340000,104.1499360000,R.drawable.cailiaohehuaxuexueyuan,"材料和化学化工学院"));
		infos.add(new NaviInfo(30.6820470000,104.1500260000,R.drawable.wenfaxueyuan,"文法学院"));
		infos.add(new NaviInfo(30.6778770000,104.1484940000,R.drawable.guanlikexuexueyuan,"管理科学学院"));
		infos.add(new NaviInfo(30.6820470000,104.1500250000,R.drawable.waiguoyuxueyuan,"外国语学院"));
		infos.add(new NaviInfo(30.6833510000,104.1534370000,R.drawable.chuanbokexueyuyishuxueyuan,"传播科学与艺术学院"));
		infos.add(new NaviInfo(30.6791740000,104.1463220000,R.drawable.tiyuguan,"体育馆"));
		infos.add(new NaviInfo(30.6827840000,104.1491580000,R.drawable.yiyuan,"医院"));
	}
	
	public double getLatitude() {
		return latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public int getImgId() {
		return imgId;
	}
	public String getName() {
		return name;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public void setName(String name) {
		this.name = name;
	}

}
