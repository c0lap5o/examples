package org.example.decorators;

import org.example.Pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", pepperoni";
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(BigDecimal.valueOf(2.0));
    }

    @Override
    public String getName() {
        return super.getName() + " with pepperoni";
    }



}
