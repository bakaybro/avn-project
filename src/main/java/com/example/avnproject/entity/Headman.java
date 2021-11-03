package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "headman")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Headman extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role roleId;

    @Column(name = "full_name")
    private String fullName;

}
