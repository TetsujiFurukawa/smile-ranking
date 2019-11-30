package com.example.demo.entity.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaceExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public FaceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
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

		public Criteria andFaceSeqIsNull() {
			addCriterion("FACE_SEQ is null");
			return (Criteria) this;
		}

		public Criteria andFaceSeqIsNotNull() {
			addCriterion("FACE_SEQ is not null");
			return (Criteria) this;
		}

		public Criteria andFaceSeqEqualTo(Long value) {
			addCriterion("FACE_SEQ =", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqNotEqualTo(Long value) {
			addCriterion("FACE_SEQ <>", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqGreaterThan(Long value) {
			addCriterion("FACE_SEQ >", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("FACE_SEQ >=", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqLessThan(Long value) {
			addCriterion("FACE_SEQ <", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqLessThanOrEqualTo(Long value) {
			addCriterion("FACE_SEQ <=", value, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqIn(List<Long> values) {
			addCriterion("FACE_SEQ in", values, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqNotIn(List<Long> values) {
			addCriterion("FACE_SEQ not in", values, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqBetween(Long value1, Long value2) {
			addCriterion("FACE_SEQ between", value1, value2, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceSeqNotBetween(Long value1, Long value2) {
			addCriterion("FACE_SEQ not between", value1, value2, "faceSeq");
			return (Criteria) this;
		}

		public Criteria andFaceGenderIsNull() {
			addCriterion("FACE_GENDER is null");
			return (Criteria) this;
		}

		public Criteria andFaceGenderIsNotNull() {
			addCriterion("FACE_GENDER is not null");
			return (Criteria) this;
		}

		public Criteria andFaceGenderEqualTo(String value) {
			addCriterion("FACE_GENDER =", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderNotEqualTo(String value) {
			addCriterion("FACE_GENDER <>", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderGreaterThan(String value) {
			addCriterion("FACE_GENDER >", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderGreaterThanOrEqualTo(String value) {
			addCriterion("FACE_GENDER >=", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderLessThan(String value) {
			addCriterion("FACE_GENDER <", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderLessThanOrEqualTo(String value) {
			addCriterion("FACE_GENDER <=", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderLike(String value) {
			addCriterion("FACE_GENDER like", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderNotLike(String value) {
			addCriterion("FACE_GENDER not like", value, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderIn(List<String> values) {
			addCriterion("FACE_GENDER in", values, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderNotIn(List<String> values) {
			addCriterion("FACE_GENDER not in", values, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderBetween(String value1, String value2) {
			addCriterion("FACE_GENDER between", value1, value2, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceGenderNotBetween(String value1, String value2) {
			addCriterion("FACE_GENDER not between", value1, value2, "faceGender");
			return (Criteria) this;
		}

		public Criteria andFaceAgeIsNull() {
			addCriterion("FACE_AGE is null");
			return (Criteria) this;
		}

		public Criteria andFaceAgeIsNotNull() {
			addCriterion("FACE_AGE is not null");
			return (Criteria) this;
		}

		public Criteria andFaceAgeEqualTo(Integer value) {
			addCriterion("FACE_AGE =", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeNotEqualTo(Integer value) {
			addCriterion("FACE_AGE <>", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeGreaterThan(Integer value) {
			addCriterion("FACE_AGE >", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeGreaterThanOrEqualTo(Integer value) {
			addCriterion("FACE_AGE >=", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeLessThan(Integer value) {
			addCriterion("FACE_AGE <", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeLessThanOrEqualTo(Integer value) {
			addCriterion("FACE_AGE <=", value, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeIn(List<Integer> values) {
			addCriterion("FACE_AGE in", values, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeNotIn(List<Integer> values) {
			addCriterion("FACE_AGE not in", values, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeBetween(Integer value1, Integer value2) {
			addCriterion("FACE_AGE between", value1, value2, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceAgeNotBetween(Integer value1, Integer value2) {
			addCriterion("FACE_AGE not between", value1, value2, "faceAge");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessIsNull() {
			addCriterion("FACE_HAPPINESS is null");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessIsNotNull() {
			addCriterion("FACE_HAPPINESS is not null");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessEqualTo(BigDecimal value) {
			addCriterion("FACE_HAPPINESS =", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessNotEqualTo(BigDecimal value) {
			addCriterion("FACE_HAPPINESS <>", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessGreaterThan(BigDecimal value) {
			addCriterion("FACE_HAPPINESS >", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("FACE_HAPPINESS >=", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessLessThan(BigDecimal value) {
			addCriterion("FACE_HAPPINESS <", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessLessThanOrEqualTo(BigDecimal value) {
			addCriterion("FACE_HAPPINESS <=", value, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessIn(List<BigDecimal> values) {
			addCriterion("FACE_HAPPINESS in", values, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessNotIn(List<BigDecimal> values) {
			addCriterion("FACE_HAPPINESS not in", values, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("FACE_HAPPINESS between", value1, value2, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceHappinessNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("FACE_HAPPINESS not between", value1, value2, "faceHappiness");
			return (Criteria) this;
		}

		public Criteria andFaceSmileIsNull() {
			addCriterion("FACE_SMILE is null");
			return (Criteria) this;
		}

		public Criteria andFaceSmileIsNotNull() {
			addCriterion("FACE_SMILE is not null");
			return (Criteria) this;
		}

		public Criteria andFaceSmileEqualTo(BigDecimal value) {
			addCriterion("FACE_SMILE =", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileNotEqualTo(BigDecimal value) {
			addCriterion("FACE_SMILE <>", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileGreaterThan(BigDecimal value) {
			addCriterion("FACE_SMILE >", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("FACE_SMILE >=", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileLessThan(BigDecimal value) {
			addCriterion("FACE_SMILE <", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileLessThanOrEqualTo(BigDecimal value) {
			addCriterion("FACE_SMILE <=", value, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileIn(List<BigDecimal> values) {
			addCriterion("FACE_SMILE in", values, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileNotIn(List<BigDecimal> values) {
			addCriterion("FACE_SMILE not in", values, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("FACE_SMILE between", value1, value2, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andFaceSmileNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("FACE_SMILE not between", value1, value2, "faceSmile");
			return (Criteria) this;
		}

		public Criteria andEnterDateIsNull() {
			addCriterion("ENTER_DATE is null");
			return (Criteria) this;
		}

		public Criteria andEnterDateIsNotNull() {
			addCriterion("ENTER_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andEnterDateEqualTo(Date value) {
			addCriterion("ENTER_DATE =", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotEqualTo(Date value) {
			addCriterion("ENTER_DATE <>", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThan(Date value) {
			addCriterion("ENTER_DATE >", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
			addCriterion("ENTER_DATE >=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThan(Date value) {
			addCriterion("ENTER_DATE <", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateLessThanOrEqualTo(Date value) {
			addCriterion("ENTER_DATE <=", value, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateIn(List<Date> values) {
			addCriterion("ENTER_DATE in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotIn(List<Date> values) {
			addCriterion("ENTER_DATE not in", values, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateBetween(Date value1, Date value2) {
			addCriterion("ENTER_DATE between", value1, value2, "enterDate");
			return (Criteria) this;
		}

		public Criteria andEnterDateNotBetween(Date value1, Date value2) {
			addCriterion("ENTER_DATE not between", value1, value2, "enterDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table FACE
	 * @mbg.generated  Sat Nov 30 13:59:54 JST 2019
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FACE
     *
     * @mbg.generated do_not_delete_during_merge Sat Nov 30 02:48:43 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}