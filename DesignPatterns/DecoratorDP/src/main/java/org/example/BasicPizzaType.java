package org.example;

import java.math.BigDecimal;
/**
 * Enum representing different types of basic pizzas.
 * Each pizza type has a name, description, and cost.
 */
public enum BasicPizzaType implements Pizza {
    MARGHERITA("Margherita", "Tomato sauce, mozzarella, ham", BigDecimal.valueOf(8.99)),
    PEPPERONI("Pepperoni", "Tomato sauce, mozzarella, pepperoni", BigDecimal.valueOf(10.99)),
    VEGETARIAN("Vegetarian", "Tomato sauce, mozzarella, assorted vegetables", BigDecimal.valueOf(9.99));
    private final String name;
    private final String description;
    private final BigDecimal cost;
    /**
     * Constructs a new BasicPizzaType.
     *
     * @param name The name of the pizza.
     * @param description The description of the pizza.
     * @param cost The cost of the pizza.
     */
        BasicPizzaType(String name, String description, BigDecimal cost) {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    public String getName() { return name; }
    @Override
    public String getPizzaDescription() {
        return description;
    }

    public BigDecimal getCost() { return cost; }
}
