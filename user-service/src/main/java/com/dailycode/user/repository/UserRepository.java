package com.dailycode.user.repository;

import com.dailycode.user.entity.User;
import com.dailycode.user.valueobject.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserId(Long userId);
}
