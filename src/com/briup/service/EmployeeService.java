package com.briup.service;

import java.util.List;

import com.briup.bean.Employee;
import com.briup.bean.search.EmpSearch;
import com.briup.common.utils.Page;

public interface EmployeeService {
	public Employee findEmpById(String id);
	
	public List<Employee> findAllEmp();
	
	public Page<Employee> selectEmpPage(int page,int rows ,EmpSearch es);
	
	public List<Employee> findEmpByNameAndPassword(String name,String password);
	
	public void addEmp(Employee emp);
	
	public Employee selectEmpById(String id);
	
	public List<Employee> findEmpByManyId(List<String> empId);
	
	public void updateEmp(Employee emp);
	
}
