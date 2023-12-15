package com.example.cardapio.model;

import com.example.cardapio.dto.FoodPostDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "pk_id_food")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private Integer price;

    public Food(FoodPostDTO foodPostDTO){
        this.image = foodPostDTO.getImage();
        this.title = foodPostDTO.getTitle();
        this.price = foodPostDTO.getPrice();
    }
}