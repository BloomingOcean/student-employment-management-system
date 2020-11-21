package com.liyang.sems.service.impl;

import com.liyang.sems.core.Result;
import com.liyang.sems.core.ResultGenerator;
import com.liyang.sems.dao.EmploymentInfoMapper;
import com.liyang.sems.dao.PostgraduateInfoMapper;
import com.liyang.sems.dao.StudentMapper;
import com.liyang.sems.model.Student;
import com.liyang.sems.service.StudentService;
import com.liyang.sems.core.AbstractService;
import io.swagger.models.auth.In;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


/**
 * Created by LiYang on 2020/11/12.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Resource
    private EmploymentInfoMapper employmentInfoMapper;

    @Resource
    private PostgraduateInfoMapper postgraduateInfoMapper;

    /**
     * 获取同一个班级的所有学生信息
     * @param classId 班级ID
     * @return 同一个班级的所有学生信息
     */
    public List<Student> getClassmate(Integer classId) {
        return studentMapper.getClassmate(classId);
    }

    /**
     * 修改学生密码
     * @param pass 新密码
     * @param stuId 学生id
     * @return 是否成功
     */
    public Result changePass(String pass, Integer stuId) {
        ResultGenerator generator = new ResultGenerator();
        Result result = generator.genSuccessResult(studentMapper.changePass(pass, stuId));
        System.out.println("studentresult"+result);
        return result;
    }

    /**
     * 获取学生中男女生数量
     * @return 男女生数量
     */
    public Result getClassGenger() {
        HashMap hashMap = new HashMap();
        hashMap.put("girlNumber",studentMapper.girlNumber());
        hashMap.put("boyNumber",studentMapper.boyNumber());
        ResultGenerator generator = new ResultGenerator();
        Result result = generator.genSuccessResult(hashMap);
        return result;
    }

    /**
     * 获取各个期望薪资水平的人数
     * @return 各个水平的人数
     */
    public Result getExpectedSalary(){
        HashMap hashMap = new HashMap<>();
        hashMap.put("0000-4000", studentMapper.getExpectedSalary0_4());
        hashMap.put("4000-8000", studentMapper.getExpectedSalary4_8());
        hashMap.put("8000-12000", studentMapper.getExpectedSalary8_12());
        hashMap.put("12000-16000", studentMapper.getExpectedSalary12_16());
        hashMap.put("16000-20000", studentMapper.getExpectedSalary16_20());
        ResultGenerator generator = new ResultGenerator();
        Result result = generator.genSuccessResult(hashMap);
        return result;
    }

    /**
     * 获得考研、就业人数
     * @return 考研、就业人数
     */
    public Result getPostEmplNumber() {
        HashMap hashMap = new HashMap<>();
        hashMap.put("EmploymentAllNumber", employmentInfoMapper.getEmploymentAllNumber());
        hashMap.put("PostgraduateAllNumber", postgraduateInfoMapper.getPostgraduateAllNumber());
        ResultGenerator resultGenerator = new ResultGenerator();
        return resultGenerator.genSuccessResult(hashMap);
    }
}
