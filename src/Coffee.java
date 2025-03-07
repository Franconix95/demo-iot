public class Coffee {
    private String name;
    private double price;
    private int waterRequired;
    private int coffeeBeansRequired;
    private int milkRequired;

    public Coffee(String name, double price, int waterRequired, int coffeeBeansRequired, int milkRequired) {
        this.name = name;
        this.price = price;
        this.waterRequired = waterRequired;
        this.coffeeBeansRequired = coffeeBeansRequired;
        this.milkRequired = milkRequired;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWaterRequired() {
        return waterRequired;
    }

    public int getCoffeeBeansRequired() {
        return coffeeBeansRequired;
    }

    public int getMilkRequired() {
        return milkRequired;
    }
}
