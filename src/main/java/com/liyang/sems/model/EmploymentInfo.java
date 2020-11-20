package com.liyang.sems.model;

import com.alibaba.fastjson.annotation.JSONField;
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
@ApiModel(value = "就业信息")
@Table(name = "employment_info")
public class EmploymentInfo {

    @Id
    @Column(name = "employment_info_id")
    @ApiModelProperty(value = "就业信息id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employmentInfoId;

    @Column(name = "unit_id")
    @ApiModelProperty(value = "单位id")
    private Integer unitId;

//    @JSONField(format = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @Column(name = "dispatch_time")
    @ApiModelProperty(value = "派遣时间")
    private String dispatchTime;
//    private Date dispatchTime;

    @Column(name = "dispatch_registration_card_number")
    @ApiModelProperty(value = "派遣报到证号")
    private String dispatchRegistrationCardNumber;

    @Column(name = "registration_certificate_issuance_category")
    @ApiModelProperty(value = "报到证件签发类别")
    private String registrationCertificateIssuanceCategory;

    @Column(name = "signed_unit_location")
    @ApiModelProperty(value = "签往单位所在地")
    private String signedUnitLocation;

    @Column(name = "relocation_unit_name")
    @ApiModelProperty(value = "报到证迁往单位名称")
    private String relocationUnitName;

    @Column(name = "file_forwarding_unit_postcode")
    @ApiModelProperty(value = "档案转寄单位邮编")
    private String fileForwardingUnitPostcode;

    @Column(name = "file_forwarding_unit")
    @ApiModelProperty(value = "档案转寄单位")
    private String fileForwardingUnit;

    @Column(name = "file_forwarding_address")
    @ApiModelProperty(value = "档案转寄地址")
    private String fileForwardingAddress;

//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "entry_date")
    @ApiModelProperty(value = "录入日期")
    private String entryDate;
//    private Date entryDate;

    @Column(name = "graduate_whereabouts")
    @ApiModelProperty(value = "毕业去向")
    private String graduateWhereabouts;

    @Column(name = "special_Instructions")
    @ApiModelProperty(value = "特殊说明")
    private String specialInstructions;

    @Column(name = "occupational_category")
    @ApiModelProperty(value = "职业类别")
    private String occupationalCategory;

    @Column(name = "job_satisfaction")
    @ApiModelProperty(value = "就业满意度")
    private String jobSatisfaction;

    @Column(name = "conscript_soldiers")
    @ApiModelProperty(value = "应征义务兵")
    private String conscriptSoldiers;

    @Column(name = "w_employment")
    @ApiModelProperty(value = "是否就业标志")
    private String wEmployment;

    @Column(name = "other_info")
    @ApiModelProperty(value = "其它信息")
    private String otherInfo;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;

}