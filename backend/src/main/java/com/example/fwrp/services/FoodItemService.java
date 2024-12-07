package com.example.fwrp.services;

import com.example.fwrp.models.FoodItem;
import com.example.fwrp.models.User;
import com.example.fwrp.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> getRetailerItems(User retailer, FoodItem.Status status) {
        return foodItemRepository.findByRetailerAndStatus(retailer, status);
    }

    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }
}
