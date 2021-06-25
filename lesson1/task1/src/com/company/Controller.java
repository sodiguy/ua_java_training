package com.company;

import com.sun.tools.javac.Main;

public class Controller{
    private final String hello = "Hello";
    private final String world = "world!";

    public void validateHello(String userFirstInput){
        while(userFirstInput.equals(hello)!=true){
            System.out.println("Sorry, wrong input! Please try again");

        }
    }
    public void validateWorld(String userSecondInput){
        if(userSecondInput.equals(world)!=true){
            System.out.println("Sorry, wrong input! Please try again");
        }
    }
}
