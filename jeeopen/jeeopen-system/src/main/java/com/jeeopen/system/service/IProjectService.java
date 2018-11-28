package com.jeeopen.system.service;

import com.jeeopen.system.domain.Project;
import java.util.List;

/**
 * 检验项目  服务层
 * 
 * @author jeeopen
 * @date 2018-11-27
 */
public interface IProjectService 
{
	/**
     * 查询检验项目 信息
     * 
     * @param id 检验项目 ID
     * @return 检验项目 信息
     */
	public Project selectProjectById(Long id);
	
	/**
     * 查询检验项目 列表
     * 
     * @param project 检验项目 信息
     * @return 检验项目 集合
     */
	public List<Project> selectProjectList(Project project);
	
	/**
     * 新增检验项目 
     * 
     * @param project 检验项目 信息
     * @return 结果
     */
	public int insertProject(Project project);
	
	/**
     * 修改检验项目 
     * 
     * @param project 检验项目 信息
     * @return 结果
     */
	public int updateProject(Project project);
		
	/**
     * 删除检验项目 信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectByIds(String ids);
	
}
