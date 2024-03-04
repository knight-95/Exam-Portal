package com.exam.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.User;


// Since UserRepository is an interface, we won't get its object but we can get object of its implemented classes

public interface UserRepository extends JpaRepository<User, Long> {

}
