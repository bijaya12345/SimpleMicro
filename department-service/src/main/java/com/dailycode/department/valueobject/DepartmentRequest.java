package com.dailycode.department.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {

    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
