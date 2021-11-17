package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleModel extends BaseModel {
    private Long id;
    private String roleName;
    private Long userId;
}
