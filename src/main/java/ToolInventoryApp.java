import tool.Tool;

import java.util.ArrayList;
import java.util.Scanner;

public class ToolInventoryApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Tool> inventory = new ArrayList<>();

        inventory.add(new Tool(101, "Wrench", "3/8 to 15/16 set"));
        inventory.add(new Tool(102, "Wrench", "6mm to 24 mm set"));
        inventory.add(new Tool(103, "Wrench", "1 inch"));
        inventory.add(new Tool(104, "Wrench", "25mm"));
        inventory.add(new Tool(105, "Drill bit", "helix index standard set, 1/16 to 1/2"));
        inventory.add(new Tool(106,"Drill bit", "helix standard, 3/4"));

        int userChoice;

        // Do/While loop displays main menu, keeps looping to main menu until user enters 9 to exit program.
        do {
            System.out.println("\n==============================");
            System.out.println("=== Tool Inventory Program ===");
            System.out.println("==============================\n");
            System.out.println("1. Add tool");
            System.out.println("2. Remove tool");
            System.out.println("3. Search tool by name");
            System.out.println("4. Display inventory");
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
                    removeTool(input, inventory);
                    break;
                case 3:
                    System.out.println("Search tool coming soon");
                    break;
                case 4:
                    System.out.println(inventory);
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

            // do/while loop so the user can add more than one tool
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

        private static void removeTool(Scanner input, ArrayList<Tool> tools){
            String quit = "";

            System.out.println(tools);

            // do/while loop so the user can remove more than one tool
            do{
                System.out.println();
                System.out.println("=== Remove tool ===");
                System.out.println();
                System.out.println("Enter the ID of the tool you wish to remove.");
                System.out.println();
                System.out.println("ID: ");
                int id = input.nextInt();
                input.nextLine();

                Tool toolToRemove = null;

                for(Tool tool: tools){
                    if(tool.getId() == id){
                        toolToRemove = tool;
                        break;
                    }
                }

                if(toolToRemove != null){
                    tools.remove(toolToRemove);
                    System.out.println("\nTool with id " + id + " removed successfully.");
                } else {
                    System.out.println("\nError: No tool with the id " + id + " found. Enter a different id.");
                }

                System.out.println("\nRemove another tool?");
                System.out.println("Enter Y or N: ");

                quit = input.nextLine();

            } while(!quit.equalsIgnoreCase("n") );
        }
}
