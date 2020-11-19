package com.liyang.sems.service;
import com.liyang.sems.model.ClassBj;
import com.liyang.sems.core.Service;
import com.liyang.sems.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by LiYang on 2020/11/16.
 */
public interface ClassService extends Service<ClassBj> {

    List<Student> getClassMate(String className);
}
