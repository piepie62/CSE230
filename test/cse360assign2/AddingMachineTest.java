/*
 * Christopher Feger, CSE230, Assignment 2
 * The AddingMachineTest class
 */
package cse360assign2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests for AddingMachine
 * @author chris
 */
public class AddingMachineTest {
    
    public AddingMachineTest() {
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
     * Test of getTotal method, of class AddingMachine.
     */
    @Test
    public void testGetTotalDoNothing() {
        AddingMachine instance = new AddingMachine();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
    }

    /**
     * Assumes that testGetTotalDoNothing succeeded
     */
    @Test
    public void testAdd() {
        AddingMachine instance = new AddingMachine();
        instance.add(1);
        assertEquals(instance.getTotal(), 1);
    }

    /**
     * Assumes that testGetTotalDoNothing succeeded
     */
    @Test
    public void testSubtract() {
        AddingMachine instance = new AddingMachine();
        instance.subtract(1);
        assertEquals(instance.getTotal(), -1);
    }

    /**
     * Test of toString method, of class AddingMachine.
     */
    @Test
    public void testToStringDoNothing() {
        AddingMachine instance = new AddingMachine();
        assertEquals(instance.toString(), "0");
    }
    
    @Test
    public void testToStringAdd()
    {
        AddingMachine m = new AddingMachine();
        m.add(1);
        assertEquals(m.toString(), "0 + 1");
    }
    
    @Test
    public void testToStringSubtract()
    {
        AddingMachine m = new AddingMachine();
        m.subtract(1);
        assertEquals(m.toString(), "0 - 1");
    }

    /**
     * Assumes testToStringDoNothing succeeds and testGetTotal succeeds
     */
    @Test
    public void testClear() {
        AddingMachine instance = new AddingMachine();
        instance.clear();
        assertEquals(instance.getTotal(), 0);
        assertEquals(instance.toString(), "0");
    }
    
}
