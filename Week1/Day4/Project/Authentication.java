/*# Project: User Registration and Verification

This project involves creating a user registration and verification system using Core Java. The system should allow users to register their email and password, store the data into a list/hashmap, and verify their credentials upon login.

## Requirements

### 1. User Registration

* Create a class **_Authentication_** to store user information, with instance variables **_email_** and **_password_**.
* Take input from the user for their email and password.
* Create an object of **_Hashmap_** and store the user data into a list/hashmap.

### 2. User Verification

* Take input from the user for their email and password to verify.
* Search for the user in the list/hashmap using their email as the key.
* If the user is found, compare their stored password with the entered password.
* If the entered password matches the stored password, print "Login Success" and exit the program.
* If the entered password does not match the stored password, print "Wrong credentials" and exit the program.

### 3.Store Data in Text File

* Use IO concepts to store the user data into a text file.
* Create a switch case menu to allow the user to choose whether to register or login.
* Depending on the choice, perform the corresponding action and store/retrieve data from the text file.

## Additional Considerations

* Use object-oriented programming concepts such as encapsulation and inheritance to structure the code.

* Handle exceptions and errors properly to provide a user-friendly experience.
  
* Add additional features such as password encryption and user account management (e.g. password reset) to enhance the functionality of the system

## Conclusion

In this project, you will create a user registration and verification system using Core Java, incorporating object-oriented programming, IO concepts, and exception handling. By the end of the project, you will have gained experience in implementing a real-world use case and be able to apply your knowledge to other projects in the future.*/

//HERE IS THE CODE

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Authentication {
    private String email;
    private String password;

    public Authentication(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Map<String, Authentication> users = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the choice

            switch (choice) {
                case 1:
                    System.out.print("Enter your email: ");
                    String regEmail = scanner.nextLine();

                    // Check if the user already exists
                    if (users.containsKey(regEmail)) {
                        System.out.println("User already exists. Please login or register with a different email.");
                        break;
                    }

                    System.out.print("Enter your password: ");
                    String regPassword = scanner.nextLine();

                    // Create an object of Authentication and store it in the hashmap
                    Authentication registration = new Authentication(regEmail, regPassword);
                    users.put(regEmail, registration);
                    System.out.println("Registration successful.");
                    break;

                case 2:
                    System.out.print("Enter your email: ");
                    String loginEmail = scanner.nextLine();

                    // Check if the user exists
                    if (!users.containsKey(loginEmail)) {
                        System.out.println("User does not exist. Please register first.");
                        break;
                    }

                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    Authentication user = users.get(loginEmail);
                    // Check if the entered password matches the stored password
                    if (user.getPassword().equals(loginPassword)) {
                        System.out.println("Login Successful.");
                    } else {
                        System.out.println("Wrong credentials.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 3);

        // Store the user data in a text file
        try {
            FileWriter fileWriter = new FileWriter("userdata.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Authentication user : users.values()) {
                bufferedWriter.write(user.getEmail() + "," + user.getPassword());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

