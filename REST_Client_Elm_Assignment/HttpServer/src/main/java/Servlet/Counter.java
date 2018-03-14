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

    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter(int max) {
        maxCount = max;
        count = 0;
    }

    // increment the counter by 1
    public void increment() {
        if (count < maxCount) {
            count++;
        }
    }

    // return the current count
    public int returnCount() {
        return count;
    }

    // return a string representation of this counter
    public String toString() {
        return "Count: " + count;
    }
}
