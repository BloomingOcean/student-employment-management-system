package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Archives;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@org.apache.ibatis.annotations.Mapper
public interface ArchivesMapper extends Mapper<Archives> {

    @Results(id = "archives" , value = {
            @Result(column="archives_relationship_id", property="archivesRelationshipId", jdbcType = JdbcType.INTEGER),
            @Result(column="agent_type", property="agentType", jdbcType = JdbcType.VARCHAR),
            @Result(column="w_organizational_relationship", property="wOrganizationalRelationship", jdbcType = JdbcType.VARCHAR),
            @Result(column="talent_agency_logo", property="talentAgencyLogo", jdbcType = JdbcType.VARCHAR),
            @Result(column="flexible_contract_sign", property="flexibleContractSign", jdbcType = JdbcType.VARCHAR),
            @Result(column="flexible_contract_unit_name", property="flexibleContractUnitName", jdbcType = JdbcType.VARCHAR),
            @Result(column="stu_id", property="stuId", jdbcType = JdbcType.INTEGER),
    })

    /**
     * 通过userId获得用户档案信息
     * @param stuId
     */
    @Select("SELECT * from archives " +
            "WHERE stu_id=#{stuId};")
    Archives getInfoByUserId(@Param("stuId") Integer stuId);
}