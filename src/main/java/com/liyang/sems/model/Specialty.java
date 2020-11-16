package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "专业")
@Table(name = "specialty")
public class Specialty {

    @Id
    @Column(name = "specialty_id")
    @ApiModelProperty(value = "专业信息ID(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer specialtyId;

    @Column(name = "education")
    @ApiModelProperty(value = "学历")
    private String education;

    @Column(name = "schooling_length")
    @ApiModelProperty(value = "学制")
    private String schoolingLength;

    @Column(name = "subject_category")
    @ApiModelProperty(value = "学科门类")
    private String subjectCategory;

    @Column(name = "professional_name")
    @ApiModelProperty(value = "专业名称")
    private String professionalName;

    @Column(name = "department")
    @ApiModelProperty(value = "所在院系")
    private String department;

    @Column(name = "in_class")
    @ApiModelProperty(value = "所在班级")
    private String inClass;

    @Column(name = "training_method")
    @ApiModelProperty(value = "培养方式")
    private String trainingMethod;

    @Column(name = "w_normal_school")
    @ApiModelProperty(value = "是否师范")
    private String wNormalSchool;

    @Column(name = "normal_stu_category")
    @ApiModelProperty(value = "师范生类别")
    private String normalStuCategory;

    @Column(name = "major_foreign_languages")
    @ApiModelProperty(value = "主修外语语种")
    private String majorForeignLanguages;

}