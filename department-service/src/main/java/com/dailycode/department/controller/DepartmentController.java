package com.dailycode.department.controller;

import com.dailycode.department.entity.Department;
import com.dailycode.department.service.DepartmentService;
import com.dailycode.department.valueobject.DepartmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public void saveDepartment(@RequestBody DepartmentRequest departmentRequest){
        departmentService.saveDepartment(departmentRequest);
    }

    @GetMapping("/{id}")
    public DepartmentRequest findDepartmentById(@PathVariable("id") Long departmentRequestId){
        return departmentService.findDepartmentById(departmentRequestId);
    }

}
