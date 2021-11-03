package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "group_id")
    private Group groupId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "telephone")
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "professions_id")
    private DirectoryOfProfessions professionsId;

    @Column(name = "note")
    private String note;
}
