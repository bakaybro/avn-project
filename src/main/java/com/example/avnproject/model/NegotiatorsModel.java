package com.example.avnproject.model;

import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NegotiatorsModel extends BaseModel {
    private Long student;
    private Date dateOfPayment;
    private Integer numberIsReceipt;
    private Integer sum;
}
