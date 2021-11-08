package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ApplicationModel extends BaseModel {
    private Long studentId;
    private Integer quantityOfPasses;
    private Integer quantityOfFailures;
}
