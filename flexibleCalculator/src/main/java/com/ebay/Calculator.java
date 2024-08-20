package com.ebay;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * The Calculator class uses a hashMap to associate Operation with their corresponding implementations. 
 * It also support chaining operations.
 * 
 * 
 * @author vanminhtran
 *
 */
public class Calculator {
	
	private final Map<Operation, ArithmeticOperator> operationMap = new HashMap<Operation, ArithmeticOperator>();

    public Calculator() {
        // Register default operations
        operationMap.put(Operation.ADD, new AddOperator());
        operationMap.put(Operation.SUBTRACT, new SubtractOperator());
        operationMap.put(Operation.MULTIPLY, new MultiplyOperator());
        operationMap.put(Operation.DIVIDE, new DivideOperator());
    }

    
    /*
     * 
     * Support additional operations for extensibility
     */
    
    public void addOperation(Operation op, ArithmeticOperator operationHandler) {
        operationMap.put(op, operationHandler);
        
    }
    
    
    
    
	double calculate(Operation op, double num1, double num2)
	{
		
		ArithmeticOperator operation = operationMap.get(op);
        if (operation == null) {
            throw new UnsupportedOperationException("The Operation not supported: " + op);
        }
        return operation.apply(num1, num2);
	}
	
	
	public double chainOperations(double initialValue, Operation[] operations, double[] values) {
        if (operations.length != values.length) {
            throw new IllegalArgumentException("The number of operations is not the same number of values");
        }
        double result = initialValue;
        for (int i = 0; i < operations.length; i++) {
            result = calculate(operations[i], result, values[i]);
        }
        return result;
    }
	
	
	
	
	

}
