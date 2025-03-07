import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CoffeeMachine {
    private Ingredients ingredients;
    private List<Coffee> coffeeMenu;

    public CoffeeMachine(Ingredients ingredients) {
        this.ingredients = ingredients;
        this.coffeeMenu = new ArrayList<>();
        initializeCoffeeMenu();
    }

    private void initializeCoffeeMenu() {
        coffeeMenu.add(new Coffee("Espresso", 50, 18, 0, 250));
        coffeeMenu.add(new Coffee("Latte", 200, 24, 150, 350));
        coffeeMenu.add(new Coffee("Cappuccino", 150, 24, 100, 300));
    }

    public void serveCoffee(String coffeeName) {
        for (Coffee coffee : coffeeMenu) {
            if (coffee.getName().equalsIgnoreCase(coffeeName)) {
                if (ingredients.hasEnoughIngredients(coffee)) {
                    ingredients.useIngredients(coffee);
                    System.out.println("Serving " + coffee.getName() + "! Please pay $" + (coffee.getCost() / 100.0));
                } else {
                    System.out.println("Insufficient ingredients for " + coffee.getName());
                }
                return;
            }
        }
        System.out.println("Coffee type not found.");
    }

    public void checkIngredients() {
        System.out.println("Water: " + ingredients.getWater() + "ml, Coffee Beans: " + ingredients.getCoffeeBeans() + "g, Milk: " + ingredients.getMilk() + "ml");
    }
}
