package com.dailycode.department.service;

import com.dailycode.department.datamanager.DepartmentDM;
import com.dailycode.department.entity.Department;
import com.dailycode.department.repository.DepartmentRepository;
import com.dailycode.department.valueobject.DepartmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    DepartmentDM departmentDM;


    public void saveDepartment(DepartmentRequest departmentRequest) {
         departmentDM.saveDepartment(departmentRequest);
    }

    public DepartmentRequest findDepartmentById(Long departmentRequestId) {
        return departmentDM.getDepartmentById(departmentRequestId);
    }
}
