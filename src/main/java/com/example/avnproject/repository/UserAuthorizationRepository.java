package com.example.avnproject.repository;

import com.example.avnproject.entity.UserAuthorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthorizationRepository extends JpaRepository<UserAuthorization, Long> {
}
