package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDateTime createDate;

    @Column(name = "updated_date")
    private LocalDateTime updateDate;

    @Column(name = "course")
    private Integer course;

    @OneToOne
    @JoinColumn(name = "headman_id")
    private Headman headmanId;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacherId;

    @Column(name = "audience")
    private Integer audience;
}
