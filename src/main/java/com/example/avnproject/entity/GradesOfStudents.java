package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "grades_of_students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GradesOfStudents extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "plan_of_studies_id")
    private PlanOfStudies planOfStudiesId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @ManyToOne
    @JoinColumn(name = "grades_id")
    private DirectoryOfGrades gradesId;

    @ManyToOne
    @JoinColumn(name = "grades_is_offset_id")
    private DirectoryOfGradesIsOffsets gradesIsOffsetId;

    @Column(name = "is_attestation")
    private Boolean isAttestation;
}
