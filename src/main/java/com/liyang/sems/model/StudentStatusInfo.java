package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "考生表")
@Table(name = "student_status_info")
public class StudentStatusInfo {

    @Id
    @Column(name = "student_status_id")
    @ApiModelProperty(value = "考生号码(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentStatusId;

    @Column(name = "student_status_id_bofore")
    @ApiModelProperty(value = "原考生号")
    private Integer studentStatusIdBofore;

    @Column(name = "enrollment_time")
    @ApiModelProperty(value = "入校时间")
    private Date enrollmentTime;

    @Column(name = "graduation_time")
    @ApiModelProperty(value = "毕业时间")
    private Date graduationTime;

    @Column(name = "difficult_students_category")
    @ApiModelProperty(value = "困难生类别")
    private String difficultStudentsCategory;

    @Column(name = "birth_place")
    @ApiModelProperty(value = "生源所在地")
    private String birthPlace;

    @Column(name = "w_student_status")
    @ApiModelProperty(value = "学籍是否变动")
    private String wStudentStatus;

    @Column(name = "w_drop_out")
    @ApiModelProperty(value = "留级退学标志")
    private String wDropOut;

    @Column(name = "situation_employed")
    @ApiModelProperty(value = "在校任职情况")
    private String situationEmployed;

    @Column(name = "situation_comprehensive_evaluation")
    @ApiModelProperty(value = "综合评测情况")
    private String situationComprehensiveEvaluation;

    @Column(name = "w_file_transfer")
    @ApiModelProperty(value = "档案是否转入学校")
    private String wFileTransfer;

    @Column(name = "w_account_transfer")
    @ApiModelProperty(value = "户口是否转入学校")
    private String wAccountTransfer;

    @Column(name = "before_file_unit")
    @ApiModelProperty(value = "入学前档案所在单位")
    private String beforeFileUnit;

    @Column(name = "specialty_id")
    @ApiModelProperty(value = "专业id")
    private Integer specialtyId;

    @Column(name = "school_id")
    @ApiModelProperty(value = "学校id")
    private Integer schoolId;

}