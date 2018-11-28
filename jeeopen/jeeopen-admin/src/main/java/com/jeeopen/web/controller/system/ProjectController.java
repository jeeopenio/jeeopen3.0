package com.jeeopen.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jeeopen.common.annotation.Log;
import com.jeeopen.common.enums.BusinessType;
import com.jeeopen.system.domain.Project;
import com.jeeopen.system.service.IProjectService;
import com.jeeopen.framework.web.base.BaseController;
import com.jeeopen.framework.web.page.TableDataInfo;
import com.jeeopen.common.base.AjaxResult;
import com.jeeopen.common.utils.ExcelUtil;

/**
 * 检验项目  信息操作处理
 * 
 * @author jeeopen
 * @date 2018-11-27
 */
@Controller
@RequestMapping("/system/project")
public class ProjectController extends BaseController
{
    private String prefix = "system/project";
	
	@Autowired
	private IProjectService projectService;
	
	@RequiresPermissions("system:project:view")
	@GetMapping()
	public String project()
	{
	    return prefix + "/project";
	}
	
	/**
	 * 查询检验项目 列表
	 */
	@RequiresPermissions("system:project:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Project project)
	{
		startPage();
        List<Project> list = projectService.selectProjectList(project);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出检验项目 列表
	 */
	@RequiresPermissions("system:project:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Project project)
    {
    	List<Project> list = projectService.selectProjectList(project);
        ExcelUtil<Project> util = new ExcelUtil<Project>(Project.class);
        return util.exportExcel(list, "project");
    }
	
	/**
	 * 新增检验项目 
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存检验项目 
	 */
	@RequiresPermissions("system:project:add")
	@Log(title = "检验项目 ", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Project project)
	{		
		return toAjax(projectService.insertProject(project));
	}

	/**
	 * 修改检验项目 
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Project project = projectService.selectProjectById(id);
		mmap.put("project", project);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存检验项目 
	 */
	@RequiresPermissions("system:project:edit")
	@Log(title = "检验项目 ", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Project project)
	{		
		return toAjax(projectService.updateProject(project));
	}
	
	/**
	 * 删除检验项目 
	 */
	@RequiresPermissions("system:project:remove")
	@Log(title = "检验项目 ", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(projectService.deleteProjectByIds(ids));
	}
	
}
