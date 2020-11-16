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
@ApiModel(value = "户口")
@Table(name = "hukou")
public class Hukou {

    @Id
    @Column(name = "hukou_id")
    @ApiModelProperty(value = "户口信息id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hukouId;

    @Column(name = "postal_code")
    @ApiModelProperty(value = "邮政编码")
    private String postalCode;

    @Column(name = "poverty_level")
    @ApiModelProperty(value = "贫困等级")
    private String povertyLevel;

    @Column(name = "code_number")
    @ApiModelProperty(value = "代码编号")
    private String codeNumber;

    @Column(name = "police_station_address")
    @ApiModelProperty(value = "派出所地址")
    private String policeStationAddress;

    @Column(name = "family_address")
    @ApiModelProperty(value = "家庭地址")
    private String familyAddress;
}
