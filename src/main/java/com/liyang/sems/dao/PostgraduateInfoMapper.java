package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.PostgraduateInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

@org.apache.ibatis.annotations.Mapper
public interface PostgraduateInfoMapper extends Mapper<PostgraduateInfo> {

    @Results({
            @Result(column="postgraduate_info_id", property="postgraduateInfoId", jdbcType = JdbcType.INTEGER),
            @Result(column="match_major", property="matchMajor", jdbcType = JdbcType.VARCHAR),
            @Result(column="proceed_college", property="proceedCollege", jdbcType = JdbcType.VARCHAR),
            @Result(column="report_card_number", property="reportCardNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column="school_postcode", property="schoolPostcode", jdbcType = JdbcType.VARCHAR),
            @Result(column="forwarding_college_files", property="forwardingCollegeFiles", jdbcType = JdbcType.VARCHAR),
            @Result(column="location_admission_institution", property="locationAdmissionInstitution", jdbcType = JdbcType.VARCHAR),
            @Result(column="recipient_progression_file", property="recipientProgressionFile", jdbcType = JdbcType.VARCHAR),
            @Result(column="recipient_phone_number", property="recipientPhoneNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column="w_fulltime_postgraduate", property="wFulltimePostgraduate", jdbcType = JdbcType.VARCHAR),
            @Result(column="w_exempt_graduate_students", property="wExemptGraduateStudents", jdbcType = JdbcType.VARCHAR),
            @Result(column="orientation_commissioning_unit", property="orientationCommissioningUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column="stu_id", property="stuId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 通过userId获得用户考研信息
     * @param stuId
     */
    @Select("SELECT * from postgraduate_info " +
            "WHERE stu_id=#{stuId};")
    PostgraduateInfo getInfoByUserId(@Param("stuId") Integer stuId);
}