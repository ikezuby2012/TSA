package com.wizard.service;


import com.wizard.Entity.Department;

import java.util.List;

public interface DepartmentService {
   List<Department> findAllDepartments();

   Department createNewDepartment(Department body);

   Department getDepartmentById(String id);
}
