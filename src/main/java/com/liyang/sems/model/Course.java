package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "课程")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_id")
    @ApiModelProperty(value = "班级id(主键)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    @Column(name = "name")
    @ApiModelProperty(value = "课程名称")
    private String name;

    @Column(name = "w_professional_course")
    @ApiModelProperty(value = "是否是专业课（副科）")
    private String wProfessionalCourse;

}