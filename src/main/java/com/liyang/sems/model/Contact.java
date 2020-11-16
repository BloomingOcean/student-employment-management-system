package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "联系方式")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact")
public class Contact {

    @Id
    @Column(name = "contact_id")
    @ApiModelProperty(value = "联系方式id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contactId;

    @Column(name = "relationship")
    @ApiModelProperty(value = "关系")
    private String relationship;

    @Column(name = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    @Column(name = "phone_number")
    @ApiModelProperty(value = "电话号码")
    private Integer phoneNumber;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;


}