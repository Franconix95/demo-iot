interface UserInputHandler {
    void buttonPushed(int n);
    void moneyInserted(double amount);
    void abort();
}

interface CoffeeController {
    int makeBlack();
    int makeWhite();
}

interface ScreenController {
    int displayMessage(String message);
}

interface CashBackController {
    int releaseMoney(double amount);
}

class CoffeeMachineDriver implements UserInputHandler {
    private double credit;
    private final CoffeeController coffeeController;
    private final ScreenController screenController;
    private final CashBackController cashBackController;

    private static final double BLACK_COFFEE_PRICE = 0.99;
    private static final double WHITE_COFFEE_PRICE = 1.99;

    public CoffeeMachineDriver(CoffeeController coffeeController, 
                               ScreenController screenController, 
                               CashBackController cashBackController) {
        this.coffeeController = coffeeController;
        this.screenController = screenController;
        this.cashBackController = cashBackController;
        this.credit = 0.0;
    }

    @Override
    public void buttonPushed(int n) {
        if (n == 0) {
            if (credit >= BLACK_COFFEE_PRICE) {
                coffeeController.makeBlack();
                credit -= BLACK_COFFEE_PRICE;
                releaseRemainingCredit();
            } else {
                screenController.displayMessage("Not enough credit for black coffee.");
            }
        } else if (n == 1) {
            if (credit >= WHITE_COFFEE_PRICE) {
                coffeeController.makeWhite();
                credit -= WHITE_COFFEE_PRICE;
                releaseRemainingCredit();
            } else {
                screenController.displayMessage("Not enough credit for white coffee.");
            }
        } else {
            screenController.displayMessage("Invalid button.");
        }
        updateDisplay();
    }

    @Override
    public void moneyInserted(double amount) {
        credit += amount;
        updateDisplay();
    }

    @Override
    public void abort() {
        releaseRemainingCredit();
        updateDisplay();
    }

    private void updateDisplay() {
        screenController.displayMessage(String.format("Available credit: $%.2f", credit));
    }
    
    private void releaseRemainingCredit() {
        if (credit > 0) {
            cashBackController.releaseMoney(credit);
            credit = 0.0;
        }
    }
}
