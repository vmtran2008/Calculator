package com.ebay;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private final static double EPSILON=0.01;
	
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();

    }

    @Test
    public void testArithmeticOperations() {
    	
        assertEquals(15, calculator.calculate(Operation.ADD, 5, 10), EPSILON);
        assertEquals(5, calculator.calculate(Operation.SUBTRACT, 9, 4), EPSILON);
        assertEquals(3, calculator.calculate(Operation.DIVIDE, 18, 6), EPSILON);
        assertEquals(24, calculator.calculate(Operation.MULTIPLY, 3, 8), EPSILON);
    }

    @Test
    public void testChainingOperations() {
        Operation[] ops = {Operation.SUBTRACT, Operation.ADD, Operation.DIVIDE};
        double[] values = {10, 5, 5}; // Start with 5, add 3, then multiply by 2
        assertEquals(5, calculator.chainOperations(30, ops, values), EPSILON);
    }
    
    

//    @Test(expected=UnsupportedOperationException.class)
//    public void testUnsupportedOperation() {
//    	calculator.calculate(Operation.ADD, 2, 3); 
//   }

    
    
    @Test(expected=ArithmeticException.class)
    public void testDivideByZero() {
    	
    	calculator.calculate(Operation.DIVIDE, 1, 0);
    	
    }
}