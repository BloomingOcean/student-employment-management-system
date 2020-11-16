package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "辅导员")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "counselor")
public class Counselor {

    @Id
    @Column(name = "counselor_id")
    @ApiModelProperty(value = "辅导员id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer counselorId;

    @Column(name = "name")
    @ApiModelProperty(value = "辅导员姓名")
    private String name;

    @Column(name = "phone_number")
    @ApiModelProperty(value = "电话")
    private Integer phoneNumber;

}