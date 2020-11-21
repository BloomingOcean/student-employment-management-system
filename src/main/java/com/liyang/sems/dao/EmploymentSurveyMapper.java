package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.EmploymentSurvey;
import com.liyang.sems.model.EmploymentUnit;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface EmploymentSurveyMapper extends Mapper<EmploymentSurvey> {

    @Results({
            @Result(column="employment_survey_id", property="employmentSurveyId", jdbcType = JdbcType.INTEGER),
            @Result(column="expected_work_area", property="expectedWorkArea", jdbcType = JdbcType.VARCHAR),
            @Result(column="expected_place_work", property="expectedPlaceWork", jdbcType = JdbcType.VARCHAR),
            @Result(column="expected_unit_nature", property="expectedUnitNature", jdbcType = JdbcType.VARCHAR),
            @Result(column="graduate_expected_salary", property="graduateExpectedSalary", jdbcType = JdbcType.DECIMAL),
            @Result(column="w_entry_higher_school", property="wEntryHigherSchool", jdbcType = JdbcType.VARCHAR),
            @Result(column="work_professional_relevance", property="workProfessionalRelevance", jdbcType = JdbcType.VARCHAR),
            @Result(column="instruction_manual", property="instructionManual", jdbcType = JdbcType.VARCHAR),
            @Result(column="statistics_graduatio", property="statisticsGraduatio", jdbcType = JdbcType.VARCHAR),
            @Result(column="stu_id", property="stuId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 通过userId获得用户就业意向信息
     * @param stuId
     */
    @Select("SELECT * from employment_survey " +
            "WHERE stu_id=#{stuId};")
    EmploymentSurvey getInfoByUserId(@Param("stuId") Integer stuId);

}