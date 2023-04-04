package com.wizard.implementations;

import com.wizard.Entity.Department;
import com.wizard.repository.DepartmentRepository;
import com.wizard.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
   @Autowired
   private DepartmentRepository departmentRepository;


   @Override
   public List<Department> findAllDepartments() {
      return departmentRepository.findAll();
   }

   @Override
   public Department createNewDepartment(Department body) {
      return departmentRepository.save(body);
   }

   @Override
   public Department getDepartmentById(String id) {
      return departmentRepository.findById(id).get();
   }

}
