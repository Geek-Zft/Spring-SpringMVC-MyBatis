package com.zft.mybatis.mapper;

import com.zft.mybatis.vo.EmployeeTask;

import java.util.List;

public interface EmployeeTaskMapper {

    List<EmployeeTask> getEmployeeTaskByEmpId(Long empId);
}
