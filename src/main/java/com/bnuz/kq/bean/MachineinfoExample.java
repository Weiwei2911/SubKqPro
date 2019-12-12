package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.List;

public class MachineinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineinfoExample() {
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

        public Criteria andMacIdIsNull() {
            addCriterion("Mac_id is null");
            return (Criteria) this;
        }

        public Criteria andMacIdIsNotNull() {
            addCriterion("Mac_id is not null");
            return (Criteria) this;
        }

        public Criteria andMacIdEqualTo(Integer value) {
            addCriterion("Mac_id =", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotEqualTo(Integer value) {
            addCriterion("Mac_id <>", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThan(Integer value) {
            addCriterion("Mac_id >", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mac_id >=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThan(Integer value) {
            addCriterion("Mac_id <", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThanOrEqualTo(Integer value) {
            addCriterion("Mac_id <=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdIn(List<Integer> values) {
            addCriterion("Mac_id in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotIn(List<Integer> values) {
            addCriterion("Mac_id not in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdBetween(Integer value1, Integer value2) {
            addCriterion("Mac_id between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Mac_id not between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacNameIsNull() {
            addCriterion("Mac_name is null");
            return (Criteria) this;
        }

        public Criteria andMacNameIsNotNull() {
            addCriterion("Mac_name is not null");
            return (Criteria) this;
        }

        public Criteria andMacNameEqualTo(String value) {
            addCriterion("Mac_name =", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotEqualTo(String value) {
            addCriterion("Mac_name <>", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameGreaterThan(String value) {
            addCriterion("Mac_name >", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameGreaterThanOrEqualTo(String value) {
            addCriterion("Mac_name >=", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLessThan(String value) {
            addCriterion("Mac_name <", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLessThanOrEqualTo(String value) {
            addCriterion("Mac_name <=", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLike(String value) {
            addCriterion("Mac_name like", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotLike(String value) {
            addCriterion("Mac_name not like", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameIn(List<String> values) {
            addCriterion("Mac_name in", values, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotIn(List<String> values) {
            addCriterion("Mac_name not in", values, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameBetween(String value1, String value2) {
            addCriterion("Mac_name between", value1, value2, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotBetween(String value1, String value2) {
            addCriterion("Mac_name not between", value1, value2, "macName");
            return (Criteria) this;
        }

        public Criteria andMacIpIsNull() {
            addCriterion("Mac_ip is null");
            return (Criteria) this;
        }

        public Criteria andMacIpIsNotNull() {
            addCriterion("Mac_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMacIpEqualTo(String value) {
            addCriterion("Mac_ip =", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpNotEqualTo(String value) {
            addCriterion("Mac_ip <>", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpGreaterThan(String value) {
            addCriterion("Mac_ip >", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpGreaterThanOrEqualTo(String value) {
            addCriterion("Mac_ip >=", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpLessThan(String value) {
            addCriterion("Mac_ip <", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpLessThanOrEqualTo(String value) {
            addCriterion("Mac_ip <=", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpLike(String value) {
            addCriterion("Mac_ip like", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpNotLike(String value) {
            addCriterion("Mac_ip not like", value, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpIn(List<String> values) {
            addCriterion("Mac_ip in", values, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpNotIn(List<String> values) {
            addCriterion("Mac_ip not in", values, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpBetween(String value1, String value2) {
            addCriterion("Mac_ip between", value1, value2, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacIpNotBetween(String value1, String value2) {
            addCriterion("Mac_ip not between", value1, value2, "macIp");
            return (Criteria) this;
        }

        public Criteria andMacPortIsNull() {
            addCriterion("Mac_port is null");
            return (Criteria) this;
        }

        public Criteria andMacPortIsNotNull() {
            addCriterion("Mac_port is not null");
            return (Criteria) this;
        }

        public Criteria andMacPortEqualTo(String value) {
            addCriterion("Mac_port =", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortNotEqualTo(String value) {
            addCriterion("Mac_port <>", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortGreaterThan(String value) {
            addCriterion("Mac_port >", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortGreaterThanOrEqualTo(String value) {
            addCriterion("Mac_port >=", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortLessThan(String value) {
            addCriterion("Mac_port <", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortLessThanOrEqualTo(String value) {
            addCriterion("Mac_port <=", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortLike(String value) {
            addCriterion("Mac_port like", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortNotLike(String value) {
            addCriterion("Mac_port not like", value, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortIn(List<String> values) {
            addCriterion("Mac_port in", values, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortNotIn(List<String> values) {
            addCriterion("Mac_port not in", values, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortBetween(String value1, String value2) {
            addCriterion("Mac_port between", value1, value2, "macPort");
            return (Criteria) this;
        }

        public Criteria andMacPortNotBetween(String value1, String value2) {
            addCriterion("Mac_port not between", value1, value2, "macPort");
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