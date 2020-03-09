package com.briup.bean.vo;

import java.io.Serializable;
/**
 * 签到的数据承载类<br>
 * */
public class QianDao implements Serializable{
	//这个为日期 6月21  这个数字就是21
	private String signDay;
	//1 以前签到，2 今天
	private String status;
	public String getSignDay() {
		return signDay;
	}
	public void setSignDay(String signDay) {
		this.signDay = signDay;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public QianDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QianDao(String signDay, String status) {
		super();
		this.signDay = signDay;
		this.status = status;
	}
	
	

}
