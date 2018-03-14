/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Menja
 */
public class Factorial_Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    //Methods
    public static long factorial(long i) {
        if (i <= 1) {//base case
            return 1;
        } else {
            System.out.println("Current factorial number: " + i);
            return i * factorial(i - 1);
        }
    }
    /**
     * METHOD EXPLAINED - Factorial program
     *
     * Recursion is a method that call itself to it reach the base case
     *
     * Factorial 5: 5! = 5 * 4 * 3 * 2 * 1 = 120
     *
     * First step: 5! --> 5 * 4! --> 4 * 3! --> 3 * 2! --> 2 * 1! --> 1! = 1
     *
     * Second step: 2 * 1 = 2 --> 3 * 2 = 6 --> 4 * 6 = 24 --> 5 * 24 = 120 -->
     * 5! = 120
     */
}
