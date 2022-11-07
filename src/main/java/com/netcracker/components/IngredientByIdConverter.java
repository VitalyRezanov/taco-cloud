package com.netcracker.components;

import com.netcracker.entities.Ingredient;
import com.netcracker.entities.Ingredient.TypeIngredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO",
                new Ingredient("FLTO", "Flour Tortilla", TypeIngredient.WRAP));
        ingredientMap.put("COTO",
                new Ingredient("COTO", "Corn Tortilla", TypeIngredient.WRAP));
        ingredientMap.put("GRBF",
                new Ingredient("GRBF", "Ground Beef", TypeIngredient.PROTEIN));
        ingredientMap.put("CARN",
                new Ingredient("CARN", "Carnitas", TypeIngredient.PROTEIN));
        ingredientMap.put("TMTO",
                new Ingredient("TMTO", "Diced Tomatoes", TypeIngredient.VEGGIES));
        ingredientMap.put("LETC",
                new Ingredient("LETC", "Lettuce", TypeIngredient.VEGGIES));
        ingredientMap.put("CHED",
                new Ingredient("CHED", "Cheddar", TypeIngredient.CHEESE));
        ingredientMap.put("JACK",
                new Ingredient("JACK", "Monterrey Jack", TypeIngredient.CHEESE));
        ingredientMap.put("SLSA",
                new Ingredient("SLSA", "Salsa", TypeIngredient.SAUCE));
        ingredientMap.put("SRCR",
                new Ingredient("SRCR", "Sour Cream", TypeIngredient.SAUCE));
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
