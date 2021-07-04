package com.example.RESTful.repo;

import com.example.RESTful.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
