package com.exam.example.examportalproject.repository;

import com.exam.example.examportalproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
 public User findByuserName(String userName);
}
