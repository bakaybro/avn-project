package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuthorizationModel extends BaseModel {
    private Long user;
    private String password;
    private String email;
}
