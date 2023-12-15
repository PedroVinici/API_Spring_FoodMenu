package com.example.cardapio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cardapio.dto.FoodPostDTO;
import com.example.cardapio.model.Food;
import com.example.cardapio.repository.FoodRepository;

@Service
public class FoodPostService {
    @Autowired
    FoodRepository foodRepository;

    public FoodPostDTO insertFood(FoodPostDTO foodPostDTO){
        Food newFood = new Food(foodPostDTO);
        foodRepository.save(newFood);
        return foodPostDTO;
    }
}
