package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Eliza {


    Scanner scan = new Scanner(System.in);

    public Eliza() {
        boolean start = true;
        while (start) {
            System.out.println("Good day. What is your problem? Enter your response here or Q to quit: ");
            String input = scan.nextLine();
            split(input);

            if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("I am feeling great")) {
                System.out.println("<< END");
                start = false;
            } else {
                System.out.println("Enter your response here or Q to quit: ");
                input = scan.nextLine();
                split(input);
            }
        }
    }

    public void split(String input) {
        ArrayList<String> userInput = new ArrayList<String>();
        for (String splitWord : input.split(" ")) {
            userInput.add(splitWord);
        }
        for (int i = 0; i <= userInput.size() - 1; i++) {
            if (userInput.get(i).equalsIgnoreCase("my")) {
                userInput.set(i, "your");
            }if (userInput.get(i).equalsIgnoreCase("me")) {
                userInput.set(i, "you");
            }
        }
        printList(userInput);
    }

    public void printList(ArrayList userInput) {
        for (Object x : userInput) {
            System.out.print(x + " ");
        }System.out.println();
    }
}
