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
            }if(userInput.get(i).equalsIgnoreCase("i")){
                userInput.set(i, "you");
            }if(userInput.get(i).equalsIgnoreCase("am")){
                userInput.set(i, "are");
            }
        }
        outputSay(userInput);
    }

    public void printList(ArrayList userInput) {
        for (Object x : userInput) {
            System.out.print(x + " ");
        }System.out.println();
    }

    public void outputSay(ArrayList userInput){
        if(userInput.contains("my")){
            System.out.print("Why do you say that ");
            printList(userInput);
        }if(userInput.contains("i")){
            System.out.println("You seem to think that ");
            printList(userInput);
        }if(userInput.contains("girls")){
            System.out.println("Please tell me more");
        }
    }
}
