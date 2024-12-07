package com.example.fwrp.repositories;

import com.example.fwrp.models.FoodItem;
import com.example.fwrp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    List<FoodItem> findByRetailerAndStatus(User retailer, FoodItem.Status status);
}
