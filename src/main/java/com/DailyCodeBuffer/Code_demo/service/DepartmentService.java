package com.DailyCodeBuffer.Code_demo.service;

import java.util.List;

import com.DailyCodeBuffer.Code_demo.Error.DepartmentNotFoundException;
import com.DailyCodeBuffer.Code_demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	
	public List<Department> fetchDepartmentList();

	public Department fetchDepartmnetById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

}
