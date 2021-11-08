package com.example.avnproject.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class BaseModel {
    private Long id;
    private LocalDate createDate;
    private LocalDate updateDate;
}
