package com.dailycode.user.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}

