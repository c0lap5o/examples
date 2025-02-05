import org.example.BasePizza;
import org.example.BasicPizzaType;
import org.example.Menu;
import org.example.Pizza;
import org.example.decorators.MushroomDecorator;
import org.example.decorators.PepperoniDecorator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PizzaSystemTest {
    @Test
    void testBasePizza() {
        Pizza basePizza = new BasePizza();
        assertEquals("Plain Pizza", basePizza.getName());
        assertEquals("Plain pizza with tomato sauce, garlic, cheese, ham", basePizza.getPizzaDescription());
        assertEquals(BigDecimal.valueOf(5.99), basePizza.getCost());
    }

    @Test
    void testBasicPizzaType() {
        Pizza margherita = BasicPizzaType.MARGHERITA;
        assertEquals("Margherita", margherita.getName());
        assertEquals("Tomato sauce, mozzarella, ham", margherita.getPizzaDescription());
        assertEquals(BigDecimal.valueOf(8.99), margherita.getCost());
    }

    @Test
    void testMushroomDecorator() {
        Pizza basePizza = new BasePizza();
        Pizza mushroomPizza = new MushroomDecorator(basePizza);
        assertEquals("Plain Pizza with mushrooms", mushroomPizza.getName());
        assertEquals("Plain pizza with tomato sauce, garlic, cheese, ham, mushrooms", mushroomPizza.getPizzaDescription());
        assertEquals(BigDecimal.valueOf(9.19), mushroomPizza.getCost());
    }

    @Test
    void testPepperoniDecorator() {
        Pizza basePizza = new BasePizza();
        Pizza pepperoniPizza = new PepperoniDecorator(basePizza);
        assertEquals("Plain Pizza with pepperoni", pepperoniPizza.getName());
        assertEquals("Plain pizza with tomato sauce, garlic, cheese, ham, pepperoni", pepperoniPizza.getPizzaDescription());
        assertEquals(BigDecimal.valueOf(7.99), pepperoniPizza.getCost());
    }

    @Test
    void testMultipleDecorators() {
        Pizza basePizza = new BasePizza();
        Pizza complexPizza = new PepperoniDecorator(new MushroomDecorator(basePizza));
        assertEquals("Plain Pizza with mushrooms with pepperoni", complexPizza.getName());
        assertEquals("Plain pizza with tomato sauce, garlic, cheese, ham, mushrooms, pepperoni", complexPizza.getPizzaDescription());
        assertEquals(BigDecimal.valueOf(11.19), complexPizza.getCost());
    }

    @Test
    void testMenu() {
        Menu menu = new Menu();
        Iterator<Pizza> iterator = menu.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Margherita", iterator.next().getName());
        assertEquals("Pepperoni", iterator.next().getName());
        assertEquals("Vegetarian", iterator.next().getName());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testMenuAddAndRemove() {
        Menu menu = new Menu();
        Pizza customPizza = new BasePizza();
        menu.addPizza(customPizza);

        for (Pizza pizza : menu) {
            if (pizza.getName().equals("Plain Pizza")) {
                return;  // Found the added pizza
            }
        }
        fail("Added pizza not found in menu");
    }
}
