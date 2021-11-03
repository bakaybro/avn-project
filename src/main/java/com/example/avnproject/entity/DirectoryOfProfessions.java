package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directory_of_professions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectoryOfProfessions extends BaseEntity {

    @Column(name = "profession")
    private String profession;
}
