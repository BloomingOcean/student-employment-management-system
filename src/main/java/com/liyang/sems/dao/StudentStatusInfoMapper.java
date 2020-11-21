package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.Province;
import com.liyang.sems.model.StudentStatusInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StudentStatusInfoMapper extends Mapper<StudentStatusInfo> {

    @Results(id = "province", value = {
            @Result(column="count", property="peopleNumber", jdbcType = JdbcType.VARCHAR),
            @Result(column="birth_place", property="provinceName", jdbcType = JdbcType.VARCHAR),
    })

    /**
     * 获得各个省份人数分布
     * @return 各个省份人数
     */
//    @ResultMap("province")
    @Select("select count(*) as count,birth_place FROM student_status_info ss,student s WHERE ss.student_status_id=s.student_status_id group by birth_place; ")
    List<Province> getProvinceInfo();
}