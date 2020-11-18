package com.liyang.sems.dao;

import com.liyang.sems.core.Mapper;
import com.liyang.sems.model.ClassBj;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.type.JdbcType;

@org.apache.ibatis.annotations.Mapper
public interface ClassMapper extends Mapper<ClassBj> {
}