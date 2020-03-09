package com.briup.bean.vo;

import com.briup.bean.DepartmentExample;

public class DepartmentVo extends DepartmentExample{
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
	public DepartmentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentVo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
}
