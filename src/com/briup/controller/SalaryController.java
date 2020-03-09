package com.briup.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.bean.Salary;
import com.briup.common.utils.Page;
import com.briup.service.SalaryService;

@Controller
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	@RequestMapping("/tosalary")
	public String tosalary() {
		return "salary";
	}
	
	@RequestMapping("/salaryListPage")
	public String salaryListPage(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows,Model model) {
		Page<Salary> sals = salaryService.findAllListPage(page, rows);
		model.addAttribute("page", sals);
		return "salary";
	}
	
	@RequestMapping("/toaddSalary")
	public String toaddSalary() {
		
		return "salary/addSalary";
	}
	@RequestMapping("/addSalary")
	public String addSalary(Salary salary) {
		int i = 1;
		System.out.println("empId====="+salary.getEmpId());
		BigDecimal s = new BigDecimal(i);
		
		BigDecimal total = salary.getBaseSalary().add(salary.getOvertimePay()).subtract(salary.getLeaveFee()).subtract(salary.getAbsentPay());
		salary.setSalaystate(s);
		salary.setTotal(total);
		
		salaryService.addSalary(salary);
		
		return "redirect:/salaryListPage";
	}
}
