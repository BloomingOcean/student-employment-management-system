package com.liyang.sems.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@ApiModel(value = "档案")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "archives")
public class Archives {

    @Id
    @ApiModelProperty(value = "档案关系id(主键)")
    @Column(name = "archives_relationship_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer archivesRelationshipId;

    @Column(name = "agent_type")
    @ApiModelProperty(value = "代理类型")
    private String agentType;

    @Column(name = "w_organizational_relationship")
    @ApiModelProperty(value = "有无组织关系")
    private String wOrganizationalRelationship;

    @Column(name = "talent_agency_logo")
    @ApiModelProperty(value = "人才代理标志")
    private String talentAgencyLogo;

    @Column(name = "flexible_contract_sign")
    @ApiModelProperty(value = "灵活合同标志")
    private String flexibleContractSign;

    @Column(name = "flexible_contract_unit_name")
    @ApiModelProperty(value = "灵活合同单位名称")
    private String flexibleContractUnitName;

    @Column(name = "stu_id")
    @ApiModelProperty(value = "学生id")
    private Integer stuId;


}