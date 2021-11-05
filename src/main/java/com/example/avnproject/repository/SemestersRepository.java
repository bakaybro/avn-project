package com.example.avnproject.repository;

import com.example.avnproject.entity.DirectoryOfSemesters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemestersRepository extends JpaRepository<DirectoryOfSemesters, Long> {
}
