package com.example.avnproject.repository;

import com.example.avnproject.entity.DirectoryOfProfessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionsRepository extends JpaRepository<DirectoryOfProfessions, Long> {
}
