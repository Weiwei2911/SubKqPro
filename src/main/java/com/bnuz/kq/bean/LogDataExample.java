package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.List;

public class LogDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogDataExample() {
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
            addCriterion("EnrollNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberIsNotNull() {
            addCriterion("EnrollNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberEqualTo(String value) {
            addCriterion("EnrollNumber =", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotEqualTo(String value) {
            addCriterion("EnrollNumber <>", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberGreaterThan(String value) {
            addCriterion("EnrollNumber >", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberGreaterThanOrEqualTo(String value) {
            addCriterion("EnrollNumber >=", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLessThan(String value) {
            addCriterion("EnrollNumber <", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLessThanOrEqualTo(String value) {
            addCriterion("EnrollNumber <=", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberLike(String value) {
            addCriterion("EnrollNumber like", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotLike(String value) {
            addCriterion("EnrollNumber not like", value, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberIn(List<String> values) {
            addCriterion("EnrollNumber in", values, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotIn(List<String> values) {
            addCriterion("EnrollNumber not in", values, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberBetween(String value1, String value2) {
            addCriterion("EnrollNumber between", value1, value2, "enrollnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollnumberNotBetween(String value1, String value2) {
            addCriterion("EnrollNumber not between", value1, value2, "enrollnumber");
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

        public Criteria andVerifymodeIsNull() {
            addCriterion("VerifyMode is null");
            return (Criteria) this;
        }

        public Criteria andVerifymodeIsNotNull() {
            addCriterion("VerifyMode is not null");
            return (Criteria) this;
        }

        public Criteria andVerifymodeEqualTo(String value) {
            addCriterion("VerifyMode =", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeNotEqualTo(String value) {
            addCriterion("VerifyMode <>", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeGreaterThan(String value) {
            addCriterion("VerifyMode >", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeGreaterThanOrEqualTo(String value) {
            addCriterion("VerifyMode >=", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeLessThan(String value) {
            addCriterion("VerifyMode <", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeLessThanOrEqualTo(String value) {
            addCriterion("VerifyMode <=", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeLike(String value) {
            addCriterion("VerifyMode like", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeNotLike(String value) {
            addCriterion("VerifyMode not like", value, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeIn(List<String> values) {
            addCriterion("VerifyMode in", values, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeNotIn(List<String> values) {
            addCriterion("VerifyMode not in", values, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeBetween(String value1, String value2) {
            addCriterion("VerifyMode between", value1, value2, "verifymode");
            return (Criteria) this;
        }

        public Criteria andVerifymodeNotBetween(String value1, String value2) {
            addCriterion("VerifyMode not between", value1, value2, "verifymode");
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

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("Year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("Year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("Month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("Month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("Month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("Month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("Month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("Month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("Month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("Month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("Month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("Month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("Month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("Month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("Month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("Month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("Day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("Day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(String value) {
            addCriterion("Day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(String value) {
            addCriterion("Day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(String value) {
            addCriterion("Day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(String value) {
            addCriterion("Day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(String value) {
            addCriterion("Day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(String value) {
            addCriterion("Day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLike(String value) {
            addCriterion("Day like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotLike(String value) {
            addCriterion("Day not like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<String> values) {
            addCriterion("Day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<String> values) {
            addCriterion("Day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(String value1, String value2) {
            addCriterion("Day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(String value1, String value2) {
            addCriterion("Day not between", value1, value2, "day");
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

        public Criteria andMinuteIsNull() {
            addCriterion("Minute is null");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNotNull() {
            addCriterion("Minute is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteEqualTo(String value) {
            addCriterion("Minute =", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotEqualTo(String value) {
            addCriterion("Minute <>", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThan(String value) {
            addCriterion("Minute >", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThanOrEqualTo(String value) {
            addCriterion("Minute >=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThan(String value) {
            addCriterion("Minute <", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThanOrEqualTo(String value) {
            addCriterion("Minute <=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLike(String value) {
            addCriterion("Minute like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotLike(String value) {
            addCriterion("Minute not like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteIn(List<String> values) {
            addCriterion("Minute in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotIn(List<String> values) {
            addCriterion("Minute not in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteBetween(String value1, String value2) {
            addCriterion("Minute between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotBetween(String value1, String value2) {
            addCriterion("Minute not between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andSecondIsNull() {
            addCriterion("Second is null");
            return (Criteria) this;
        }

        public Criteria andSecondIsNotNull() {
            addCriterion("Second is not null");
            return (Criteria) this;
        }

        public Criteria andSecondEqualTo(String value) {
            addCriterion("Second =", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotEqualTo(String value) {
            addCriterion("Second <>", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondGreaterThan(String value) {
            addCriterion("Second >", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondGreaterThanOrEqualTo(String value) {
            addCriterion("Second >=", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondLessThan(String value) {
            addCriterion("Second <", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondLessThanOrEqualTo(String value) {
            addCriterion("Second <=", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondLike(String value) {
            addCriterion("Second like", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotLike(String value) {
            addCriterion("Second not like", value, "second");
            return (Criteria) this;
        }

        public Criteria andSecondIn(List<String> values) {
            addCriterion("Second in", values, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotIn(List<String> values) {
            addCriterion("Second not in", values, "second");
            return (Criteria) this;
        }

        public Criteria andSecondBetween(String value1, String value2) {
            addCriterion("Second between", value1, value2, "second");
            return (Criteria) this;
        }

        public Criteria andSecondNotBetween(String value1, String value2) {
            addCriterion("Second not between", value1, value2, "second");
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