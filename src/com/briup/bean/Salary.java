package com.briup.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Salary {
    private String id;

    private String empId;

    private String depId;

    private Date salTime;

    private BigDecimal baseSalary;

    private BigDecimal overtimePay;

    private BigDecimal leaveFee;

    private BigDecimal absentPay;

    private BigDecimal total;

    private BigDecimal salaystate;

    private String empName;

    private String depName;
    
    
    private String year;
    private String month;

    public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    public Date getSalTime() {
        return salTime;
    }

    public void setSalTime(Date salTime) {
        this.salTime = salTime;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(BigDecimal overtimePay) {
        this.overtimePay = overtimePay;
    }

    public BigDecimal getLeaveFee() {
        return leaveFee;
    }

    public void setLeaveFee(BigDecimal leaveFee) {
        this.leaveFee = leaveFee;
    }

    public BigDecimal getAbsentPay() {
        return absentPay;
    }

    public void setAbsentPay(BigDecimal absentPay) {
        this.absentPay = absentPay;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSalaystate() {
        return salaystate;
    }

    public void setSalaystate(BigDecimal salaystate) {
        this.salaystate = salaystate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }
}