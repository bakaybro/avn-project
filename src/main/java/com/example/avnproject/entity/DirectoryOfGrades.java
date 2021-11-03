package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directory_of_grades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectoryOfGrades extends BaseEntity{

    @Column(name = "grades")
    private Integer grades;

    @Column(name = "score")
    private Integer score;
}
