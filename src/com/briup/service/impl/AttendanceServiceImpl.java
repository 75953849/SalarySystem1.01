package com.briup.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briup.bean.Attendance;
import com.briup.bean.AttendanceExample;
import com.briup.bean.Employee;
import com.briup.bean.EmployeeExample;
import com.briup.bean.EmployeeExample.Criteria;
import com.briup.bean.search.SignDay;
import com.briup.bean.uBean.AttendanceMixOther;
import com.briup.bean.vo.AttendanceVo;
import com.briup.common.utils.Page;
import com.briup.mapper.AttendanceMapper;
import com.briup.mapper.EmployeeMapper;
import com.briup.service.AttendanceService;

@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private AttendanceMapper attendanceMapper;
	@Override
	
	public Page<Attendance> findAllAttByEmpName(int page, int rows,String depName , BigDecimal attendState,Date beginTime,Date endTime) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria where = example.createCriteria();
		where.andDepNameEqualTo(depName);
		List<Employee> emps = this.employeeMapper.selectByExample(example);
		
		List<String> sl = new ArrayList<>();
		for(Employee emp:emps) {
			sl.add(emp.getId());
		}
		AttendanceVo vo = new AttendanceVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		com.briup.bean.AttendanceExample.Criteria where1 = vo.createCriteria();
		where1.andEmpIdIn(sl);
		where1.andAttendStateEqualTo(attendState);
		if(beginTime!=null) {
			System.out.println("begin not null");
			where1.andAttendTimeGreaterThanOrEqualTo(beginTime);
		}
		else {
			System.out.println("begin null");
		}
		if(endTime!=null) {
			System.out.println("end not null");
			where1.andAttendTimeLessThanOrEqualTo(endTime);
		}
		else {
			System.out.println("end null");
		}
			
		
		List<Attendance> atts = this.attendanceMapper.selectByExamplePage(vo);
		int total = this.attendanceMapper.countByExample(vo);
		
		for(Attendance att:atts) {
			Employee e = this.employeeMapper.selectByPrimaryKey(att.getEmpId());
			att.setEmpName(e.getName());
			att.setDepName(e.getDepName());
		}
	
		
		Page<Attendance> res = new Page<>();
		res.setPage(page);
		res.setSize(rows);
		res.setRows(atts);
		res.setTotal(total);
		
		return res;
	}
	@Override
	public List<Attendance> getSignDay(Date beginTime, Date endTime , String id) {
		// TODO Auto-generated method stub
		AttendanceExample example = new AttendanceExample();
		com.briup.bean.AttendanceExample.Criteria where = example.createCriteria();
		where.andAttendTimeGreaterThanOrEqualTo(beginTime);
		where.andAttendTimeLessThan(endTime);
		where.andEmpIdEqualTo(id);
		List<Attendance> atts = this.attendanceMapper.selectByExample(example);

		String day;
		System.out.println("atts长度="+atts.size());
		return atts;
	}
	@Override
	public Attendance findById(String id) {
		// TODO Auto-generated method stub
		return this.attendanceMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Attendance> findByDate(Date date,String empId) {
		// TODO Auto-generated method stub
		
		AttendanceExample example = new AttendanceExample();
		com.briup.bean.AttendanceExample.Criteria where = example.createCriteria();
		where.andAttendTimeGreaterThanOrEqualTo(date);
		where.andEmpIdEqualTo(empId);
		return this.attendanceMapper.selectByExample(example);
	}
	@Override
	public void addAtt(Attendance att) {
		// TODO Auto-generated method stub
		this.attendanceMapper.insertSelective(att);
	}
	@Override
	public Page<Attendance> findAllAttPage(int page, int rows) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria where = example.createCriteria();
		List<Employee> emps = this.employeeMapper.selectByExample(example);
		
		List<String> sl = new ArrayList<>();
		for(Employee emp:emps) {
			sl.add(emp.getId());
		}
		AttendanceVo vo = new AttendanceVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		com.briup.bean.AttendanceExample.Criteria where1 = vo.createCriteria();
		where1.andEmpIdIn(sl);
		List<Attendance> atts = this.attendanceMapper.selectByExamplePage(vo);
		int total = this.attendanceMapper.countByExample(vo);
		
		for(Attendance att:atts) {
			Employee e = this.employeeMapper.selectByPrimaryKey(att.getEmpId());
			att.setEmpName(e.getName());
			att.setDepName(e.getDepName());
		}
		
		Page<Attendance> res = new Page<>();
		res.setPage(page);
		res.setSize(rows);
		res.setRows(atts);
		res.setTotal(total);
		
		return res;
	}
	@Override
	public Page<Attendance> findAllAttPageByDate(int page, int rows) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria where = example.createCriteria();
		List<Employee> emps = this.employeeMapper.selectByExample(example);
		
		List<String> sl = new ArrayList<>();
		for(Employee emp:emps) {
			sl.add(emp.getId());
		}
		AttendanceVo vo = new AttendanceVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		com.briup.bean.AttendanceExample.Criteria where1 = vo.createCriteria();
		where1.andEmpIdIn(sl);
		
		
		Date date1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String data2 = sdf.format(date1);
		Date date3;
		try {
			date3 = sdf.parse(data2);
			where1.andAttendTimeEqualTo(date3);
			List<Attendance> atts = this.attendanceMapper.selectByExamplePage(vo);
			int total = this.attendanceMapper.countByExample(vo);
			
			for(Attendance att:atts) {
				Employee e = this.employeeMapper.selectByPrimaryKey(att.getEmpId());
				att.setEmpName(e.getName());
				att.setDepName(e.getDepName());
			}
			
			Page<Attendance> res = new Page<>();
			res.setPage(page);
			res.setSize(rows);
			res.setRows(atts);
			res.setTotal(total);
			
			return res;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	
	}

}
