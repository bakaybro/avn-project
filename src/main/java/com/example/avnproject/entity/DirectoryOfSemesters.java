package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directory_of_semesters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectoryOfSemesters extends BaseEntity {

    @Column(name = "course")
    private Integer course;

    @Column(name = "semester")
    private Integer semester;
}
