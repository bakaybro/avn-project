package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel extends BaseModel {
    private String fullName;
    private String password;
    private String email;
    private Long isStatus;
}
