package com.briup.mapper;

import com.briup.bean.Department;
import com.briup.bean.DepartmentExample;
import com.briup.bean.Employee;
import com.briup.bean.vo.DepartmentVo;
import com.briup.bean.vo.EmployeeVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);
    List<Department> selectByExamplePage(DepartmentVo vo);

    Department selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
//    @Select(value = " select e.* from (select id,name,password,gender,birthday,email,dep_id,dep_name,imp_role,salary,tel,info,implstate,rownum rw from employee) e where 	e.rw >= #{0} and e.rw<=#{1}")
//    List<Department> getDepartmentByPage(int min, int max);
}