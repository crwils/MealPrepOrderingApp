package com.meal_prep.MealPrepApp.models.food;

import com.meal_prep.MealPrepApp.components.enums.food_enums.AllergenType;
import com.meal_prep.MealPrepApp.components.enums.food_enums.FilterType;

import java.util.ArrayList;

public class CustomMeal extends Food{

    private ArrayList<Food> customMealItems;

    public CustomMeal(String shopName, String name, Integer protein, Integer carbs, Integer fats, Integer calories,
                      Integer totalWeight, ArrayList<String> ingredients, ArrayList<AllergenType> allergens,
                      ArrayList<FilterType> filters, String imageUrl, String description, String mainProtein,
                      String category, ArrayList<Food> customMealItems) {
        super(shopName, name, protein, carbs, fats, calories, totalWeight, ingredients, allergens, filters,
                imageUrl, description, mainProtein, category);
        this.customMealItems = customMealItems;
    }

    public CustomMeal(){
    }

    public ArrayList<Food> getCustomMealItems() {
        return customMealItems;
    }

    public void setCustomMealItems(ArrayList<Food> customMealItems) {
        this.customMealItems = customMealItems;
    }
}
