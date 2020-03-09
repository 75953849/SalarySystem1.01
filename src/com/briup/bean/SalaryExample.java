package com.briup.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("EMP_ID like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("EMP_ID not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("DEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("DEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(String value) {
            addCriterion("DEP_ID =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(String value) {
            addCriterion("DEP_ID <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(String value) {
            addCriterion("DEP_ID >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_ID >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(String value) {
            addCriterion("DEP_ID <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(String value) {
            addCriterion("DEP_ID <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLike(String value) {
            addCriterion("DEP_ID like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotLike(String value) {
            addCriterion("DEP_ID not like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<String> values) {
            addCriterion("DEP_ID in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<String> values) {
            addCriterion("DEP_ID not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(String value1, String value2) {
            addCriterion("DEP_ID between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(String value1, String value2) {
            addCriterion("DEP_ID not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andSalTimeIsNull() {
            addCriterion("SAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSalTimeIsNotNull() {
            addCriterion("SAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSalTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SAL_TIME =", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAL_TIME <>", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SAL_TIME >", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAL_TIME >=", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeLessThan(Date value) {
            addCriterionForJDBCDate("SAL_TIME <", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAL_TIME <=", value, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SAL_TIME in", values, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAL_TIME not in", values, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAL_TIME between", value1, value2, "salTime");
            return (Criteria) this;
        }

        public Criteria andSalTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAL_TIME not between", value1, value2, "salTime");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("BASE_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("BASE_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(BigDecimal value) {
            addCriterion("BASE_SALARY =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(BigDecimal value) {
            addCriterion("BASE_SALARY <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(BigDecimal value) {
            addCriterion("BASE_SALARY >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_SALARY >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(BigDecimal value) {
            addCriterion("BASE_SALARY <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_SALARY <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<BigDecimal> values) {
            addCriterion("BASE_SALARY in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<BigDecimal> values) {
            addCriterion("BASE_SALARY not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_SALARY between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_SALARY not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andOvertimePayIsNull() {
            addCriterion("OVERTIME_PAY is null");
            return (Criteria) this;
        }

        public Criteria andOvertimePayIsNotNull() {
            addCriterion("OVERTIME_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimePayEqualTo(BigDecimal value) {
            addCriterion("OVERTIME_PAY =", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayNotEqualTo(BigDecimal value) {
            addCriterion("OVERTIME_PAY <>", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayGreaterThan(BigDecimal value) {
            addCriterion("OVERTIME_PAY >", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERTIME_PAY >=", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayLessThan(BigDecimal value) {
            addCriterion("OVERTIME_PAY <", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERTIME_PAY <=", value, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayIn(List<BigDecimal> values) {
            addCriterion("OVERTIME_PAY in", values, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayNotIn(List<BigDecimal> values) {
            addCriterion("OVERTIME_PAY not in", values, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERTIME_PAY between", value1, value2, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andOvertimePayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERTIME_PAY not between", value1, value2, "overtimePay");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeIsNull() {
            addCriterion("LEAVE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeIsNotNull() {
            addCriterion("LEAVE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeEqualTo(BigDecimal value) {
            addCriterion("LEAVE_FEE =", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeNotEqualTo(BigDecimal value) {
            addCriterion("LEAVE_FEE <>", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeGreaterThan(BigDecimal value) {
            addCriterion("LEAVE_FEE >", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEAVE_FEE >=", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeLessThan(BigDecimal value) {
            addCriterion("LEAVE_FEE <", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEAVE_FEE <=", value, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeIn(List<BigDecimal> values) {
            addCriterion("LEAVE_FEE in", values, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeNotIn(List<BigDecimal> values) {
            addCriterion("LEAVE_FEE not in", values, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEAVE_FEE between", value1, value2, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andLeaveFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEAVE_FEE not between", value1, value2, "leaveFee");
            return (Criteria) this;
        }

        public Criteria andAbsentPayIsNull() {
            addCriterion("ABSENT_PAY is null");
            return (Criteria) this;
        }

        public Criteria andAbsentPayIsNotNull() {
            addCriterion("ABSENT_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andAbsentPayEqualTo(BigDecimal value) {
            addCriterion("ABSENT_PAY =", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayNotEqualTo(BigDecimal value) {
            addCriterion("ABSENT_PAY <>", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayGreaterThan(BigDecimal value) {
            addCriterion("ABSENT_PAY >", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ABSENT_PAY >=", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayLessThan(BigDecimal value) {
            addCriterion("ABSENT_PAY <", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ABSENT_PAY <=", value, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayIn(List<BigDecimal> values) {
            addCriterion("ABSENT_PAY in", values, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayNotIn(List<BigDecimal> values) {
            addCriterion("ABSENT_PAY not in", values, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ABSENT_PAY between", value1, value2, "absentPay");
            return (Criteria) this;
        }

        public Criteria andAbsentPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ABSENT_PAY not between", value1, value2, "absentPay");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andSalaystateIsNull() {
            addCriterion("SALAYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSalaystateIsNotNull() {
            addCriterion("SALAYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalaystateEqualTo(BigDecimal value) {
            addCriterion("SALAYSTATE =", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateNotEqualTo(BigDecimal value) {
            addCriterion("SALAYSTATE <>", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateGreaterThan(BigDecimal value) {
            addCriterion("SALAYSTATE >", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALAYSTATE >=", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateLessThan(BigDecimal value) {
            addCriterion("SALAYSTATE <", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALAYSTATE <=", value, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateIn(List<BigDecimal> values) {
            addCriterion("SALAYSTATE in", values, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateNotIn(List<BigDecimal> values) {
            addCriterion("SALAYSTATE not in", values, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALAYSTATE between", value1, value2, "salaystate");
            return (Criteria) this;
        }

        public Criteria andSalaystateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALAYSTATE not between", value1, value2, "salaystate");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNull() {
            addCriterion("DEP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("DEP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("DEP_NAME =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("DEP_NAME <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("DEP_NAME >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_NAME >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("DEP_NAME <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("DEP_NAME <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("DEP_NAME like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("DEP_NAME not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("DEP_NAME in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("DEP_NAME not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("DEP_NAME between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("DEP_NAME not between", value1, value2, "depName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}