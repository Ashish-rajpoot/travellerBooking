package com.rahi.travel.user.userservice.repository;

import com.rahi.travel.user.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
