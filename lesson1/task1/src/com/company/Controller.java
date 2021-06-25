/* *Controller.java * *Version 1.0 * *25.06.2021 * *No copyright presented*/
package com.company;

public class Controller{
    private final String hello = "Hello";
    private final String world = "world!";

    public void validateHello(String userFirstInput){
        if(userFirstInput.equals(hello)!=true){
            System.out.println("Sorry, wrong input! Please try again");
        }
    }
    public void validateWorld(String userSecondInput){
        if(userSecondInput.equals(world)!=true){
            System.out.println("Sorry, wrong input! Please try again");
        }
    }
}
