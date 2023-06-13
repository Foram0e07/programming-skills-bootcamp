/*# Login System Project

## Project Description

In this project, we will create a login system using classes and objects. The program will store a pre-defined email and password, and ask the user to enter their email and password. If the email and password match the pre-defined values, the program will print "Login Successful". If the email and password do not match, the program will print "Wrong Credentials". The program will then exit.
Project Instructions

>Follow the instructions below to create the login system:

1. Create a class named **_LoginSystemProject_**.
2. Inside the class, define two private fields named **_email_** and **_password_** to store the pre-defined email and password.
3. Define a method named **_setCredentials_** that initializes data members: **_email_** and **_password_**. The method should initialize the fields with the provided values.
4. Define a method named **_login_** that takes two values from user: **_userEmail_** and **_usrePassword_**. The method should compare the provided email and password with the pre-defined values. If they match, print "Login Successful". Otherwise, print "Wrong Credentials".
5. Define a **_main_** method that creates an object of the **_LoginSystem_**. Now, call **_setCredentials_** to set values, Then call the **_login_** method with the provided values.
*/

//HERE IS THE CODE

import java.util.Scanner;

public class LoginSystemProject {
    private String email;
    private String password;

    public void setCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void login(String userEmail, String userPassword) {
        if (userEmail.equals(email) && userPassword.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong Credentials");
        }
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.setCredentials("example@example.com", "password123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();

        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        loginSystem.login(userEmail, userPassword);
    }
}
