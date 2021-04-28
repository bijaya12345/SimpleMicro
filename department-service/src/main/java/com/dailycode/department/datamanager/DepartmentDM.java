package com.dailycode.department.datamanager;

import com.dailycode.department.entity.Department;
import com.dailycode.department.repository.DepartmentRepository;
import com.dailycode.department.valueobject.DepartmentRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DepartmentDM {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void saveDepartment(DepartmentRequest departmentRequest){
        Department department = new Department();
        department.setDepartmentName(departmentRequest.getDepartmentName());
        department.setDepartmentCode(departmentRequest.getDepartmentCode());
        department.setDepartmentAddress(departmentRequest.getDepartmentAddress());
        departmentRepository.save(department);
    }

    public DepartmentRequest getDepartmentById(Long id) {
        DepartmentRequest departmentRequest = new DepartmentRequest();
        Department department = departmentRepository.findById(id).get();
        BeanUtils.copyProperties(department, departmentRequest);
        return departmentRequest;
    }



}
