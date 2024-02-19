package com.moupriya.demo.fullstackbackend.repository;

import com.moupriya.demo.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
