package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Contact;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

@org.apache.ibatis.annotations.Mapper
public interface ContactMapper extends Mapper<Contact> {

    @Results({
            @Result(column="contact_id", property="contactId", jdbcType = JdbcType.INTEGER),
            @Result(column="relationship", property="relationship", jdbcType = JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType = JdbcType.VARCHAR),
            @Result(column="phone_number", property="phoneNumber", jdbcType = JdbcType.INTEGER),
            @Result(column="stu_id", property="stuId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 通过userId获得用户关系
     * @param stuId
     */
    @Select("SELECT * from contact " +
            "WHERE stu_id=#{stuId};")
    Contact getInfoByUserId(@Param("stuId") Integer stuId);
}