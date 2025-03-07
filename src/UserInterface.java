import java.util.Scanner;

public class UserInterface {
    private CoffeeMachine coffeeMachine;

    public UserInterface(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the Coffee Machine!");
        displayMenu();

        while (true) {
            System.out.print("Please select a coffee by name (or type 'exit' to quit): ");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Coffee Machine!");
                break;
            }

            coffeeMachine.serveCoffee(input);
            coffeeMachine.checkIngredients();
        }

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("Available Coffees:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
    }

    public static void main(String[] args) {
        Ingredients ingredients = new Ingredients(1000, 300, 500); // Initial amounts
        CoffeeMachine coffeeMachine = new CoffeeMachine(ingredients);
        UserInterface ui = new UserInterface(coffeeMachine);
        ui.start();
    }
}
