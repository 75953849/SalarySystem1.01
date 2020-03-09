package com.briup.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.Department;
import com.briup.bean.Salary;
import com.briup.bean.SalaryExample.Criteria;
import com.briup.bean.vo.SalaryVo;
import com.briup.common.utils.Page;
import com.briup.mapper.SalaryMapper;
import com.briup.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public Page<Salary> findAllListPage(int page, int rows) {
		// TODO Auto-generated method stub
		
		SalaryVo vo = new SalaryVo();
		int min = (page - 1) * rows + 1;
		int max = min + rows - 1;
		vo.setMax(max);
		vo.setMin(min);
		Criteria where = vo.createCriteria();
		List<Salary> list = this.salaryMapper.selectByExamplePage(vo);
		int total = this.salaryMapper.countByExample(vo);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		for(Salary sa:list) {
			sa.setYear(sdf.format(sa.getSalTime()));
			sa.setMonth(sdf2.format(sa.getSalTime()));
		}
		
		Page<Salary> res = new Page<>();
		res.setPage(page);
		res.setRows(list);
		res.setSize(rows);
		res.setTotal(total);
		return res;
	}
	@Override
	public List<Salary> findAll() {
		// TODO Auto-generated method stub
		
		return this.salaryMapper.selectByExample(null);
	}
	@Override
	public void addSalary(Salary sa) {
		// TODO Auto-generated method stub
		this.salaryMapper.insertSelective(sa);
	}

}
