package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@ApiModel(value = "学生基础信息表")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "stu_id")
    @ApiModelProperty(value = "学号(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stuId;

    @Column(name = "name")
    @ApiModelProperty(value = "名字")
    private String name;

    @Column(name = "gender")
    @ApiModelProperty(value = "性别")
    private String gender;

    @Column(name = "nation")
    @ApiModelProperty(value = "民族")
    private String nation;

    @Column(name = "birthday")
    @ApiModelProperty(value = "生日")
    private String birthday;
//    private Date birthday;

    @Column(name = "political_status")
    @ApiModelProperty(value = "政治面貌")
    private String politicalStatus;

    @Column(name = "id_number")
    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @Column(name = "only_child")
    @ApiModelProperty(value = "独生子女")
    private String onlyChild;

    @Column(name = "phone_number")
    @ApiModelProperty(value = "电话号码")
    private String phoneNumber;

    @Column(name = "email")
    @ApiModelProperty(value = "电子邮件")
    private String email;

    @Column(name = "qq_number")
    @ApiModelProperty(value = "qq号码")
    private String qqNumber;

    @Column(name = "counselor_id")
    @ApiModelProperty(value = "辅导员id")
    private Integer counselorId;

    @Column(name = "student_status_id")
    @ApiModelProperty(value = "学籍信息id")
    private Integer studentStatusId;

    @Column(name = "hukou_id")
    @ApiModelProperty(value = "户口id")
    private Integer hukouId;

    @Column(name = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    @Column(name = "class_bj_id")
    @ApiModelProperty(value = "所在班级ID")
    private Integer classBjId;

    @Column(name = "course_id")
    @ApiModelProperty(value = "课程ID")
    private Integer courseId;

}