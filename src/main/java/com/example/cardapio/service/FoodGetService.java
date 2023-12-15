package com.example.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cardapio.dto.FoodGetDTO;
import com.example.cardapio.repository.FoodRepository;

@Service
public class FoodGetService {
    @Autowired
    FoodRepository foodRepository;

    public List<FoodGetDTO> getAll(){
        return foodRepository.findAll().stream()
            .map(food -> new FoodGetDTO(food.getId(), food.getTitle(), food.getImage(), food.getPrice()))
            .toList();
    }
}
