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
@ApiModel(value = "处分")
@Table(name = "punish")
public class Punish {

    @Id
    @Column(name = "punish_id")
    @ApiModelProperty(value = "处分id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer punishId;

    @Column(name = "level")
    @ApiModelProperty(value = "处分等级")
    private String level;

    @Column(name = "name")
    @ApiModelProperty(value = "处分名称")
    private String name;

    @Column(name = "date")
    @ApiModelProperty(value = "处分日期")
    private Date date;

    @Column(name = "manager_name")
    @ApiModelProperty(value = "经办人姓名")
    private String managerName;

    @Column(name = "reasons")
    @ApiModelProperty(value = "处分理由")
    private String reasons;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;

}