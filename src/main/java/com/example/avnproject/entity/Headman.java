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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "full_name")
    private String fullName;

}
