package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plan_of_studies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanOfStudies extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "semesters_id")
    private DirectoryOfSemesters semestersId;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private DirectoryOfItems itemId;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacherId;
}
