package com.tts;
import java.util.Scanner;
// Your First Program

public class HelloWorld {
    public static void main(String[] args) {
        //        .print vs. println
        //        System.out.print("Hello, World!\n");
        //        System.out.print("Today is awesome!");
        //        System.out.print("... don't you think?");
        Scanner Input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s, %s!\n", lastName, firstName);

    }
}




