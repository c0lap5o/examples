package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * Utility class for printing pizza menus.
 * This class provides methods to format and print pizza information in a tabular format.
 */
public class PizzaPrinter {
    private static final int NAME_WIDTH = 35;
    private static final int DESCRIPTION_WIDTH = 50;
    private static final int PRICE_WIDTH = 15;
    private static final String SEPARATOR = "+";
    private static final String VERTICAL_LINE = "|";
    /**
     * Prints a formatted menu of pizzas.
     *
     * @param pizzas The list of pizzas to be printed.
     */
    public static void printPizzaMenu(List<Pizza> pizzas) {
        String headerFormat = VERTICAL_LINE + " %-" + NAME_WIDTH + "s " + VERTICAL_LINE + " %-" + DESCRIPTION_WIDTH + "s " + VERTICAL_LINE + " %-" + PRICE_WIDTH + "s " + VERTICAL_LINE + "%n";
        String lineFormat = VERTICAL_LINE + " %-" + NAME_WIDTH + "s " + VERTICAL_LINE + " %-" + DESCRIPTION_WIDTH + "s " + VERTICAL_LINE + " $%" + (PRICE_WIDTH-1) + ".2f " + VERTICAL_LINE + "%n";

        printSeparator();
        System.out.printf(headerFormat, "Pizza Name", "Description", "Price");
        printSeparator();

        for (Pizza pizza : pizzas) {
            List<String> wrappedName = wrapText(pizza.getName(), NAME_WIDTH);
            List<String> wrappedDescription = wrapText(pizza.getPizzaDescription(), DESCRIPTION_WIDTH);
            int maxLines = Math.max(wrappedName.size(), wrappedDescription.size());

            for (int i = 0; i < maxLines; i++) {
                String name = i < wrappedName.size() ? wrappedName.get(i) : "";
                String description = i < wrappedDescription.size() ? wrappedDescription.get(i) : "";
                if (i == 0) {
                    System.out.printf(lineFormat, name, description, pizza.getCost());
                } else {
                    System.out.printf(headerFormat, name, description, "");
                }
            }
            printSeparator();
        }
    }
    /**
     * Prints a separator line for the table.
     */
    private static void printSeparator() {
        System.out.print(SEPARATOR);
        printChar('-', NAME_WIDTH + 2);
        System.out.print(SEPARATOR);
        printChar('-', DESCRIPTION_WIDTH + 2);
        System.out.print(SEPARATOR);
        printChar('-', PRICE_WIDTH + 2);
        System.out.println(SEPARATOR);
    }
    /**
     * Prints a character multiple times.
     *
     * @param c The character to print.
     * @param count The number of times to print the character.
     */
    private static void printChar(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
    /**
     * Wraps text to fit within a specified width.
     *
     * @param text The text to wrap.
     * @param width The maximum width for each line.
     * @return A list of wrapped text lines.
     */
    private static List<String> wrapText(String text, int width) {
        List<String> wrappedText = new ArrayList<>();
        String[] words = text.split("\\s+|,\\s+");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() > width) {
                wrappedText.add(line.toString());
                line = new StringBuilder();
            }
            if (line.length() > 0) {
                line.append(" ");
            }
            line.append(word);
        }

        if (line.length() > 0) {
            wrappedText.add(line.toString());
        }

        return wrappedText;
    }
}
