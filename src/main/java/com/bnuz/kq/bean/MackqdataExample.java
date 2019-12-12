package com.bnuz.kq.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MackqdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MackqdataExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andMacNameIsNull() {
            addCriterion("mac_name is null");
            return (Criteria) this;
        }

        public Criteria andMacNameIsNotNull() {
            addCriterion("mac_name is not null");
            return (Criteria) this;
        }

        public Criteria andMacNameEqualTo(String value) {
            addCriterion("mac_name =", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotEqualTo(String value) {
            addCriterion("mac_name <>", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameGreaterThan(String value) {
            addCriterion("mac_name >", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameGreaterThanOrEqualTo(String value) {
            addCriterion("mac_name >=", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLessThan(String value) {
            addCriterion("mac_name <", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLessThanOrEqualTo(String value) {
            addCriterion("mac_name <=", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameLike(String value) {
            addCriterion("mac_name like", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotLike(String value) {
            addCriterion("mac_name not like", value, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameIn(List<String> values) {
            addCriterion("mac_name in", values, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotIn(List<String> values) {
            addCriterion("mac_name not in", values, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameBetween(String value1, String value2) {
            addCriterion("mac_name between", value1, value2, "macName");
            return (Criteria) this;
        }

        public Criteria andMacNameNotBetween(String value1, String value2) {
            addCriterion("mac_name not between", value1, value2, "macName");
            return (Criteria) this;
        }

        public Criteria andKqNumIsNull() {
            addCriterion("kq_num is null");
            return (Criteria) this;
        }

        public Criteria andKqNumIsNotNull() {
            addCriterion("kq_num is not null");
            return (Criteria) this;
        }

        public Criteria andKqNumEqualTo(Integer value) {
            addCriterion("kq_num =", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumNotEqualTo(Integer value) {
            addCriterion("kq_num <>", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumGreaterThan(Integer value) {
            addCriterion("kq_num >", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("kq_num >=", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumLessThan(Integer value) {
            addCriterion("kq_num <", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumLessThanOrEqualTo(Integer value) {
            addCriterion("kq_num <=", value, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumIn(List<Integer> values) {
            addCriterion("kq_num in", values, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumNotIn(List<Integer> values) {
            addCriterion("kq_num not in", values, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumBetween(Integer value1, Integer value2) {
            addCriterion("kq_num between", value1, value2, "kqNum");
            return (Criteria) this;
        }

        public Criteria andKqNumNotBetween(Integer value1, Integer value2) {
            addCriterion("kq_num not between", value1, value2, "kqNum");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andWorkNoteIsNull() {
            addCriterion("work_note is null");
            return (Criteria) this;
        }

        public Criteria andWorkNoteIsNotNull() {
            addCriterion("work_note is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNoteEqualTo(Integer value) {
            addCriterion("work_note =", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteNotEqualTo(Integer value) {
            addCriterion("work_note <>", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteGreaterThan(Integer value) {
            addCriterion("work_note >", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_note >=", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteLessThan(Integer value) {
            addCriterion("work_note <", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteLessThanOrEqualTo(Integer value) {
            addCriterion("work_note <=", value, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteIn(List<Integer> values) {
            addCriterion("work_note in", values, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteNotIn(List<Integer> values) {
            addCriterion("work_note not in", values, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteBetween(Integer value1, Integer value2) {
            addCriterion("work_note between", value1, value2, "workNote");
            return (Criteria) this;
        }

        public Criteria andWorkNoteNotBetween(Integer value1, Integer value2) {
            addCriterion("work_note not between", value1, value2, "workNote");
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