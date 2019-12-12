package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.List;

public class KqInfolistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KqInfolistExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("Time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("Time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andHourIsNull() {
            addCriterion("Hour is null");
            return (Criteria) this;
        }

        public Criteria andHourIsNotNull() {
            addCriterion("Hour is not null");
            return (Criteria) this;
        }

        public Criteria andHourEqualTo(String value) {
            addCriterion("Hour =", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotEqualTo(String value) {
            addCriterion("Hour <>", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThan(String value) {
            addCriterion("Hour >", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThanOrEqualTo(String value) {
            addCriterion("Hour >=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThan(String value) {
            addCriterion("Hour <", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThanOrEqualTo(String value) {
            addCriterion("Hour <=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLike(String value) {
            addCriterion("Hour like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotLike(String value) {
            addCriterion("Hour not like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourIn(List<String> values) {
            addCriterion("Hour in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotIn(List<String> values) {
            addCriterion("Hour not in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourBetween(String value1, String value2) {
            addCriterion("Hour between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotBetween(String value1, String value2) {
            addCriterion("Hour not between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("StartTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("StartTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("EndTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("EndTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andInoutmodeIsNull() {
            addCriterion("InOutMode is null");
            return (Criteria) this;
        }

        public Criteria andInoutmodeIsNotNull() {
            addCriterion("InOutMode is not null");
            return (Criteria) this;
        }

        public Criteria andInoutmodeEqualTo(String value) {
            addCriterion("InOutMode =", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeNotEqualTo(String value) {
            addCriterion("InOutMode <>", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeGreaterThan(String value) {
            addCriterion("InOutMode >", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeGreaterThanOrEqualTo(String value) {
            addCriterion("InOutMode >=", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeLessThan(String value) {
            addCriterion("InOutMode <", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeLessThanOrEqualTo(String value) {
            addCriterion("InOutMode <=", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeLike(String value) {
            addCriterion("InOutMode like", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeNotLike(String value) {
            addCriterion("InOutMode not like", value, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeIn(List<String> values) {
            addCriterion("InOutMode in", values, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeNotIn(List<String> values) {
            addCriterion("InOutMode not in", values, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeBetween(String value1, String value2) {
            addCriterion("InOutMode between", value1, value2, "inoutmode");
            return (Criteria) this;
        }

        public Criteria andInoutmodeNotBetween(String value1, String value2) {
            addCriterion("InOutMode not between", value1, value2, "inoutmode");
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