package com.jeeopen.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jeeopen.common.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 检验项目 表 laboratory_project
 * 
 * @author jeeopen
 * @date 2018-11-27
 */
public class Project extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Long id;
	/** 检验分类 */
	private String projectClass;
	/** 项目编码 */
	private String projectCode;
	/** 检验名称 */
	private String projectName;
	/** 英文名称 */
	private String enName;
	/** 产品规格 */
	private String projectSpec;
	/** 产品说明 */
	private String projectCaption;
	/** 单价 */
	private BigDecimal projectPrice;
	/** 状态 */
	private String status;
	/** 耗材编号 */
	private String consumableCodes;
	/** 耗材名称 */
	private String consumableNames;
	/** 创建人 */
	private Long createdBy;
	/** 创建时间 */
	private Date createdData;
	/** 更新人 */
	private Long updatedBy;
	/** 更新时间 */
	private Date updatedData;
	/** 备注信息 */
	private String remarks;
	/** 删除标记 */
	private String delFlag;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setProjectClass(String projectClass) 
	{
		this.projectClass = projectClass;
	}

	public String getProjectClass() 
	{
		return projectClass;
	}
	public void setProjectCode(String projectCode) 
	{
		this.projectCode = projectCode;
	}

	public String getProjectCode() 
	{
		return projectCode;
	}
	public void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}

	public String getProjectName() 
	{
		return projectName;
	}
	public void setEnName(String enName) 
	{
		this.enName = enName;
	}

	public String getEnName() 
	{
		return enName;
	}
	public void setProjectSpec(String projectSpec) 
	{
		this.projectSpec = projectSpec;
	}

	public String getProjectSpec() 
	{
		return projectSpec;
	}
	public void setProjectCaption(String projectCaption) 
	{
		this.projectCaption = projectCaption;
	}

	public String getProjectCaption() 
	{
		return projectCaption;
	}
	public void setProjectPrice(BigDecimal projectPrice) 
	{
		this.projectPrice = projectPrice;
	}

	public BigDecimal getProjectPrice() 
	{
		return projectPrice;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setConsumableCodes(String consumableCodes) 
	{
		this.consumableCodes = consumableCodes;
	}

	public String getConsumableCodes() 
	{
		return consumableCodes;
	}
	public void setConsumableNames(String consumableNames) 
	{
		this.consumableNames = consumableNames;
	}

	public String getConsumableNames() 
	{
		return consumableNames;
	}
	public void setCreatedBy(Long createdBy) 
	{
		this.createdBy = createdBy;
	}

	public Long getCreatedBy() 
	{
		return createdBy;
	}
	public void setCreatedData(Date createdData) 
	{
		this.createdData = createdData;
	}

	public Date getCreatedData() 
	{
		return createdData;
	}
	public void setUpdatedBy(Long updatedBy) 
	{
		this.updatedBy = updatedBy;
	}

	public Long getUpdatedBy() 
	{
		return updatedBy;
	}
	public void setUpdatedData(Date updatedData) 
	{
		this.updatedData = updatedData;
	}

	public Date getUpdatedData() 
	{
		return updatedData;
	}
	public void setRemarks(String remarks) 
	{
		this.remarks = remarks;
	}

	public String getRemarks() 
	{
		return remarks;
	}
	public void setDelFlag(String delFlag) 
	{
		this.delFlag = delFlag;
	}

	public String getDelFlag() 
	{
		return delFlag;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectClass", getProjectClass())
            .append("projectCode", getProjectCode())
            .append("projectName", getProjectName())
            .append("enName", getEnName())
            .append("projectSpec", getProjectSpec())
            .append("projectCaption", getProjectCaption())
            .append("projectPrice", getProjectPrice())
            .append("status", getStatus())
            .append("consumableCodes", getConsumableCodes())
            .append("consumableNames", getConsumableNames())
            .append("createdBy", getCreatedBy())
            .append("createdData", getCreatedData())
            .append("updatedBy", getUpdatedBy())
            .append("updatedData", getUpdatedData())
            .append("remarks", getRemarks())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
