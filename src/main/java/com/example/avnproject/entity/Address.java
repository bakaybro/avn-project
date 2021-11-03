package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @Column(name = "town")
    private String town;

    @Column(name = "street")
    private String street;

    @Column(name = "number_s_house")
    private Integer numberIsHouse;

    @Column(name = "number_is_apartment")
    private Integer numberIsApartment;
}
