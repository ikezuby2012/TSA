package com.wizard.controller;


import com.wizard.Entity.Department;
import com.wizard.response.CustomResponse;
import com.wizard.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
   @Autowired
   private DepartmentService departmentService;

   @GetMapping("/department")
   public ResponseEntity<CustomResponse> getAllDepartments() {
      String message = "all items in Department";
      List<Department> department = departmentService.findAllDepartments();
      if (department.isEmpty()) message = "department DB is empty";
      CustomResponse customResponse = new CustomResponse(true, HttpStatus.OK, message, department);
      return ResponseEntity.status(HttpStatus.OK).body(customResponse);
   }
   @PostMapping("/department")
   public ResponseEntity<CustomResponse> createNewDepartment(@Valid @RequestBody Department body) {
      Department department = departmentService.createNewDepartment(body);
      CustomResponse customResponse = new CustomResponse(true, HttpStatus.CREATED, "created", department);
      return ResponseEntity.status(HttpStatus.CREATED).body(customResponse);
   }
   @GetMapping("/department/{id}")
   public ResponseEntity<CustomResponse> getDepartmentById(@PathVariable String id) {
      Department department = departmentService.getDepartmentById(id);
      CustomResponse customResponse = new CustomResponse(true, HttpStatus.OK, " ", department);
      return ResponseEntity.status(HttpStatus.OK).body(customResponse);
   }
}
