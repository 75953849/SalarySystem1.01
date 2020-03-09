package com.briup.service;

import java.util.List;

import com.briup.bean.Salary;
import com.briup.common.utils.Page;

public interface SalaryService {
	public Page<Salary> findAllListPage(int page , int rows);
	
	public void addSalary(Salary sa);
	
	public List<Salary> findAll();
}
