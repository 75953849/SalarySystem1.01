package com.briup.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.bean.Department;
import com.briup.common.utils.Page;
import com.briup.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/toDepListPage")
	public String toEmpListPage(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="2")Integer rows ,String name,String deptId, Model model) {
		
		Page<Department> deps = departmentService.SelectDepPage(page, rows,name , deptId);
		
		model.addAttribute("page", deps);
		return "depart/departList";
	}
	
	@RequestMapping("/toaddDepart")
	public String toaddDepart() {
		
	
		return "depart/addDepart";
	}
	
	@RequestMapping("/addDepart")
	public String addDepart(Department dep) {
		long i = 0;
		BigDecimal val = BigDecimal.valueOf(i);
		dep.setEmpcount(val);
		departmentService.addDepart(dep);
		
		return "redirect:/toDepListPage";
	}
	
	@RequestMapping("/toUpdateDep")
	public String toUpdateDep(String id , Model model) {
		
		Department dep = departmentService.selectDepById(id);
		model.addAttribute("dep", dep);
		return "depart/showDep";
	}
	
	@RequestMapping("/updateDepart")
	public String updateDepart(Department dep) {
		
		departmentService.updateDepart(dep);
		return "redirect:/toDepListPage";
	}
	
	@RequestMapping("/deleteDep")
	public String deleteDep(String id) {
		
		departmentService.deleteDepartById(id);
		return "redirect:/toDepListPage";
	}
	
	
	
}
