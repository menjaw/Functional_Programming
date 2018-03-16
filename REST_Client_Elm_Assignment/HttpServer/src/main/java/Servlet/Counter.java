/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/**
 *
 * @author Menja
 */
public class Counter {

    
    private int count;// current value

    // create a new counter with the given parameters
    public Counter() {
        count = 0;
    }

    // increment the counter by 1
    public void incrementCount() {
        count++;
    }

    // return the current count
    public int returnCount() {
        return count;
    }

    // return a string representation of this counter
    @Override
    public String toString() {
        return "Count: " + count;
    }
}
