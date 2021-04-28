package com.dailycode.user.datamanager;

import com.dailycode.user.entity.User;
import com.dailycode.user.repository.UserRepository;
import com.dailycode.user.valueobject.UserRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDM {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserRequest userRequest){
        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setDepartmentId(userRequest.getDepartmentId());
        user.setEmail(userRequest.getEmail());
        userRepository.save(user);
    }

    public UserRequest getUserById(Long id) {
        UserRequest userRequest = new UserRequest();
        User user = userRepository.findByUserId(id);
        BeanUtils.copyProperties(user, userRequest);
        return userRequest;
    }
}
