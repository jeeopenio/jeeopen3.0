package com.jeeopen.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeeopen.system.mapper.ProjectMapper;
import com.jeeopen.system.domain.Project;
import com.jeeopen.system.service.IProjectService;
import com.jeeopen.common.support.Convert;

/**
 * 检验项目  服务层实现
 * 
 * @author jeeopen
 * @date 2018-11-27
 */
@Service
public class ProjectServiceImpl implements IProjectService 
{
	@Autowired
	private ProjectMapper projectMapper;

	/**
     * 查询检验项目 信息
     * 
     * @param id 检验项目 ID
     * @return 检验项目 信息
     */
    @Override
	public Project selectProjectById(Long id)
	{
	    return projectMapper.selectProjectById(id);
	}
	
	/**
     * 查询检验项目 列表
     * 
     * @param project 检验项目 信息
     * @return 检验项目 集合
     */
	@Override
	public List<Project> selectProjectList(Project project)
	{
	    return projectMapper.selectProjectList(project);
	}
	
    /**
     * 新增检验项目 
     * 
     * @param project 检验项目 信息
     * @return 结果
     */
	@Override
	public int insertProject(Project project)
	{
	    return projectMapper.insertProject(project);
	}
	
	/**
     * 修改检验项目 
     * 
     * @param project 检验项目 信息
     * @return 结果
     */
	@Override
	public int updateProject(Project project)
	{
	    return projectMapper.updateProject(project);
	}

	/**
     * 删除检验项目 对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProjectByIds(String ids)
	{
		return projectMapper.deleteProjectByIds(Convert.toStrArray(ids));
	}
	
}
