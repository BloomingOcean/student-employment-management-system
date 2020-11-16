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
@ApiModel(value = "学校")
@Table(name = "school")
public class School {

    @Id
    @Column(name = "school_id")
    @ApiModelProperty(value = "学校id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolId;

    @Column(name = "campus")
    @ApiModelProperty(value = "所在校区")
    private String campus;

    @Column(name = "branch_school_name")
    @ApiModelProperty(value = "分校名称")
    private String branchSchoolName;

    @Column(name = "school_name")
    @ApiModelProperty(value = "院校名称")
    private String schoolName;

    @Column(name = "school_code")
    @ApiModelProperty(value = "院校代码")
    private String schoolCode;

    @Column(name = "province_code")
    @ApiModelProperty(value = "院校所在省份代码")
    private String provinceCode;

    @Column(name = "location_code")
    @ApiModelProperty(value = "院校所在地代码")
    private String locationCode;

    @Column(name = "department_code")
    @ApiModelProperty(value = "院校隶属部门代码")
    private String departmentCode;
}
