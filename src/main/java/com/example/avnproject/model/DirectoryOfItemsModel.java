package com.example.avnproject.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DirectoryOfItemsModel extends BaseModel {
    private String item;
}
