package com.kodilla.test;

import java.util.Scanner;

class App {
    public static void main (String[] args) {
        int num1, num2;
        String op;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Choose operand: '+' or '-' ");
        op = scanner.next();

        switch(op) {
            case "+":
                System.out.println(calc.add(num1, num2));
                break;
            case "-":
                System.out.println(calc.sub(num1, num2));
                break;
            default:
                System.out.println("Invalid operand.");
        }
    }}