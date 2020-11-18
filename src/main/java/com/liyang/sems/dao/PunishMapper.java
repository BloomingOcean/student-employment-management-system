package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Punish;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

@org.mapstruct.Mapper
public interface PunishMapper extends Mapper<Punish> {

    @Results({
            @Result(column = "punish_id", property = "punishId", jdbcType = JdbcType.INTEGER),
            @Result(column = "level", property = "level", jdbcType = JdbcType.VARCHAR),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "date", property = "date", jdbcType = JdbcType.DATE),
            @Result(column = "manager_name", property = "managerName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "reasons", property = "reasons", jdbcType = JdbcType.VARCHAR),
            @Result(column = "stu_id", property = "stuId", jdbcType = JdbcType.INTEGER)
    })

    /**
     * 通过userId获得用户处罚信息
     * @param stuId
     */
    @Select("SELECT * from punish " +
            "WHERE stu_id=#{stuId};")
    Punish getInfoByUserId(@Param("stuId") Integer stuId);
}