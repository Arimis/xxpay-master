package shop.payover.datalib.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PermissionExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public PermissionExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andAccess_typeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccess_typeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_typeEqualTo(String value) {
            addCriterion("access_type =", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotEqualTo(String value) {
            addCriterion("access_type <>", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeGreaterThan(String value) {
            addCriterion("access_type >", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeGreaterThanOrEqualTo(String value) {
            addCriterion("access_type >=", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLessThan(String value) {
            addCriterion("access_type <", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLessThanOrEqualTo(String value) {
            addCriterion("access_type <=", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeLike(String value) {
            addCriterion("access_type like", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotLike(String value) {
            addCriterion("access_type not like", value, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeIn(List<String> values) {
            addCriterion("access_type in", values, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotIn(List<String> values) {
            addCriterion("access_type not in", values, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeBetween(String value1, String value2) {
            addCriterion("access_type between", value1, value2, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_typeNotBetween(String value1, String value2) {
            addCriterion("access_type not between", value1, value2, "access_type");
            return (Criteria) this;
        }

        public Criteria andAccess_valueIsNull() {
            addCriterion("access_value is null");
            return (Criteria) this;
        }

        public Criteria andAccess_valueIsNotNull() {
            addCriterion("access_value is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_valueEqualTo(String value) {
            addCriterion("access_value =", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueNotEqualTo(String value) {
            addCriterion("access_value <>", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueGreaterThan(String value) {
            addCriterion("access_value >", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueGreaterThanOrEqualTo(String value) {
            addCriterion("access_value >=", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueLessThan(String value) {
            addCriterion("access_value <", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueLessThanOrEqualTo(String value) {
            addCriterion("access_value <=", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueLike(String value) {
            addCriterion("access_value like", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueNotLike(String value) {
            addCriterion("access_value not like", value, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueIn(List<String> values) {
            addCriterion("access_value in", values, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueNotIn(List<String> values) {
            addCriterion("access_value not in", values, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueBetween(String value1, String value2) {
            addCriterion("access_value between", value1, value2, "access_value");
            return (Criteria) this;
        }

        public Criteria andAccess_valueNotBetween(String value1, String value2) {
            addCriterion("access_value not between", value1, value2, "access_value");
            return (Criteria) this;
        }

        public Criteria andIs_openIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIs_openIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIs_openEqualTo(String value) {
            addCriterion("is_open =", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotEqualTo(String value) {
            addCriterion("is_open <>", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openGreaterThan(String value) {
            addCriterion("is_open >", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openGreaterThanOrEqualTo(String value) {
            addCriterion("is_open >=", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openLessThan(String value) {
            addCriterion("is_open <", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openLessThanOrEqualTo(String value) {
            addCriterion("is_open <=", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openLike(String value) {
            addCriterion("is_open like", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotLike(String value) {
            addCriterion("is_open not like", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openIn(List<String> values) {
            addCriterion("is_open in", values, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotIn(List<String> values) {
            addCriterion("is_open not in", values, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openBetween(String value1, String value2) {
            addCriterion("is_open between", value1, value2, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotBetween(String value1, String value2) {
            addCriterion("is_open not between", value1, value2, "is_open");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlIsNull() {
            addCriterion("data_range_ctl is null");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlIsNotNull() {
            addCriterion("data_range_ctl is not null");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlEqualTo(String value) {
            addCriterion("data_range_ctl =", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlNotEqualTo(String value) {
            addCriterion("data_range_ctl <>", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlGreaterThan(String value) {
            addCriterion("data_range_ctl >", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlGreaterThanOrEqualTo(String value) {
            addCriterion("data_range_ctl >=", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlLessThan(String value) {
            addCriterion("data_range_ctl <", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlLessThanOrEqualTo(String value) {
            addCriterion("data_range_ctl <=", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlLike(String value) {
            addCriterion("data_range_ctl like", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlNotLike(String value) {
            addCriterion("data_range_ctl not like", value, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlIn(List<String> values) {
            addCriterion("data_range_ctl in", values, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlNotIn(List<String> values) {
            addCriterion("data_range_ctl not in", values, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlBetween(String value1, String value2) {
            addCriterion("data_range_ctl between", value1, value2, "data_range_ctl");
            return (Criteria) this;
        }

        public Criteria andData_range_ctlNotBetween(String value1, String value2) {
            addCriterion("data_range_ctl not between", value1, value2, "data_range_ctl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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