package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "班级")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class_bj")
public class ClassBj {

    @Id
    @Column(name = "class_id")
    @ApiModelProperty(value = "班级id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId;

    @Column(name = "name")
    @ApiModelProperty(value = "班级名称")
    private String name;

}