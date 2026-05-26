import tool.Tool;

import java.util.ArrayList;
import java.util.Scanner;

public class ToolInventoryApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Tool> inventory = new ArrayList<>();

        int userChoice;

        // Do/While loop displays main menu, keeps looping to main menu until user enters 9 to exit program.
        do {
            System.out.println("\n==============================");
            System.out.println("=== Tool Inventory Program ===");
            System.out.println("==============================\n");
            System.out.println("1. Add tool");
            System.out.println("2. Remove tool");
            System.out.println("3. Search tool by name");
            System.out.println("9. Exit\n");
            System.out.print("Enter choice: ");

            while (!input.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number.");
                input.next();
            }

            userChoice = input.nextInt();
            input.nextLine();

            // switch/case to call methods choice to run by the user
            switch (userChoice) {
                case 1:
                    addTool(input, inventory);
                    break;
                case 2:
                    System.out.println("Remove tool coming soon");
                    break;
                case 3:
                    System.out.println("Search tool coming soon");
                    break;
                case 9:
                    System.out.println("\nExiting the program...");
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select a valid option.");
            }
        }
        // Exit program when user enters 9
        while (userChoice != 9);

        input.close();
    }

        private static void addTool(Scanner input, ArrayList<Tool> tools){

            String quit = "";

            // do/while loop to add a tool
            do{
                System.out.println();
                System.out.println("=== Add tool ===");
                System.out.println();
                System.out.println("Enter the information of the tool you wish to add.");
                System.out.println();
                System.out.println("ID: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Description: ");
                String description = input.nextLine();

                Tool newTool = new Tool(id, name, description);

                tools.add(newTool);
                System.out.println("\n New tool added successfully");

                System.out.println("\nAdd another tool?");
                System.out.println("Enter Y or N: ");

                quit = input.nextLine();

            } while(!quit.equalsIgnoreCase("n") );
        }
}
