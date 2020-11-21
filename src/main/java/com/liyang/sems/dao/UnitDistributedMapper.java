package com.liyang.sems.dao;

import com.liyang.sems.model.EmploymentUnit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UnitDistributedMapper {

    @Results({
            @Result(column="count", property="unitNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column="expected_unit_nature", property="unitNature", jdbcType = JdbcType.VARCHAR)
    })

    /**
     * 获得各种单位的人数
     * @return 各种单位的人数
     */
    @Select("select count(*) as count, expected_unit_nature FROM employment_survey e,student s " +
            "WHERE e.stu_id=s.stu_id " +
            "group by expected_unit_nature;")
    List<EmploymentUnit> getUnitDistributed();
}
