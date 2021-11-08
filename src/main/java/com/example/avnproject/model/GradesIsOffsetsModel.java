package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GradesIsOffsetsModel extends BaseModel {
    private Integer grades;
    private Boolean isOffset;
}
