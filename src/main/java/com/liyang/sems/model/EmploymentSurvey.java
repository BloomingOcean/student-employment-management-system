package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "就业调查")
@Table(name = "employment_survey")
public class EmploymentSurvey {

    @Id
    @Column(name = "employment_survey_id")
    @ApiModelProperty(value = "就业调查id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employmentSurveyId;

    @Column(name = "expected_work_area")
    @ApiModelProperty(value = "期望工作地域")
    private String expectedWorkArea;

    @Column(name = "expected_place_work")
    @ApiModelProperty(value = "期望工作地点")
    private String expectedPlaceWork;

    @Column(name = "expected_unit_nature")
    @ApiModelProperty(value = "期望单位性质")
    private String expectedUnitNature;

    @Column(name = "graduate_expected_salary")
    @ApiModelProperty(value = "毕业期望薪酬")
    private BigDecimal graduateExpectedSalary;

    @Column(name = "w_entry_higher_school")
    @ApiModelProperty(value = "是否准备升学")
    private String wEntryHigherSchool;

    @Column(name = "work_professional_relevance")
    @ApiModelProperty(value = "工作与专业相关度")
    private String workProfessionalRelevance;

    @Column(name = "instruction_manual")
    @ApiModelProperty(value = "备注说明")
    private String instructionManual;

    @Column(name = "statistics_graduatio")
    @ApiModelProperty(value = "毕业去向情况统计")
    private String statisticsGraduatio;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;

}