package com.example.app;

import java.util.*;

public class main {

	public static void main(String[] args) {
		boolean isAlive = true;
		Calculator calc = new Calculator();
	    System.out.println("Simple calculator");
		while (isAlive){
            System.out.println("Choose please operation:");
            System.out.println("1. Add.\t 2. Multiply.\t 3.Divide\t 4.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                if (scanner.hasNextFloat()) {
                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                            Operation(calc, TypeOfOperation.ADD);
                            break;
                        case 2:
                            Operation(calc, TypeOfOperation.MULTIPLY);
                            break;
                        case 3:
                            Operation(calc, TypeOfOperation.DIVIDE);
                            break;
                        case 4:
                            isAlive = false;
                            break;
                    }
                } else {
                    System.out.println("Enter number please");
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    public static void Operation(Calculator calculator, TypeOfOperation select){
        Scanner scanner = new Scanner(System.in);
        float result;
        System.out.println("Enter 1st number:");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter 2nd number:");
        float secondNumber = scanner.nextFloat();

        result = calculator.operation(firstNumber, secondNumber, select);

        System.out.printf("Result = %.2f\n", result);
    }
	
}