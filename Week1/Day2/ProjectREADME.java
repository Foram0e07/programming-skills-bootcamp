/*# Day2 - Project

 This project involves creating a simple login system in either Java or Python, using basic variables, datatypes, and control flow statements.

 Store an email and password in respective variables, compare them to a set of predefined email and password values(suppose that the second values are provided by user), and then either grant access or deny it based on whether or not the input values match

## Suggestions

```java
String email="demo@email.com";
String password="123";
String userEmail="demo1@email.com";
String userPassword="234";
```

## Pseudocode

1. store an email (consider this email as pre stored value)
2. store a password(consider this password as pre stored value)
3. store an second email(consider this email as user entered/provided email for Login)
4. match both emails
5. check if both emails match then goto step 6 else goto step 7
6. check if both passwords match then print success and goto step 8 else goto step 7
7. print wrong credentials
8. Exit Program

HERE IS THE CODE*/

import java.util.Scanner;

public class ProjectREADME {
    public static void main(String[] args) {
        // Step 1: Store a pre-stored email and password
        String storedEmail = "example@example.com";
        String storedPassword = "password123";

        // Step 2: Store the user-provided email
        System.out.print("Enter your email: ");
        Scanner scanner = new Scanner(System.in);
        String enteredEmail = scanner.nextLine();

        // Step 3: Match both emails
        if (enteredEmail.equals(storedEmail)) {
            // Step 4: Store the user-provided password
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            // Step 5: Check if both passwords match
            if (enteredPassword.equals(storedPassword)) {
                // Step 6: Print success
                System.out.println("Login successful!");
                // Step 7: Exit the program
                System.exit(0);
            } else {
                // Step 7: Print wrong credentials
                System.out.println("Wrong password!");
                // Step 8: Exit the program
                System.exit(0);
            }
        } else {
            // Step 7: Print wrong credentials
            System.out.println("Wrong email!");
            // Step 8: Exit the program
            System.exit(0);
        }
    }
}
