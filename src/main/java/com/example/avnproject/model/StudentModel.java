package com.example.avnproject.model;

import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentModel extends BaseModel {
    private String fullName;
    private Long groupId;
    private Date dateOfBirth;
    private String telephone;
    private Long professionsId;
}
