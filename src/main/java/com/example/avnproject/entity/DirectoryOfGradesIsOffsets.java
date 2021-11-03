package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directory_of_grades_is_offsets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectoryOfGradesIsOffsets extends BaseEntity {

    @Column(name = "directory_of_grades_is_offset")
    private Integer grades;

    @Column(name = "is_offset")
    private boolean isOffset;
}
