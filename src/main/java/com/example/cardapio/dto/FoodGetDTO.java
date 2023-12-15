package com.example.cardapio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodGetDTO {
    private long id;
    private String title;
    private String image;
    private Integer price;
}
