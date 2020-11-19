package com.liyang.sems.service.impl;

import com.liyang.sems.dao.ClassMapper;
import com.liyang.sems.dao.StudentMapper;
import com.liyang.sems.model.ClassBj;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.ClassService;
import com.liyang.sems.core.AbstractService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by LiYang on 2020/11/16.
 */
@Service
@Transactional
public class ClassServiceImpl extends AbstractService<ClassBj> implements ClassService {
    @Resource
    private ClassMapper classMapper;

    @Resource
    private StudentMapper studentMapper;

    /**
     * 获得同班同学
     * @param className 班级名称
     * @return 同班同学
     */
    public List<Student> getClassMate(String className){
        Integer classId = classMapper.getClassmate(className);
        System.out.println(studentMapper.getClassmate(classId));
        return studentMapper.getClassmate(classId);
    }
}
