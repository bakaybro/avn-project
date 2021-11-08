package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DirectoryOfSemestersModel extends BaseModel {
    private Integer course;
    private Integer semester;
}
