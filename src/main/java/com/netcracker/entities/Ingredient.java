package com.netcracker.entities;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final TypeIngredient type;

    public enum TypeIngredient {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
