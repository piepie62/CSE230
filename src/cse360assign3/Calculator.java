/*
 * Christopher Feger, CSE230, Assignment 3
 * The AddingMachine class
 */
package cse360assign3;

/**
 * Keeps track of numeric operations and their final result
 */
public class Calculator extends AddingMachine {

    public Calculator() {
        super();
    }

    /**
     * Multiplies the current total by the value
     *
     * @param value Value to multiply by
     */
    public void multiply(int value) {
        total *= value;
        showMe += " * " + value;
    }

    /**
     * Divides the current total by the value
     *
     * @param value Value to divide by
     */
    public void divide(int value) {
        if (value == 0) {
            total = 0;
        } else {
            total /= value;
        }
        showMe += " / " + value;
    }

    /**
     * Raises the current total to the given exponent
     *
     * @param value Value of exponent
     */
    public void exponent(int value) {
        if (value < 0) {
            total = 0;
        } else if (value == 0) {
            total = 1;
        } else {
            int base = total;
            // Would be iteration=1 if we started by resetting it to 1
            for (int iteration = 1; iteration < value; iteration++) {
                total *= base;
            }
        }
        showMe += " ^ " + value;
    }
}
