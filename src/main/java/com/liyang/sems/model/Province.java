package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "省份信息")
public class Province {

    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @ApiModelProperty(value = "省份人数")
    private String peopleNumber;
}
