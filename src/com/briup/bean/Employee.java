package com.briup.bean;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 员工类
 * */
public class Employee {
    private String id;

    private String name;

    private String password;

    private String gender;

    private Date birthday;

    private String email;
    /**
     * 员工所属于的部门id<Br>
     * 这个值 等于部门表的id值
     * */
    private String depId;
    /**
     * 员工所属于的部门name<Br>
     * 这个值 等于部门表的name值
     * */
    private String depName;
    /**
     * 员工的角色<Br>
     * 本项目设计有三个角色<Br>
     * <li>经理
     * <Li>福经理
     * <Li>职员
     * */
    private String impRole;
    /**
     * 工资<Br>
     * 这个BigDecimal可以由1， 1。1 转换而来<Br>
     * BigDecimal bd1 = BigDecimal.valueOf(1);<Br>
     * BigDecimal bd2 = BigDecimal.valueOf(10.1);<Br>
     * */
    private BigDecimal salary;

    private String tel;
    /**
     * 描述，简介
     * */
    private String info;
    /**
     * 员工的状态，<Br>
     * 设计上有两种状态<Br>
     * <li> 0 : 在职
     * <Li> 1 : 离职
     * 
     * */
    private BigDecimal implstate;
    
    
    private Integer start;
    private Integer rows;
    

    public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public String getImpRole() {
        return impRole;
    }

    public void setImpRole(String impRole) {
        this.impRole = impRole == null ? null : impRole.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public BigDecimal getImplstate() {
        return implstate;
    }

    public void setImplstate(BigDecimal implstate) {
        this.implstate = implstate;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}