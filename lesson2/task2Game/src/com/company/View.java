package com.company;

public class View {
    public static final String greetingMessage = "Hello! The game is on. Please, Input a number between 0 and 100...";
    public static final String wrongNumber = "Sorry! Wrong number. Please try again ";
    public static final String congratulationMessage = "Congratulations! Game is over.";
    public static final String printStatistics = "Printing out your statistics:\n}";
    public static final String hint = "A little hint :) Your number is between...";
    public void printMessage(String message){
        System.out.println(message);
    }
}
