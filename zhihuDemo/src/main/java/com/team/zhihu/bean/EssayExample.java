package com.team.zhihu.bean;

import java.util.ArrayList;
import java.util.List;

public class EssayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EssayExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNull() {
            addCriterion("goodnum is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNotNull() {
            addCriterion("goodnum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumEqualTo(Integer value) {
            addCriterion("goodnum =", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotEqualTo(Integer value) {
            addCriterion("goodnum <>", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThan(Integer value) {
            addCriterion("goodnum >", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodnum >=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThan(Integer value) {
            addCriterion("goodnum <", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("goodnum <=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIn(List<Integer> values) {
            addCriterion("goodnum in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotIn(List<Integer> values) {
            addCriterion("goodnum not in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumBetween(Integer value1, Integer value2) {
            addCriterion("goodnum between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("goodnum not between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTopictypeIsNull() {
            addCriterion("topictype is null");
            return (Criteria) this;
        }

        public Criteria andTopictypeIsNotNull() {
            addCriterion("topictype is not null");
            return (Criteria) this;
        }

        public Criteria andTopictypeEqualTo(Integer value) {
            addCriterion("topictype =", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeNotEqualTo(Integer value) {
            addCriterion("topictype <>", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeGreaterThan(Integer value) {
            addCriterion("topictype >", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("topictype >=", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeLessThan(Integer value) {
            addCriterion("topictype <", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeLessThanOrEqualTo(Integer value) {
            addCriterion("topictype <=", value, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeIn(List<Integer> values) {
            addCriterion("topictype in", values, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeNotIn(List<Integer> values) {
            addCriterion("topictype not in", values, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeBetween(Integer value1, Integer value2) {
            addCriterion("topictype between", value1, value2, "topictype");
            return (Criteria) this;
        }

        public Criteria andTopictypeNotBetween(Integer value1, Integer value2) {
            addCriterion("topictype not between", value1, value2, "topictype");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
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