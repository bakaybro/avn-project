package com.example.avnproject.repository;

import com.example.avnproject.entity.DirectoryOfGradesIsOffsets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffsetsRepository extends JpaRepository<DirectoryOfGradesIsOffsets, Long> {
}
