
package com.DailyCodeBuffer.Code_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DailyCodeBuffer.Code_demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	
	public Department findByDepartmentName(String departmentName);
	
	public Department findByDepartmentNameIgnoreCase(String departmentName);
}
