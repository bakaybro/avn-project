package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_authorization")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAuthorization extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
