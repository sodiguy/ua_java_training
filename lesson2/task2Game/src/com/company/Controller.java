package com.company;

import java.util.Scanner;

public class Controller {
    public int inputNumber;

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void collectStatistics(int attemptsAmount){
        System.out.println("Your statistics:\nTotal attempts amount: " + attemptsAmount );

    }

    public int getIntInput(){
        Scanner scan = new Scanner(System.in);
        inputNumber = scan.nextInt();
        return inputNumber;
    }

    public void proceed(){
        int generatedRandom = model.generateRandom();
        view.printMessage(view.greetingMessage);
        inputNumber = getIntInput();
        int attemptsAmount = 0;
        int leftPart = generatedRandom - 10;
        int rightPart = generatedRandom + 10;
        if(inputNumber == generatedRandom){
            view.printMessage(View.congratulationMessage);
        }else{
            while(inputNumber != generatedRandom){
                view.printMessage(View.wrongNumber);
                view.printMessage(View.hint);
                System.out.println(leftPart + " and " + rightPart);
                attemptsAmount += 1;
                inputNumber = getIntInput();
            }
            view.printMessage(View.congratulationMessage);
            collectStatistics(attemptsAmount);
        }
    }
}
