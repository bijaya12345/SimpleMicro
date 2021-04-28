package com.dailycode.user.service;

import com.dailycode.user.datamanager.UserDM;
import com.dailycode.user.entity.User;
import com.dailycode.user.repository.UserRepository;
import com.dailycode.user.valueobject.Department;
import com.dailycode.user.valueobject.ResponseTemplateVO;
import com.dailycode.user.valueobject.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserDM userDM;

    public void saveUser(UserRequest userRequest) {
        userDM.saveUser(userRequest);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userRequestId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        //User user = userRepository.findByUserId(userId);
        UserRequest userRequest = userDM.getUserById(userRequestId);

        Department department = restTemplate.getForObject("http://localhost:8080/departments/"+userRequest.getDepartmentId(), Department.class);
        vo.setUser(userRequest);
        vo.setDepartment(department);
        return vo;
    }
}
