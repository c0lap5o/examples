package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * Represents a menu of pizzas.
 * This class manages a list of pizzas and provides methods to add, remove, and iterate over them.
 */
public class Menu implements Iterable<Pizza>{
    private List<Pizza> pizzas = new ArrayList<>();
    /**
     * Constructs a new Menu with basic pizza types.
     */
    public Menu(){
        pizzas.addAll(Arrays.asList(BasicPizzaType.values()));
    }

    public Iterator<Pizza> iterator(){
        return pizzas.iterator();
    }
    /**
     * Adds a pizza to the menu.
     *
     * @param pizza The pizza to be added.
     */
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    /**
     * Adds multiple pizzas to the menu.
     *
     * @param pizzas The list of pizzas to be added.
     */
    public void addAllPizzas(List<Pizza> pizzas){
        this.pizzas.addAll(pizzas);
    }
    /**
     * Removes a pizza from the menu.
     *
     * @param pizza The pizza to be removed.
     */
    public void removePizza(Pizza pizza){
        pizzas.remove(pizza);
    }
    /**
     * Prints the menu using the PizzaPrinter.
     */
    public void printMenu(){
        PizzaPrinter.printPizzaMenu(pizzas);
    }
    /**
     * Gets the list of pizzas in the menu.
     *
     * @return The list of pizzas.
     */
    public List<Pizza> getPizzas(){
        return pizzas;
    }
}
