package com.briup.mapper;

import com.briup.bean.Employee;
import com.briup.bean.EmployeeExample;
import com.briup.bean.vo.EmployeeVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    List<Employee> selectByExamplePage(EmployeeVo vo);

    Employee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    @Select(value = " select e.* from (select id,name,password,gender,birthday,email,dep_id,dep_name,imp_role,salary,tel,info,implstate,rownum rw from employee) e where 	e.rw >= #{0} and e.rw<=#{1}")
    List<Employee> getEmployeeByPage(int min, int max);
}