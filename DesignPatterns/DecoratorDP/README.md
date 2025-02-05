# 🍕 Pizza Decorator Project

## Overview
Hey there, pizza lovers! 👋 This project is all about building a flexible pizza ordering system using the Decorator Design Pattern. It's like customizing your pizza, but in code! The Decorator pattern lets us add toppings to our pizzas dynamically, without creating a mess of subclasses for every possible combination.

## How It Works
1. **Base Pizza**: We start with a simple `BasePizza` class. It's like the foundation of your pizza - just the basics!

2. **Pizza Interface**: The `Pizza` interface defines what every pizza should have: a description, a cost, and a name.

3. **Decorators**: These are the fun part! Each decorator (like `MushroomDecorator` or `PepperoniDecorator`) wraps around a pizza and adds its own flair. It's like adding toppings one by one.

4. **Menu**: The `Menu` class keeps track of all our available pizzas. It's like the menu board at your favorite pizzeria.

5. **PizzaPrinter**: This nifty class formats and prints our menu. It makes sure everything looks neat and tidy when displayed.

## Cool Features
- **Mix and Match**: You can stack decorators to create any pizza combination you can dream of!
- **Easy to Extend**: Want to add a new topping? Just create a new decorator. No need to change existing code.
- **Pretty Printing**: The `PizzaPrinter` class makes sure our menu looks good enough to eat (figuratively, of course).

## Benefits
- **Flexibility**: Add or remove toppings on the fly. It's like having a pizza chef who's always ready to customize.
- **Open for Extension**: Adding new pizza types or toppings is a breeze. Our code is always ready for the next big pizza trend.
- **Separation of Concerns**: Each class has its own job, making the code easier to understand and maintain.

## Get Cooking!
To run this project, just fire up the `Main` class and watch as it builds and displays a menu of delicious (virtual) pizzas. Feel free to experiment by adding your own toppings or creating wild pizza combinations!

Bon appétit and happy coding! 🍕👨‍💻
