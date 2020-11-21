package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.EmploymentInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

@org.apache.ibatis.annotations.Mapper
public interface EmploymentInfoMapper extends Mapper<EmploymentInfo> {

    @Results({
            @Result(column="employment_info_id", property="employmentInfoId", jdbcType = JdbcType.INTEGER),
            @Result(column="unit_id", property="unitId", jdbcType = JdbcType.INTEGER),
//            @Result(column="dispatch_time", property="dispatchTime", jdbcType = JdbcType.DATE),
            @Result(column="dispatch_time", property="dispatchTime", jdbcType = JdbcType.VARCHAR),
            @Result(column="dispatch_registration_card_number", property="dispatchRegistrationCardNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column="registration_certificate_issuance_category", property="registrationCertificateIssuanceCategory", jdbcType = JdbcType.VARCHAR),
            @Result(column="signed_unit_location", property="signedUnitLocation", jdbcType = JdbcType.VARCHAR),
            @Result(column="relocation_unit_name", property="relocationUnitName", jdbcType = JdbcType.VARCHAR),
            @Result(column="file_forwarding_unit_postcode", property="fileForwardingUnitPostcode", jdbcType = JdbcType.VARCHAR),
            @Result(column="file_forwarding_unit", property="fileForwardingUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column="file_forwarding_address", property="fileForwardingAddress", jdbcType = JdbcType.VARCHAR),
//            @Result(column="entry_date", property="entryDate", jdbcType = JdbcType.DATE),
            @Result(column="entry_date", property="entryDate", jdbcType = JdbcType.VARCHAR),
            @Result(column="graduate_whereabouts", property="graduateWhereabouts", jdbcType = JdbcType.VARCHAR),
            @Result(column="special_Instructions", property="specialInstructions", jdbcType = JdbcType.VARCHAR),
            @Result(column="occupational_category", property="occupationalCategory", jdbcType = JdbcType.VARCHAR),
            @Result(column="job_satisfaction", property="jobSatisfaction", jdbcType = JdbcType.VARCHAR),
            @Result(column="conscript_soldiers", property="conscriptSoldiers", jdbcType = JdbcType.VARCHAR),
            @Result(column="w_employment", property="wEmployment", jdbcType = JdbcType.VARCHAR),
            @Result(column="other_info", property="otherInfo", jdbcType = JdbcType.VARCHAR),
            @Result(column="stu_id", property="stuId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 通过userId获得用户就业信息
     * @param stuId
     */
    @Select("SELECT * from employment_info " +
            "WHERE stu_id=#{stuId};")
    EmploymentInfo getInfoByUserId(@Param("stuId") Integer stuId);

    /**
     * 获取已就业人数
     * @return 已就业人数
     */
    @Select("SELECT COUNT(*) FROM student s, employment_info e " +
            "WHERE s.stu_id=e.stu_id " +
            "AND w_employment='1'")
    Integer getUnemploymentNumber();

    /**
     * 获取未就业人数
     * @return 未就业人数
     */
    @Select("SELECT COUNT(*) FROM student s, employment_info e " +
            "WHERE s.stu_id=e.stu_id " +
            "AND w_employment='0'")
    Integer getEmploymentNumber();

    /**
     * 获得就业人数
     * @return 就业人数
     */
    @Select("select COUNT(*) FROM employment_info e,student s " +
            "WHERE e.stu_id=s.stu_id;")
    Integer getEmploymentAllNumber();
}