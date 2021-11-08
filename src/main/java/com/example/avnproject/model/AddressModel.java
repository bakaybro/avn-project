package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressModel extends BaseModel {
    private Long student;
    private String town;
    private String street;
    private Integer numberIsHouse;
    private Integer numberIsApartment;
}
