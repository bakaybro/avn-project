package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupModel extends BaseModel {
    private Integer course;
    private Long headmanId;
    private Long teacherId;
    private Integer audience;
}
