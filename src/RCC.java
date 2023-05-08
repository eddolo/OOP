import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class RCC {
    public static void main(String[] args) {
        RCCO Recipes01 = new RCCO("Chicken Kiev", 5.40, 2, 20);
        RCCO Recipes02 = new RCCO("Chicken Parma", 8.99, 3, 25);
        RCCO Recipes03 = new RCCO("KFC - Kentucky Fried Cricket", 9.99, 1, 30);
        RCCO Recipes04 = new RCCO("Chicken Curry", 6.20, 4, 15);
        System.out.println(
                "Which recipe would you like to make?" + "\n"
                        + "1. " + Recipes01.getRecipes() + " - Price: " + Recipes01.getPrice() + " For " + Recipes01.getQuantity() + " people, preparation time: " + Recipes01.getTime() + "min. \n"
                        + "2. " + Recipes02.getRecipes() + " - Price: " + Recipes02.getPrice() + " For " + Recipes02.getQuantity() + " people, preparation time: " + Recipes02.getTime() + "min. \n"
                        + "3. " + Recipes03.getRecipes() + " - Price: " + Recipes03.getPrice() + " For " + Recipes03.getQuantity() + " person, preparation time: " + Recipes03.getTime() + "min. \n"
                        + "4. " + Recipes04.getRecipes() + " - Price: " + Recipes04.getPrice() + " For " + Recipes04.getQuantity() + " people, preparation time: " + Recipes04.getTime() + "min. \n");

        // Read the user's input using a Scanner object
        Scanner scanner = new Scanner(System.in);
        int recipeNumber = scanner.nextInt();

        // Loop until the user enters a valid input
        while (recipeNumber < 1 || recipeNumber > 4) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            recipeNumber = scanner.nextInt();
        }
        // Process the user's input and execute the chosen recipe
        switch (recipeNumber) {
            case 1:
                // execute Recipe01
                System.out.println("Congratulations! You chose " + Recipes01.getRecipes());
                break;
            case 2:
                // execute Recipe02
                System.out.println("Congratulations! You chose " + Recipes02.getRecipes());
                break;
            case 3:
                // execute Recipe03
                System.out.println("Congratulations! You chose " + Recipes03.getRecipes());
                break;
            case 4:
                // execute Recipe04
                System.out.println("Congratulations! You chose " + Recipes04.getRecipes());
                break;
        }


        RCCDishes Dish01 = new RCCDishes("Chicken Kiev", Arrays.asList("- 4 Chicken fillet", "\n- 225g dried breadcrumbs", "\n- 75g grated parmesan", "\n- 5 eggs, beaten", "\n- 100g plain flour", "\n- 1 pinch of paprika", "\n- vegetable oil for frying"), Recipes01.getPrice());
        RCCDishes Dish02 = new RCCDishes("Chicken Parma", Arrays.asList("- 2 Chicken fillet", "\n- 4 aubergine", "\n- 1 can of tomato salsa", "\n- 100g of ricotta"), Recipes02.getPrice());
        RCCDishes Dish03 = new RCCDishes("KFC - Kentucky Fried Cricket", Arrays.asList("- 4 Vegan Chricket fillet", "\n- 50g plain flour", "\n- 1 pinch of spice mix for chicken", "\n- vegetable oil for frying"),Recipes03.getPrice());
        RCCDishes Dish04 = new RCCDishes("Chicken Curry", Arrays.asList("- 6 Chicken fillet", "\n- 100g of japanese curry java cubes", "\n- 50ml of soy sauce", "\n- 3l of water"),Recipes04.getPrice());

        if(recipeNumber == 1) {
            System.out.println("Let's check out your selection! \n"
                    + "For the following dish: " + Dish01.getName() + ", you will need to order: \n" + Dish01.getIngredients() + "\nThe total price is: " + Dish01.getPrice() + "\n");
        } else if (recipeNumber == 2) {
            System.out.println("Let's check out your selection! \n"
                    + "For the following dish: " + Dish02.getName() + ", you will need to order: \n" + Dish02.getIngredients() + "\nThe total price is: " + Dish02.getPrice() + "\n");
        } else if (recipeNumber == 3) {
            System.out.println("Let's check out your selection! \n"
                    + "For the following dish: " + Dish03.getName() + ", you will need to order: \n" + Dish03.getIngredients() + "\nThe total price is: " + Dish03.getPrice() + "\n");
        } else if (recipeNumber == 4) {
            System.out.println("Let's check out your selection! \n"
                    + "For the following dish: " + Dish04.getName() + ", you will need to order: \n" + Dish04.getIngredients() + "\nThe total price is: " + Dish04.getPrice() + "\n");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }
        // Read the user's input using a Scanner object
        Scanner scannerOrder = new Scanner(System.in);
        String acceptOrder;

        // Prompt the user to enter yes or no to accept the order
        System.out.println("Would you like to purchase the ingredients pack? (yes/no)");
        acceptOrder = scannerOrder.nextLine();

        // Check if the input is valid
        while (!acceptOrder.equalsIgnoreCase("yes") && !acceptOrder.equalsIgnoreCase("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            acceptOrder = scannerOrder.nextLine();
        }

        if (acceptOrder.equalsIgnoreCase("yes")) {
            System.out.println("Congratulation! Order placed! It will be with you soon!");
        } else {
            System.out.println("Order canceled.");
        }


    }
}
