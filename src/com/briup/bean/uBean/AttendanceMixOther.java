package com.briup.bean.uBean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.briup.bean.Attendance;
import com.briup.bean.Employee;

public class AttendanceMixOther {
	private List<Employee> emps;
	private List<Attendance> atts;
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public List<Attendance> getAtts() {
		return atts;
	}
	public void setAtts(List<Attendance> atts) {
		this.atts = atts;
	}
	    
	    
}
