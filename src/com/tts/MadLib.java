package com.tts;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();

        System.out.printls("Here is your story: /n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);

//        Enter a name:
//        Boogie
//        Give me an adverb:
//        running
//        Give me an adjective:
//        pretty
//        Give me a noun:
//        banana
//        Give me another noun:
//        cart
//        Give me a number:
//        1
//        Give me your name:
//        Simeon C. Sayaz
//        Here is your story:
//
//        Dear Boogie,
//        You are running pretty and I want to be your banana!
//                I want to go to the cart with you in 1 days.
//                Sincerely, Simeon C. Sayaz
    }
}
