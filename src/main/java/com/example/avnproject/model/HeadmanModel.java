package com.example.avnproject.model;

import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeadmanModel extends BaseModel {
    private Long group;
    private String fullName;
    private Long userRole;
}
