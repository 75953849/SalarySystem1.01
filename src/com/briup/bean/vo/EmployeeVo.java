package com.briup.bean.vo;

import com.briup.bean.EmployeeExample;
/**
 * 分页需要的承载数据类<br>
 * 不和数据库对应表<Br>
 * 可以代替EmployeeExample使用<Br>
 * 属性 min 和 max 如果不设置 就是查询所有的(不分页)
 * */
public class EmployeeVo extends EmployeeExample{
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
	public EmployeeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeVo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
}
