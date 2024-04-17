package com.rahi.travel.user.userservice.repository;

import com.rahi.travel.user.userservice.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredential,Long> {
}
