package com.briup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briup.bean.Employee;
import com.briup.bean.EmployeeExample;
import com.briup.bean.EmployeeExample.Criteria;
import com.briup.bean.search.EmpSearch;
import com.briup.bean.vo.EmployeeVo;
import com.briup.common.utils.Page;
import com.briup.mapper.EmployeeMapper;
import com.briup.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	public Employee findEmpById(String id) {
		// TODO Auto-generated method stub	
		return this.employeeMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Employee> findAllEmp() {
		// TODO Auto-generated method stub
		return this.employeeMapper.selectByExample(null);
	}
	@Override
	public List<Employee> findEmpByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		
		EmployeeExample example = new EmployeeExample();
		Criteria where = example.createCriteria();
		where.andNameEqualTo(name);
		where.andPasswordEqualTo(password);		
		return this.employeeMapper.selectByExample(example);
	}
	@Override
	public Page<Employee> selectEmpPage(int page , int rows , EmpSearch es) {
		// TODO Auto-generated method stub
		EmployeeVo vo = new EmployeeVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		Criteria where = vo.createCriteria();
		
		EmployeeExample example = new EmployeeExample();
		Criteria where2 = example.createCriteria();
		
		if(es.getDepId()!=null && !"".equals(es.getDepId())) {
			where.andDepNameLike("%"+es.getDepId()+"%");
			where2.andDepNameLike("%"+es.getDepId()+"%");
		}
		
		if(es.getName()!=null && !"".equals(es.getName())) {
			where.andNameLike("%"+es.getName()+"%");
			where2.andNameLike("%"+es.getName()+"%");
		}
		
		if(es.getEmpId()!=null && !"".equals(es.getEmpId())) {
			where.andIdEqualTo(es.getEmpId());
			where2.andIdEqualTo(es.getEmpId());
		}
		
		if(es.getDownsalary()!=null && !"".equals(es.getDownsalary())) {
			where.andSalaryGreaterThanOrEqualTo(es.getDownsalary());
			where2.andSalaryGreaterThanOrEqualTo(es.getDownsalary());
		}
		if(es.getUpsalary()!=null && !"".equals(es.getUpsalary())) {
			where.andSalaryLessThanOrEqualTo(es.getUpsalary());
			where2.andSalaryLessThanOrEqualTo(es.getUpsalary());
		}
		
		List<Employee> list = this.employeeMapper.selectByExamplePage(vo);
		int total = this.employeeMapper.countByExample(example);
		
		Employee emp = new Employee();
		emp.setStart(min);
		emp.setRows(rows);
		
		Page<Employee> res = new Page<>();
		res.setPage(page);
		res.setRows(list);
		res.setSize(rows);
		res.setTotal(total);
		return res;
	}
	@Override
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		this.employeeMapper.insertSelective(emp);
	}
	@Override
	public Employee selectEmpById(String id) {
		// TODO Auto-generated method stub
		
		return this.employeeMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Employee> findEmpByManyId(List<String> empId) {
		// TODO Auto-generated method stub
		
		EmployeeExample example = new EmployeeExample();
		Criteria where = example.createCriteria();
		where.andIdIn(empId);
	
		
		return 	this.employeeMapper.selectByExample(example);
	}
	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		this.employeeMapper.updateByPrimaryKey(emp);
	}

}
