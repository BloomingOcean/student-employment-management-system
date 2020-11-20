package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@ApiModel(value = "教师基础信息表")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    @ApiModelProperty(value = "教师号(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;

    @Column(name = "name")
    @ApiModelProperty(value = "教师姓名")
    private String name;

    @Column(name = "job_number")
    @ApiModelProperty(value = "教师工号")
    private Integer jobNumber;

    @Column(name = "gender")
    @ApiModelProperty(value = "教师性别")
    private String gender;

    @Column(name = "nation")
    @ApiModelProperty(value = "民族")
    private String nation;

    @Column(name = "birth_date")
    @ApiModelProperty(value = "出生日期")
    private String birthDate;
//    private Date birthDate;

    @Column(name = "political_status")
    @ApiModelProperty(value = "政治面貌")
    private String politicalStatus;

    @Column(name = "id_number")
    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @Column(name = "teacher_grade")
    @ApiModelProperty(value = "教师等级")
    private String teacherGrade;

    @Column(name = "address")
    @ApiModelProperty(value = "家庭地址")
    private String address;

    @Column(name = "phone_number")
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @Column(name = "email")
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @Column(name = "qq_number")
    @ApiModelProperty(value = "QQ号码")
    private String qqNumber;

    @Column(name = "course_id")
    @ApiModelProperty(value = "课程id")
    private Integer courseId;

    @Column(name = "password")
    @ApiModelProperty(value = "老师密码")
    private String password;


}