package com.briup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.bean.Employee;
import com.briup.bean.search.EmpSearch;
import com.briup.bean.search.JsonDate;
import com.briup.common.utils.Page;
import com.briup.service.EmployeeService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/findEmpById")
	public String findEmpById(String id , Model model) {
		Employee emp = employeeService.findEmpById(id);
		model.addAttribute("emp", emp);
		return "employee";
	}
	
	@RequestMapping("/toEmpList")
	public String toEmpList(HttpServletRequest req) {
		List<Employee> list = employeeService.findAllEmp();
		req.setAttribute("list", list);
		return "emp/empList";
	}
	
	@RequestMapping("/toEmpListPage")
	public String toEmpListPage(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows ,EmpSearch es , Model model) {
		
		System.out.println(es.getDownsalary());
		
		Page<Employee> emps = employeeService.selectEmpPage(page, rows , es);
		model.addAttribute("page",emps);
		
		
		return "emp/empList";
	}
	@RequestMapping("/toaddEmp")
	public String toaddEmp() {
		System.out.println("toaddEmp");
		return "emp/addEmp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Employee emp) {
		System.out.println(emp.getDepName());
		System.out.println(emp.getImpRole());
		emp.setPassword("123");
		employeeService.addEmp(emp);
		
		return "redirect:/toEmpListPage";
	}
	

	@RequestMapping("/showEmp")
	public String toaddEmp(String id ,Model model) {
		Employee emp = employeeService.selectEmpById(id);
		model.addAttribute("emp",emp);
		return "emp/showEmp";
	}
	@RequestMapping("/EmpJson")
	@ResponseBody
	public Employee EmpJson(@RequestBody JsonDate emp) {
		System.out.println("empJson请求收到");
		System.out.println(emp.getEmpId());
		return employeeService.findEmpById(emp.getEmpId());
	}
	
	
	@RequestMapping("/topersonalPage")
	public String topersonalPage(HttpSession session , HttpServletRequest req) {
		Employee emp = (Employee) session.getAttribute("user");
		Employee employee = employeeService.selectEmpById(emp.getId());
		req.setAttribute("emp", employee);
		return "personal/personalPage";
	}
	@RequestMapping("/updatePersonInfo")
	public String updatePersonInfo(Employee emp) {
		employeeService.updateEmp(emp);
		return "redirect:/toEmpListPage";
	}
	
}
