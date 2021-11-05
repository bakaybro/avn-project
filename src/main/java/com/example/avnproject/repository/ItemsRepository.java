package com.example.avnproject.repository;

import com.example.avnproject.entity.DirectoryOfItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<DirectoryOfItems, Long> {
}
