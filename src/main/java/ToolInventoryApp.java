import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ToolInventoryApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Objects> tools = new ArrayList<>();

        int userChoice;

        // Do/While loop displays main menu, keeps looping to main menu until user enters 9 to exit program.
        do {
            System.out.println();
            System.out.println("==============================");
            System.out.println("=== Tool Inventory Program ===");
            System.out.println("==============================");
            System.out.println("1. Add tool");
            System.out.println("2. Remove tool");
            System.out.println("3. Search tool by name");
            System.out.println("9. Exit");
            System.out.println();
            System.out.print("Enter choice: ");

            while (!input.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number.");
                input.next();
            }

            userChoice = input.nextInt();

            // switch/case to call methods choice to run by the user
            switch (userChoice) {
                case 1:
                    System.out.println("Add tool coming soon");
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
}
