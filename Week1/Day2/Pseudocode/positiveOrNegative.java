/*Step 1: Declare a variable to store number
Step 2: Store a number
Step 3: Check if the number is greater than zero then goto step 4
Step 4: Display a message to the user indicating that the number is positive
Step 5: Check if the number is less than zero then goto step 6
Step 6: Display a message to the user indicating that the number is negative
Step 7: If the number is not positive or negative, it must be zero
Step 8: Display a message to the user indicating that the number is zero
Step 9: Exit Program

HERE IS THE CODE*/

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        // Step 1: Declare a variable to store the number
        int number;

        // Step 2: Store a number
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        // Step 3: Check if the number is greater than zero
        if (number > 0) {
            // Step 4: Display a message indicating that the number is positive
            System.out.println("The number is positive.");
        }
        // Step 5: Check if the number is less than zero
        else if (number < 0) {
            // Step 6: Display a message indicating that the number is negative
            System.out.println("The number is negative.");
        }
        // Step 7: If the number is not positive or negative, it must be zero
        else {
            // Step 8: Display a message indicating that the number is zero
            System.out.println("The number is zero.");
        }

        // Step 9: Exit the program
        System.exit(0);
    }
}
