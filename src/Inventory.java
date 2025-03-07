public class Inventory {
    private int water;
    private int coffeeBeans;
    private int milk;

    public Inventory(int water, int coffeeBeans, int milk) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
    }

    public boolean hasEnoughIngredients(Coffee coffee) {
        return water >= coffee.getWaterRequired() &&
               coffeeBeans >= coffee.getCoffeeBeansRequired() &&
               milk >= coffee.getMilkRequired();
    }

    public void useIngredients(Coffee coffee) {
        water -= coffee.getWaterRequired();
        coffeeBeans -= coffee.getCoffeeBeansRequired();
        milk -= coffee.getMilkRequired();
    }

    public void refillIngredients(int water, int coffeeBeans, int milk) {
        this.water += water;
        this.coffeeBeans += coffeeBeans;
        this.milk += milk;
    }

    public void displayInventory() {
        System.out.println("Water: " + water + "ml");
        System.out.println("Coffee Beans: " + coffeeBeans + "g");
        System.out.println("Milk: " + milk + "ml");
    }
}
