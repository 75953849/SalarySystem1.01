package com.briup.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.briup.bean.Attendance;
import com.briup.bean.Employee;
import com.briup.bean.search.JsonDate;
import com.briup.bean.search.SignDay;
import com.briup.bean.uBean.AttendanceMixOther;
import com.briup.common.utils.Page;
import com.briup.service.AttendanceService;
import com.briup.service.EmployeeService;
import com.sun.xml.internal.ws.api.server.SDDocumentFilter;

import sun.util.resources.cldr.CalendarData;

@Controller
public class AttendanceController {
	@Autowired
	private AttendanceService attendanceService;
	private EmployeeService employeeService;
	
	@RequestMapping("/totodayAttend")
	public String totodayAttend(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows ,@RequestParam(defaultValue="公司管理董事层")String depName,@RequestParam(defaultValue="1") BigDecimal attendState ,Date beginTime,Date endTime,Model model) {
		
		Page<Attendance> atts = attendanceService.findAllAttPageByDate(page, rows);
		
		
		model.addAttribute("page",atts);
		
		
		
		
		return "attendance/todayAttend";
	}
	
	@RequestMapping("/tosearchAttend")
	public String tosearchAttend(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows ,@RequestParam(defaultValue="公司管理董事层")String depName,@RequestParam(defaultValue="1") BigDecimal attendState,Date beginTime,Date endTime ,Model model) {
		
		Page<Attendance> atts = attendanceService.findAllAttPage(page, rows);
		
		
		model.addAttribute("page",atts);
		
		
		
		
		return "attendance/searchAttend";
	}
	
	@RequestMapping("/searchAttend")
	public String searchAttend(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows ,@RequestParam(defaultValue="公司管理董事层")String depName,@RequestParam(defaultValue="1") BigDecimal attendState,Date beginTime,Date endTime ,Model model) {
		
		Page<Attendance> atts = attendanceService.findAllAttByEmpName(page , rows,depName , attendState,beginTime,endTime);
		
		
		model.addAttribute("page",atts);
		
		
		
		
		return "attendance/searchAttend";
	}
	
	@RequestMapping("/toqiandao")
	public String toqiandao() {
	
		
		
		
		
		return "attendance/qiandao";
	}
	
