package com.briup.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.Employee;
import com.briup.service.EmployeeService;

@Controller
public class LoginController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "newLogin";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession ses,HttpServletRequest req) {
		ses.removeAttribute("user");
		ses.removeAttribute("role");
		req.setAttribute("msg", "已退出系统");
		return "forward:/toLogin";
	}
	
	
	@RequestMapping("/Login")
	public String Login(String username, String password, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(username+"---"+password);
		List<Employee> list = this.employeeService.findEmpByNameAndPassword(username, password);
		if(list.size() == 0) {
			req.setAttribute("msg", "用户名不存在或密码错误");
			return "newLogin";
		}
		else {
			
			Employee employee = list.get(0);
			req.getSession().setAttribute("user", employee);
				if(employee.getImpRole().contains("经理")) {
					HttpSession session = req.getSession();
					session.setAttribute("role", "admin");
				}
				return "main";
			}
		}
	
	
}
