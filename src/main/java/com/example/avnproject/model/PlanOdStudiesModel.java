package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlanOdStudiesModel extends BaseModel {
    private Long id;
    private Long semesters;
    private Long items;
    private Long teacher;
}