	@RequestMapping("/getSignDay")
	@ResponseBody
	public List<SignDay> getSignDay(@RequestBody JsonDate jd , HttpSession ses) throws ParseException {
	
		System.out.println("json传过来了");
		System.out.println(jd.getYear());
		
		int a = Integer.parseInt(jd.getMonth());
		if(a<12) {
			a++;
		}
		else {
			a = 1;
		}
		
		Employee emp = (Employee) ses.getAttribute("user");
		
		String d1 = jd.getYear() + "-" + jd.getMonth() + "-01";
		String d2 = jd.getYear() + "-" + jd.getMonth()+ "-31";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(d1);
		Date date2 = sdf.parse(d2);
		String b = sdf.format(date2);
		System.out.println("jsonshou"+date1);
		System.out.println(b);
		
		List<Attendance> list = attendanceService.getSignDay(date1, date2,emp.getId());
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
		
		
		List<SignDay> signlist = new ArrayList<>();
		
		String day;
		for(Attendance att:list) {
			SignDay sday = new SignDay();
			System.out.println(att.getAttendTime());
			day = sdf1.format(att.getAttendTime());
			System.out.println("day"+day);
			sday.setSignDay(day);
			System.out.println("sday.signday"+sday.getSignDay());
			sday.setStatus(att.getAttendState());
			System.out.println("json传送循环");
			
			signlist.add(sday);
			
		}
			for(SignDay s:signlist) {
				System.out.println(s.getSignDay());
			}
	
		
		
		
		
		return signlist;
	}
	
	
	
	
	
	
	
	
	
	
	//ajax 签到功能
	@RequestMapping("/ajaxQianDao")
	@ResponseBody
	public List<SignDay> ajaxQianDao(@RequestBody JsonDate jd , HttpSession ses) throws ParseException {
	
		Employee emp = (Employee) ses.getAttribute("user");
		Date QianDaoRiQi = new Date();
		BigDecimal ZhuangTai = new BigDecimal(1);
		String empId = emp.getId();
		Attendance attendance = new Attendance();
		attendance.setEmpId(empId);
		attendance.setAttendTime(QianDaoRiQi);
		attendance.setAttendState(ZhuangTai);
		
		attendanceService.addAtt(attendance);
		
		System.out.println("json传过来了");
		System.out.println(jd.getYear());
		
		int a = Integer.parseInt(jd.getMonth());
		if(a<12) {
			a++;
		}
		else {
			a = 1;
		}
		
		
		
		String d1 = jd.getYear() + "-" + jd.getMonth() + "-01";
		String d2 = jd.getYear() + "-" + jd.getMonth()+ "-31";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(d1);
		Date date2 = sdf.parse(d2);
		String b = sdf.format(date2);
		System.out.println("jsonshou"+date1);
		System.out.println(b);
		
		List<Attendance> list = attendanceService.getSignDay(date1, date2,emp.getId());
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
		
		
		List<SignDay> signlist = new ArrayList<>();
		
		String day;
		for(Attendance att:list) {
			SignDay sday = new SignDay();
			System.out.println(att.getAttendTime());
			day = sdf1.format(att.getAttendTime());
			System.out.println("day"+day);
			sday.setSignDay(day);
			System.out.println("sday.signday"+sday.getSignDay());
			sday.setStatus(att.getAttendState());
			System.out.println("json传送循环");
			
			signlist.add(sday);
			
		}
			for(SignDay s:signlist) {
				System.out.println(s.getSignDay());
			}
	
		
		
		
		
		return signlist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) throws ParseException {
//		String year = "2010";
//		String month = "11";
//		String day = "01";
//		String d = year+"-"+month+"-"+day;
//		System.out.println(d);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse(d);
//		String format = sdf.format(date);
//		System.out.println(format);
//	}
	
	
	
	
	@RequestMapping("/qiandao")
	public String qiandao(HttpSession session , HttpServletRequest req , HttpServletResponse resp) throws ParseException, ServletException, IOException {
		
		Employee emp = (Employee) session.getAttribute("user");
		System.out.println(emp.getName());
		Date date = new Date();
		System.out.println("之前的实践"+date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String d1 = sdf.format(date);
		Date d2 = sdf.parse(d1);
		System.out.println(d2);
		List<Attendance> atts = attendanceService.findByDate(d2, emp.getId());
		int i =1 ;
		BigDecimal ii = BigDecimal.valueOf(i);
		
		Attendance att = new Attendance();
		att.setEmpId(emp.getId());
		att.setEmpName(emp.getName());
		att.setDepName(emp.getDepName());
		att.setAttendTime(date);
		att.setAttendState(ii);
		System.out.println("attendtime"+att.getAttendTime());
		if(atts.isEmpty()) {
			//可以签到
			attendanceService.addAtt(att);
			req.setAttribute("msg", "签到成功");
			System.out.println("chengsussssss");
		}else {
			//bu可以签到
			req.setAttribute("msg", "签到失败，你已经签到过了");
			System.out.println("shibai");
		}
		return "forward:/totodayAttend";
	}
	
	
/*	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dd = sdf.format(d);
		Date d2 = sdf.parse(dd);
		System.out.println(d2);
		
	}
	
	*/
	@RequestMapping("/tos")
	public String tos() {
	
		
		
		
		
		return "attendance/shuaqiandao";
	}
	@RequestMapping("/shuaqiandao")
	public String shuaqiandao(Attendance att) {
	
		attendanceService.addAtt(att);
		
		
		
		return "attendance/shuaqiandao";
	}
}
