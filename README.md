1. Ingredient Refill Notification
Description: Implement a notification system to alert the user when any ingredient (water, coffee beans, milk) is running low.

Implementation:

Add an alert system that checks the ingredient levels each time coffee is served.
If any ingredient falls below a certain threshold (e.g., 20% of its capacity), print a message prompting the user to refill it.
2. Coffee Preparation Time
Description: Display the preparation time for each coffee type when a user makes a selection.

Implementation:

Add a preparation time attribute to the Coffee class (e.g., cook time in seconds).
Modify the serveCoffee method to print the preparation time before serving the coffee.
3. Discount for Frequent Orders
Description: Implement a simple discount system for users who order a certain number of coffees within a given period.

Implementation:

Track the number of orders for each user.
If a user orders more than a specific number (e.g., 5 coffees), apply a discount (e.g., 10% off the next order).
4. Favorite Coffee Feature
Description: Allow users to mark specific coffee types as their favorites, making it easier for them to reorder.

Implementation:

Update the User class to include a list of favorite coffees and provide methods to add/remove favorites.
Integrate a way for users to quickly view and select their favorite coffee types from the menu.
5. Simple Logging System
Description: Implement a basic logging system to keep track of orders made, including details about the coffee served, timestamps, and the total cost.

Implementation:

Create a log file that records each order transaction.
Log relevant details (coffee type, timestamp, cost) whenever a coffee is successfully served.
6. Coffee Strength Option
Description: Allow users to choose the strength of their coffee (e.g., regular, strong, mild).

Implementation:

Extend the Coffee class or create a new attribute for coffee strength.
Present the option to select strength when the user places an order.
7. Coffee Machine Status Display
Description: Show the current status of the coffee machine (e.g., "Ready", "Busy", "Needs Maintenance").

Implementation:

Introduce a simple status attribute in the CoffeeMachine class.
Update the status based on whether the machine is currently serving coffee or if ingredients are low.
8. Add a Help Menu
Description: Create a help menu that explains how to use the application, what options are available for coffee, and what each option entails.

Implementation:

Add a help command option in the user interface that displays a list of commands and their descriptions.
Keep it simple but informative to improve user experience.
