package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.dto.FoodGetDTO;
import com.example.cardapio.dto.FoodPostDTO;
import com.example.cardapio.service.FoodGetService;
import com.example.cardapio.service.FoodPostService;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    FoodPostService foodPostService;
    @Autowired
    FoodGetService foodGetService;
    
    @PostMapping()
    public FoodPostDTO saveFood(
        @RequestBody FoodPostDTO foodPostDTO){
            return this.foodPostService.insertFood(foodPostDTO);
    }

    @GetMapping()
    public List<FoodGetDTO> getAllFood(
    ){
        return this.foodGetService.getAll();
    }
}
