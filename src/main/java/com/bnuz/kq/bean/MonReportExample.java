package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.List;

public class MonReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonReportExample() {
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

        public Criteria andEnrollnumberIsNull() {
            addCriterion("Enrollnumber is null");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberIsNotNull() {
            addCriterion("Enrollnumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberEqualTo(String value) {
            addCriterion("Enrollnumber =", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotEqualTo(String value) {
            addCriterion("Enrollnumber <>", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberGreaterThan(String value) {
            addCriterion("Enrollnumber >", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Enrollnumber >=", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLessThan(String value) {
            addCriterion("Enrollnumber <", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLessThanOrEqualTo(String value) {
            addCriterion("Enrollnumber <=", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLike(String value) {
            addCriterion("Enrollnumber like", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotLike(String value) {
            addCriterion("Enrollnumber not like", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberIn(List<String> values) {
            addCriterion("Enrollnumber in", values, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotIn(List<String> values) {
            addCriterion("Enrollnumber not in", values, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberBetween(String value1, String value2) {
            addCriterion("Enrollnumber between", value1, value2, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotBetween(String value1, String value2) {
            addCriterion("Enrollnumber not between", value1, value2, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTrueNumIsNull() {
            addCriterion("true_num is null");
            return (Criteria) this;
        }

        public Criteria andTrueNumIsNotNull() {
            addCriterion("true_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNumEqualTo(Integer value) {
            addCriterion("true_num =", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumNotEqualTo(Integer value) {
            addCriterion("true_num <>", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumGreaterThan(Integer value) {
            addCriterion("true_num >", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("true_num >=", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumLessThan(Integer value) {
            addCriterion("true_num <", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumLessThanOrEqualTo(Integer value) {
            addCriterion("true_num <=", value, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumIn(List<Integer> values) {
            addCriterion("true_num in", values, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumNotIn(List<Integer> values) {
            addCriterion("true_num not in", values, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumBetween(Integer value1, Integer value2) {
            addCriterion("true_num between", value1, value2, "trueNum");
            return (Criteria) this;
        }

        public Criteria andTrueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("true_num not between", value1, value2, "trueNum");
            return (Criteria) this;
        }

        public Criteria andBadNumIsNull() {
            addCriterion("bad_num is null");
            return (Criteria) this;
        }

        public Criteria andBadNumIsNotNull() {
            addCriterion("bad_num is not null");
            return (Criteria) this;
        }

        public Criteria andBadNumEqualTo(Integer value) {
            addCriterion("bad_num =", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumNotEqualTo(Integer value) {
            addCriterion("bad_num <>", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumGreaterThan(Integer value) {
            addCriterion("bad_num >", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_num >=", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumLessThan(Integer value) {
            addCriterion("bad_num <", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumLessThanOrEqualTo(Integer value) {
            addCriterion("bad_num <=", value, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumIn(List<Integer> values) {
            addCriterion("bad_num in", values, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumNotIn(List<Integer> values) {
            addCriterion("bad_num not in", values, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumBetween(Integer value1, Integer value2) {
            addCriterion("bad_num between", value1, value2, "badNum");
            return (Criteria) this;
        }

        public Criteria andBadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_num not between", value1, value2, "badNum");
            return (Criteria) this;
        }

        public Criteria andOtHourIsNull() {
            addCriterion("ot_hour is null");
            return (Criteria) this;
        }

        public Criteria andOtHourIsNotNull() {
            addCriterion("ot_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOtHourEqualTo(Integer value) {
            addCriterion("ot_hour =", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourNotEqualTo(Integer value) {
            addCriterion("ot_hour <>", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourGreaterThan(Integer value) {
            addCriterion("ot_hour >", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("ot_hour >=", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourLessThan(Integer value) {
            addCriterion("ot_hour <", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourLessThanOrEqualTo(Integer value) {
            addCriterion("ot_hour <=", value, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourIn(List<Integer> values) {
            addCriterion("ot_hour in", values, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourNotIn(List<Integer> values) {
            addCriterion("ot_hour not in", values, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourBetween(Integer value1, Integer value2) {
            addCriterion("ot_hour between", value1, value2, "otHour");
            return (Criteria) this;
        }

        public Criteria andOtHourNotBetween(Integer value1, Integer value2) {
            addCriterion("ot_hour not between", value1, value2, "otHour");
            return (Criteria) this;
        }

        public Criteria andNormalWageIsNull() {
            addCriterion("normal_wage is null");
            return (Criteria) this;
        }

        public Criteria andNormalWageIsNotNull() {
            addCriterion("normal_wage is not null");
            return (Criteria) this;
        }

        public Criteria andNormalWageEqualTo(Double value) {
            addCriterion("normal_wage =", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageNotEqualTo(Double value) {
            addCriterion("normal_wage <>", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageGreaterThan(Double value) {
            addCriterion("normal_wage >", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageGreaterThanOrEqualTo(Double value) {
            addCriterion("normal_wage >=", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageLessThan(Double value) {
            addCriterion("normal_wage <", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageLessThanOrEqualTo(Double value) {
            addCriterion("normal_wage <=", value, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageIn(List<Double> values) {
            addCriterion("normal_wage in", values, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageNotIn(List<Double> values) {
            addCriterion("normal_wage not in", values, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageBetween(Double value1, Double value2) {
            addCriterion("normal_wage between", value1, value2, "normalWage");
            return (Criteria) this;
        }

        public Criteria andNormalWageNotBetween(Double value1, Double value2) {
            addCriterion("normal_wage not between", value1, value2, "normalWage");
            return (Criteria) this;
        }

        public Criteria andDedWageIsNull() {
            addCriterion("ded_wage is null");
            return (Criteria) this;
        }

        public Criteria andDedWageIsNotNull() {
            addCriterion("ded_wage is not null");
            return (Criteria) this;
        }

        public Criteria andDedWageEqualTo(Double value) {
            addCriterion("ded_wage =", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageNotEqualTo(Double value) {
            addCriterion("ded_wage <>", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageGreaterThan(Double value) {
            addCriterion("ded_wage >", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageGreaterThanOrEqualTo(Double value) {
            addCriterion("ded_wage >=", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageLessThan(Double value) {
            addCriterion("ded_wage <", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageLessThanOrEqualTo(Double value) {
            addCriterion("ded_wage <=", value, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageIn(List<Double> values) {
            addCriterion("ded_wage in", values, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageNotIn(List<Double> values) {
            addCriterion("ded_wage not in", values, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageBetween(Double value1, Double value2) {
            addCriterion("ded_wage between", value1, value2, "dedWage");
            return (Criteria) this;
        }

        public Criteria andDedWageNotBetween(Double value1, Double value2) {
            addCriterion("ded_wage not between", value1, value2, "dedWage");
            return (Criteria) this;
        }

        public Criteria andOtWageIsNull() {
            addCriterion("ot_wage is null");
            return (Criteria) this;
        }

        public Criteria andOtWageIsNotNull() {
            addCriterion("ot_wage is not null");
            return (Criteria) this;
        }

        public Criteria andOtWageEqualTo(Double value) {
            addCriterion("ot_wage =", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageNotEqualTo(Double value) {
            addCriterion("ot_wage <>", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageGreaterThan(Double value) {
            addCriterion("ot_wage >", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageGreaterThanOrEqualTo(Double value) {
            addCriterion("ot_wage >=", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageLessThan(Double value) {
            addCriterion("ot_wage <", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageLessThanOrEqualTo(Double value) {
            addCriterion("ot_wage <=", value, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageIn(List<Double> values) {
            addCriterion("ot_wage in", values, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageNotIn(List<Double> values) {
            addCriterion("ot_wage not in", values, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageBetween(Double value1, Double value2) {
            addCriterion("ot_wage between", value1, value2, "otWage");
            return (Criteria) this;
        }

        public Criteria andOtWageNotBetween(Double value1, Double value2) {
            addCriterion("ot_wage not between", value1, value2, "otWage");
            return (Criteria) this;
        }

        public Criteria andLastWagesIsNull() {
            addCriterion("last_wages is null");
            return (Criteria) this;
        }

        public Criteria andLastWagesIsNotNull() {
            addCriterion("last_wages is not null");
            return (Criteria) this;
        }

        public Criteria andLastWagesEqualTo(Double value) {
            addCriterion("last_wages =", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesNotEqualTo(Double value) {
            addCriterion("last_wages <>", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesGreaterThan(Double value) {
            addCriterion("last_wages >", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesGreaterThanOrEqualTo(Double value) {
            addCriterion("last_wages >=", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesLessThan(Double value) {
            addCriterion("last_wages <", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesLessThanOrEqualTo(Double value) {
            addCriterion("last_wages <=", value, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesIn(List<Double> values) {
            addCriterion("last_wages in", values, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesNotIn(List<Double> values) {
            addCriterion("last_wages not in", values, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesBetween(Double value1, Double value2) {
            addCriterion("last_wages between", value1, value2, "lastWages");
            return (Criteria) this;
        }

        public Criteria andLastWagesNotBetween(Double value1, Double value2) {
            addCriterion("last_wages not between", value1, value2, "lastWages");
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