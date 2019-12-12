package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.List;

public class WorkMonthsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkMonthsExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("Mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("Mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("Mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("Mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("Mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("Mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("Mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("Mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("Mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("Mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("Mid not between", value1, value2, "mid");
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

        public Criteria andStartdayIsNull() {
            addCriterion("startday is null");
            return (Criteria) this;
        }

        public Criteria andStartdayIsNotNull() {
            addCriterion("startday is not null");
            return (Criteria) this;
        }

        public Criteria andStartdayEqualTo(String value) {
            addCriterion("startday =", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotEqualTo(String value) {
            addCriterion("startday <>", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThan(String value) {
            addCriterion("startday >", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayGreaterThanOrEqualTo(String value) {
            addCriterion("startday >=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThan(String value) {
            addCriterion("startday <", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLessThanOrEqualTo(String value) {
            addCriterion("startday <=", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayLike(String value) {
            addCriterion("startday like", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotLike(String value) {
            addCriterion("startday not like", value, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayIn(List<String> values) {
            addCriterion("startday in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotIn(List<String> values) {
            addCriterion("startday not in", values, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayBetween(String value1, String value2) {
            addCriterion("startday between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andStartdayNotBetween(String value1, String value2) {
            addCriterion("startday not between", value1, value2, "startday");
            return (Criteria) this;
        }

        public Criteria andEnddayIsNull() {
            addCriterion("endday is null");
            return (Criteria) this;
        }

        public Criteria andEnddayIsNotNull() {
            addCriterion("endday is not null");
            return (Criteria) this;
        }

        public Criteria andEnddayEqualTo(String value) {
            addCriterion("endday =", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotEqualTo(String value) {
            addCriterion("endday <>", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayGreaterThan(String value) {
            addCriterion("endday >", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayGreaterThanOrEqualTo(String value) {
            addCriterion("endday >=", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayLessThan(String value) {
            addCriterion("endday <", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayLessThanOrEqualTo(String value) {
            addCriterion("endday <=", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayLike(String value) {
            addCriterion("endday like", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotLike(String value) {
            addCriterion("endday not like", value, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayIn(List<String> values) {
            addCriterion("endday in", values, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotIn(List<String> values) {
            addCriterion("endday not in", values, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayBetween(String value1, String value2) {
            addCriterion("endday between", value1, value2, "endday");
            return (Criteria) this;
        }

        public Criteria andEnddayNotBetween(String value1, String value2) {
            addCriterion("endday not between", value1, value2, "endday");
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