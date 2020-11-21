package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(value = "就业单位")
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentUnit {

    @ApiModelProperty(value = "单位性质")
    private String unitNature;

    @ApiModelProperty(value = "单位人数")
    private String unitNumber;
}
