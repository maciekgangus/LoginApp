package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User[] users = {
                new User("admin", "pass", "token"),
                new User("adam", "passw0rd", "token"),
                new User("romek", "qwerty", "token"),
                new User("aga", "razdwa", "token"),
                new User("pati", "pass", "token")
        };

        Scanner scanner = new Scanner(System.in);

        boolean authenticated = false;

        while (!authenticated) {

            System.out.println("Witaj, podaj nazwę użytkownika:");
            String username = scanner.nextLine();
            System.out.println("Podaj hasło:");
            String password = scanner.nextLine();

            for (int i = 0; i < users.length; i++) {
                User user = users[i];
                if (user.authenticate(username, password)) {
                    System.out.println("Witaj, " + username + "!");
                    authenticated = true;
                    break;
                }
            }

        }

    }
}