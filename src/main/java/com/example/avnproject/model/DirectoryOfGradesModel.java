package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DirectoryOfGradesModel extends BaseModel {
    private Integer grades;
    private Integer score;
}
