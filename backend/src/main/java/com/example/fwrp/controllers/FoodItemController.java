package com.example.fwrp.controllers;

import com.example.fwrp.models.FoodItem;
import com.example.fwrp.models.User;
import com.example.fwrp.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food-items")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/add")
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/retailer/{retailerId}")
    public List<FoodItem> getRetailerItems(@PathVariable Long retailerId) {
        User retailer = new User(); // Fetch retailer from database by ID in real use case
        return foodItemService.getRetailerItems(retailer, FoodItem.Status.AVAILABLE);
    }
}
