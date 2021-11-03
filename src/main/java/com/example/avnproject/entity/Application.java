package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "application")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @Column(name = "quantity_of_passes")
    private Integer quantityOfPasses;

    @Column(name = "quantity_of_failures")
    private Integer quantityOfFailures;
}
