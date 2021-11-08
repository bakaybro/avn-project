package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GradesOfStudentsModel extends BaseModel {
    private Long planOfStudiesId;
    private Long studentId;
    private Long gradesId;
    private Long gradesIsOffsetId;
    private Boolean isAttestation;
}
