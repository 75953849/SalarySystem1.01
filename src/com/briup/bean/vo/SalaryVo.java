package com.briup.bean.vo;

import com.briup.bean.SalaryExample;

public class SalaryVo extends SalaryExample{
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
	public SalaryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalaryVo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
}
