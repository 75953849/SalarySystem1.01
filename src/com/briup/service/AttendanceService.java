package com.briup.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.briup.bean.Attendance;
import com.briup.bean.search.SignDay;
import com.briup.bean.uBean.AttendanceMixOther;
import com.briup.common.utils.Page;

public interface AttendanceService {
	//若干条件
	public Page<Attendance> findAllAttByEmpName(int page, int rows,String depName ,BigDecimal attendState,Date beginTime,Date endTime);
	public Page<Attendance> findAllAttPage(int page,int rows);
	public Page<Attendance> findAllAttPageByDate(int page,int rows);
	
	public List<Attendance> getSignDay(Date beginTime , Date endTime ,String id);
	
	public Attendance findById(String id);
	
	public List<Attendance> findByDate(Date date , String empId);
	public void addAtt(Attendance att);
}
