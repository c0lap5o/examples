package org.example;

import java.math.BigDecimal;
/**
 * Interface representing a pizza.
 * All pizza types and decorators should implement this interface.
 */
public interface Pizza {
    /**
     * Gets the description of the pizza.
     *
     * @return The pizza description.
     */
    String getPizzaDescription();
    /**
     * Gets the cost of the pizza.
     *
     * @return The pizza cost.
     */
    BigDecimal getCost();
    /**
     * Gets the name of the pizza.
     *
     * @return The pizza name.
     */
    String getName();
}
