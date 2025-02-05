package org.example.decorators;

import org.example.Pizza;

import java.math.BigDecimal;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + ", mushrooms";

    }

    @Override
    public BigDecimal getCost (){
        return super.getCost().add(BigDecimal.valueOf(3.20));
    }

    @Override
    public String getName() {
        return super.getName() + " with mushrooms";
    }
}
