package com.exam.examserver.services;

import java.util.Set;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

public interface UserService {

    // Creating user
    public User createUser(User user, Set<UserRole> UserRoles);
}
