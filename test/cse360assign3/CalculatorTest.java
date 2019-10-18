/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assign3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        Calculator instance = new Calculator();
        instance.add(1);
        instance.multiply(3);
        assertEquals(instance.getTotal(), 3);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivideNormal() {
        Calculator instance = new Calculator();
        instance.add(9);
        instance.divide(3);
        assertEquals(instance.getTotal(), 3);
    }

    @Test
    public void testDivideZero() {
        Calculator instance = new Calculator();
        instance.add(9);
        instance.divide(0);
        assertEquals(instance.getTotal(), 0);
    }

    /**
     * Test of exponent method, of class Calculator.
     */
    @Test
    public void testExponentNormal() {
        Calculator instance = new Calculator();
        instance.add(2);
        instance.exponent(3);
        assertEquals(instance.getTotal(), 8);
    }

    @Test
    public void testExponentZero() {
        Calculator instance = new Calculator();
        instance.exponent(0);
        assertEquals(instance.getTotal(), 1);
    }

    @Test
    public void testExponentNegative() {
        Calculator instance = new Calculator();
        instance.add(9);
        instance.exponent(-5);
        assertEquals(instance.getTotal(), 0);
    }

    @Test
    public void testToStringMultiply() {
        Calculator instance = new Calculator();
        instance.multiply(3);
        assertEquals(instance.toString(), "0 * 3");
    }

    @Test
    public void testToStringDivide() {
        Calculator instance = new Calculator();
        instance.divide(3);
        assertEquals(instance.toString(), "0 / 3");
    }

    @Test
    public void testToStringExponent() {
        Calculator instance = new Calculator();
        instance.exponent(3);
        assertEquals(instance.toString(), "0 ^ 3");
    }

}
