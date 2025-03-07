# Coffee Machine Management System - Suggested Features

## 1. Coffee Preparation Time
**Description**: Display the preparation time for each coffee type when a user makes a selection.

**Requirements**:
- Each coffee has a preparation time (in seconds).
- Preparation time should be printed before serving the coffee.

## 2. Coffee Strength Option
**Description**: Allow users to choose the strength of their coffee (e.g., regular, strong, mild).

**Requirements**:
- Each coffee has an associated strength.
- Present the option to select strength when the user places an order.

## 3. Coffee Machine Status Display
**Description**: Show the current status of the coffee machine (e.g., "Ready", "Busy", "Needs Maintenance").

**Requirements**:
- The coffee machine should have a status  (e.g., "Ready", "Busy", "Needs Maintenance").
- Update the status based on whether the machine is currently serving coffee or if ingredients are low.

## 4. Discount for Frequent Orders
**Description**: Implement a simple discount system for users who order a certain number of coffees within a given period.

**Requirements**:
- Track the number of orders for each coffee.
- If a user orders more than a specific number (e.g., 5 coffees), apply a discount (e.g., 10% off the next order).

## 5. Simple Logging System
**Description**: Implement a basic logging system to keep track of orders made, including details about the coffee served, timestamps, and the total cost.

**Requirements**:
- Log all transactions in a file
- Log relevant details (coffee type, timestamp, cost) whenever a coffee is successfully served.

## 6. Ingredient Refill Notification
**Description**: Implement a notification system to alert the user when any ingredient (water, coffee beans, milk) is running low.

**Requirements**:
- Add an alert system that checks the ingredient levels each time coffee is served.
- If any ingredient falls below a certain threshold (e.g., 20% of its capacity), print a message prompting the user to refill it.

## 7. Add a Help Menu
**Description**: Create a help menu that explains how to use the application, what options are available for coffee, and what each option entails.

**Requirements**:
- Add a help command option in the user interface that displays a list of commands and their descriptions.
- Keep it simple but informative to improve user experience.
