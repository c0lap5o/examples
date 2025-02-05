package org.example.decorators;

import org.example.Pizza;

import java.math.BigDecimal;
/**
 * Abstract base class for pizza decorators.
 * This class implements the Pizza interface and provides a base for adding
 * additional toppings or modifications to a pizza.
 */
public abstract class PizzaDecorator implements Pizza {
    private Pizza decoratedPizza;
    /**
     * Constructs a new PizzaDecorator.
     *
     * @param decoratedPizza The pizza to be decorated.
     */
    public PizzaDecorator(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }
    @Override
    public String getPizzaDescription() {
        return decoratedPizza.getPizzaDescription();
    }

    @Override
    public BigDecimal getCost() {
        return decoratedPizza.getCost();
    }
    @Override
    public String toString(){
        return getName()+"\t"+getPizzaDescription()+"\t"+ getCost();
    }
    @Override
    public String getName() {
        return decoratedPizza.getName();
    }
    /**
     * Decorates a pizza with additional features.
     *
     * @param pizza The pizza to be decorated.
     * @return The decorated pizza.
     */
    public Pizza decorate(Pizza pizza) {
       this.decoratedPizza = pizza;
       return this;
    }

}
