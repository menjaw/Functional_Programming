/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentExamples;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Menja
 */
public class Calculator_RPN {

    private static Stack<Integer> stack = new Stack();
    private static Scanner scanner = new Scanner(System.in);

    ;

    public static void main(String[] args) {
        //System.out.println(chooseAction());
        reversePolishNotation();

    }

    //METHODS
    public static void reversePolishNotation() {
        System.out.println("Enter numbers");
        while (true) {
            String input = scanner.next();
            // String[] inputArray = input.split(" ");
            switch (input) {
                case "+":
                    int result = stack.pop() + stack.pop();
                    stack.push(result);
                    System.out.println(result);
                    break;
                case "-":
                    result = stack.pop() - stack.pop();
                    stack.push(result);
                    System.out.println(result);
                    break;
                case "*":
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    System.out.println(result);
                    break;
                case "/":
                    result = stack.pop() / stack.pop();
                    stack.push(result);
                    System.out.println(result);
                    break;
                default:
                    int intNumberOrOperand = Integer.valueOf(input);
                    stack.push(intNumberOrOperand);
                    System.out.println(stack);
                    break;
            }
        }
    }

//    public static double addition(double num1, double num2) {
//        double result = num1 + num2;
//        return result;
//    }
//    public static double subtraction(double num1, double num2) {
//        double result = num1 - num2;
//        return result;
//    }
//
//    public static double division(double num1, double num2) {
//        double result = num1 / num2;
//        return result;
//    }
//
//    public static double multication(double num1, double num2) {
//        double result = num1 * num2;
//        return result;
//    }

//    public static String chooseAction() {
//        String welcomeMessage = "Welcome! Choose an Arithmetic operation:" + "\n";
//        String choiseMessage = "1 - Addition" + "\n" + "2 - Subtraction" + "\n" + "3 - Division" + "\n" + "4 - Multiplication" + "\n";
//        String switchMessage;
//
//        System.out.println(welcomeMessage);
//        System.out.println(choiseMessage);
//        scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                switchMessage = "Choice 1" + addition();
//                break;
//            case 2:
//                switchMessage = "Choice 2 is subtraction()";
//                break;
//            case 3:
//                switchMessage = "Choice 3 is division()";
//                break;
//            case 4:
//                switchMessage = "Choice 4 is multiplication()";
//                break;
//            default:
//                switchMessage = "Sorry it is not possible()";
//                break;
//        }
//        return switchMessage;
//    }
}
