package org.example;

import org.example.decorators.MushroomDecorator;
import org.example.decorators.PepperoniDecorator;
import org.example.decorators.PizzaDecorator;


public class Main {

    public static void main(String[] args) {

        System.out.format("Hi, Welcome to %S %n","The Upper Crust");
        System.out.println("MENU");

        Menu menu = new Menu();


        Pizza mushroomPizza = BasicPizzaType.MARGHERITA;
        mushroomPizza = new MushroomDecorator(mushroomPizza);

        menu.addPizza(mushroomPizza);

        Pizza vegetarianWithPepperoni = BasicPizzaType.VEGETARIAN;
        vegetarianWithPepperoni = new PepperoniDecorator(vegetarianWithPepperoni);

        menu.addPizza(vegetarianWithPepperoni);

        Pizza complexPizza = createPizza(new BasePizza(),new MushroomDecorator(new BasePizza()),new PepperoniDecorator(new BasePizza()));

        menu.addPizza(complexPizza);

        menu.printMenu();

    }

    private static Pizza createPizza(Pizza basePizza, PizzaDecorator... decorators) {
        Pizza pizza = basePizza;
        for (PizzaDecorator decorator : decorators) {
            pizza = decorator.decorate(pizza);
        }
        return pizza;
    }

}