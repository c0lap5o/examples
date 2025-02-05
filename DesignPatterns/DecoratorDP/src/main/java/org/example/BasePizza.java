package org.example;

import java.math.BigDecimal;
/**
 * Represents a basic pizza without any additional toppings.
 */
public class BasePizza implements Pizza {

    /**
     * Constructs a new BasePizza.
     */
    public BasePizza(){
    }

    @Override
    public String getPizzaDescription() {
        return "Plain pizza with tomato sauce, garlic, cheese, ham";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(5.99);
    }

    @Override
    public String getName() {
        return "Plain Pizza";
    }

    @Override
    public String toString(){
        return getName()+"\t"+getPizzaDescription()+"\t"+getCost();
    }
}
