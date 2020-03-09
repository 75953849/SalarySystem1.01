package com.briup.service;

import com.briup.bean.Department;
import com.briup.common.utils.Page;

public interface DepartmentService {
	public Page<Department> SelectDepPage(int page , int rows, String name , String deptId);
	public void addDepart(Department dep);
	
	public Department selectDepById(String id);
	
	public void updateDepart(Department dep);
	
	public void deleteDepartById(String id);
}
