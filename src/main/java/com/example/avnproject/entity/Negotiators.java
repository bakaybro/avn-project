package com.example.avnproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "negotiators")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Negotiators extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studentId;

    @Column(name = "date_of_payment")
    private Date dateOfPayment;

    @Column(name = "numbers_is_receipt")
    private Integer numberIsReceipt;

    @Column(name = "sum")
    private Integer sum;
}
