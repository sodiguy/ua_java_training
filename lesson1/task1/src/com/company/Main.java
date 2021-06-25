package com.company;

import java.util.Scanner;

public class Main{

    public String firstInput;
    public String secondInput;

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
	 View view = new View();
	 Controller controller = new Controller();
	 view.printFirstOutput();
	 String firstInput = scanner.next();
	 controller.validateHello(firstInput);
	 view.printSecondOutput();
	 String secondInput = scanner.next();
	 controller.validateWorld(secondInput);
    }
}
