package com.briup.bean.search;

import java.math.BigDecimal;

public class EmpSearch {
	 private String depId;	//部门名字   表单得到
	 private String name;
	 private String empId;
	 private BigDecimal downsalary;
	 private BigDecimal upsalary;
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public BigDecimal getDownsalary() {
		return downsalary;
	}
	public void setDownsalary(BigDecimal downsalary) {
		this.downsalary = downsalary;
	}
	public BigDecimal getUpsalary() {
		return upsalary;
	}
	public void setUpsalary(BigDecimal upsalary) {
		this.upsalary = upsalary;
	}
}
