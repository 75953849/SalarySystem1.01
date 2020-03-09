package com.briup.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briup.bean.Department;
import com.briup.bean.DepartmentExample;
import com.briup.bean.DepartmentExample.Criteria;
import com.briup.bean.vo.DepartmentVo;
import com.briup.common.utils.Page;
import com.briup.mapper.DepartmentMapper;
import com.briup.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public Page<Department> SelectDepPage(int page, int rows , String name , String deptId) {
		// TODO Auto-generated method stub
		DepartmentVo vo = new DepartmentVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		Criteria where = vo.createCriteria();
		
		DepartmentExample example = new DepartmentExample();
		Criteria where2 = example.createCriteria();
		
		
		if(name!=null && !"".equals(name)) {
			where.andNameLike("%"+name+"%");
			where2.andNameLike("%"+name+"%");
		}
		if(deptId!=null && !"".equals(deptId)) {
			where.andIdEqualTo(deptId);
			where2.andIdEqualTo(deptId);
		}
		
		
		List<Department> list = this.departmentMapper.selectByExamplePage(vo);
		int total = this.departmentMapper.countByExample(example);
		
		Page<Department> deps = new Page<>();
		deps.setPage(page);
		deps.setSize(rows);
		deps.setRows(list);
		deps.setTotal(total);
		
		return deps;
	}
	@Override
	public void addDepart(Department dep) {
		// TODO Auto-generated method stub
		this.departmentMapper.insertSelective(dep);
	}
	@Override
	public Department selectDepById(String id) {
		// TODO Auto-generated method stub
		return this.departmentMapper.selectByPrimaryKey(id);
	}
	@Override
	public void updateDepart(Department dep) {
		// TODO Auto-generated method stub
		this.departmentMapper.updateByPrimaryKeySelective(dep);
	}

	@Override
	public void deleteDepartById(String id) {
		// TODO Auto-generated method stub
		this.departmentMapper.deleteByPrimaryKey(id);
	}
}
