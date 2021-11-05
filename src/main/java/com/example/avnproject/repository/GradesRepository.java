package com.example.avnproject.repository;

import com.example.avnproject.entity.DirectoryOfGrades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<DirectoryOfGrades, Long> {
}
