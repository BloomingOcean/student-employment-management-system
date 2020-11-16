package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "单位")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "unit")
public class Unit {

    @Id
    @Column(name = "unit_id")
    @ApiModelProperty(value = "单位id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer unitId;

    @Column(name = "unit_name")
    @ApiModelProperty(value = "单位名称")
    private String unitName;

    @Column(name = "unit_characteristic")
    @ApiModelProperty(value = "单位性质")
    private String unitCharacteristic;

    @Column(name = "unit_organization")
    @ApiModelProperty(value = "单位组织机构")
    private String unitOrganization;

    @Column(name = "unit_industry")
    @ApiModelProperty(value = "单位行业")
    private String unitIndustry;

    @Column(name = "unit_affiliated_department")
    @ApiModelProperty(value = "单位隶属部门")
    private String unitAffiliatedDepartment;

    @Column(name = "unit_postal_code")
    @ApiModelProperty(value = "单位邮编")
    private String unitPostalCode;

    @Column(name = "unit_area")
    @ApiModelProperty(value = "单位所在地区")
    private String unitArea;

    @Column(name = "unit_contact_person")
    @ApiModelProperty(value = "单位联系人")
    private String unitContactPerson;

    @Column(name = "unit_detailed_address")
    @ApiModelProperty(value = "单位具体地址")
    private String unitDetailedAddress;

    @Column(name = "unit_contact_person_number")
    @ApiModelProperty(value = "联系人电话号码")
    private String unitContactPersonNumber;

}
