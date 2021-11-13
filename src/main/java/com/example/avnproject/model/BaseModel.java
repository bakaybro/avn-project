package com.example.avnproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseModel {
    private Long id;
    private LocalDate createDate;
    private LocalDate updateDate;
}
