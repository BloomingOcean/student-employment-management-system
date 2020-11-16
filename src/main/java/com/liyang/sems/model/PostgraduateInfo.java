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
@ApiModel(value = "考研信息")
@Table(name = "postgraduate_info")
public class PostgraduateInfo {

    @Id
    @Column(name = "postgraduate_info_id")
    @ApiModelProperty(value = "考研信息ID(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postgraduateInfoId;

    @Column(name = "match_major")
    @ApiModelProperty(value = "专业对口")
    private String matchMajor;

    @Column(name = "proceed_college")
    @ApiModelProperty(value = "升学院校")
    private String proceedCollege;

    @Column(name = "report_card_number")
    @ApiModelProperty(value = "报道证编号")
    private String reportCardNumber;

    @Column(name = "school_postcode")
    @ApiModelProperty(value = "升学院校邮编")
    private String schoolPostcode;

    @Column(name = "forwarding_college_files")
    @ApiModelProperty(value = "升学档案转寄")
    private String forwardingCollegeFiles;

    @Column(name = "location_admission_institution")
    @ApiModelProperty(value = "录取院校所在地")
    private String locationAdmissionInstitution;

    @Column(name = "recipient_progression_file")
    @ApiModelProperty(value = "升学档案接收人")
    private String recipientProgressionFile;

    @Column(name = "recipient_phone_number")
    @ApiModelProperty(value = "接收人联系电话")
    private String recipientPhoneNumber;

    @Column(name = "w_fulltime_postgraduate")
    @ApiModelProperty(value = "是否全日制研究生")
    private String wFulltimePostgraduate;

    @Column(name = "w_exempt_graduate_students")
    @ApiModelProperty(value = "是否免推研究生")
    private String wExemptGraduateStudents;

    @Column(name = "orientation_commissioning_unit")
    @ApiModelProperty(value = "定向或委培单位")
    private String orientationCommissioningUnit;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;

}