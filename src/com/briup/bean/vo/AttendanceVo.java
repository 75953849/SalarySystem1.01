package com.briup.bean.vo;

import com.briup.bean.AttendanceExample;

public class AttendanceVo extends AttendanceExample{
	private int min = -2;
	private int max = -1;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public AttendanceVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttendanceVo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
}
