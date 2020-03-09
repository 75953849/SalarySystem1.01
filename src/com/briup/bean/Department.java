package com.briup.bean;

import java.math.BigDecimal;
/**
 * 部门类
 * */
public class Department {
    private String id;

    private String name;
    /**
     * 描述
     * */
    private String describe;
    /**
     * 部门人数<Br>
     * 这个BigDecimal可以由1， 1。1 转换而来<Br>
     * BigDecimal bd1 = BigDecimal.valueOf(1);<Br>
     * BigDecimal bd2 = BigDecimal.valueOf(10.1);<Br>
     * */
    private BigDecimal empcount;
    
    
    
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public BigDecimal getEmpcount() {
        return empcount;
    }

    public void setEmpcount(BigDecimal empcount) {
        this.empcount = empcount;
    }
}