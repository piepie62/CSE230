/*
 * Christopher Feger, CSE230, Assignment 3
 * The AddingMachine class
 */
package cse360assign3;

/**
 * Tracks addition/subtraction operations done on itself
 */
public class AddingMachine {

    protected int total;
    protected String showMe;

    /**
     * Initializes the AddingMachine with total 0
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        showMe = "0";
    }

    /**
     * Returns the current total
     *
     * @return The current total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds the value to the current total
     *
     * @param value Value to add
     */
    public void add(int value) {
        total += value;
        showMe += " + " + value;
    }

    /**
     * Subtracts the value from the current total
     *
     * @param value Value to subtract
     */
    public void subtract(int value) {
        total -= value;
        showMe += " - " + value;
    }

    /**
     * Will eventually do something probably
     *
     * @return
     */
    public String toString() {
        return showMe;
    }

    /**
     * Clears the current total
     */
    public void clear() {
        total = 0;
        showMe = "0";
    }
}
