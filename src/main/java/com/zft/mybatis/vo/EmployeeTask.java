package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Description: 雇员任务
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:39
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("employeeTask")
public class EmployeeTask {

    private Long id;

    private Long empId;

    private Task task = null;

    private String taskName;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
