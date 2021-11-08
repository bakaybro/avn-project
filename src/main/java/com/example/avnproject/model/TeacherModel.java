package com.example.avnproject.model;

import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherModel extends BaseModel {
    private Long id;
    private String fullName;
    private Date dateOfBirth;
    private String telephone;
}
