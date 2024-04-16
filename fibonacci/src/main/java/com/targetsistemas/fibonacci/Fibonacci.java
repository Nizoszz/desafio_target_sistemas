package com.targetsistemas.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check the fibonacci sequence: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number. Please re-enter:");
            scanner.next();
        }

        int number = scanner.nextInt();
        scanner.close();

        int a = 0;
        int b = 1;
        int i = 0;

        while (i <= number){
           if(a == number){
               System.out.println(number + " belongs to the Fibonacci sequence");
               return;
           }
            i++;
            b = a + b;
            a = b - a;
        }
        System.out.println(number + " does not belong to the Fibonacci sequence");
    }
}
