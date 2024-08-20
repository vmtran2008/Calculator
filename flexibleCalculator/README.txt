

This project provides the implementation of a flexible calculator for that can be used to perform 
various simple arithmetic operations on the primitive double data type referred to as the operands.
The implementation adhere Open/Closed Principle (OCP) where Calculator entity is extensible.


This calculator class provides 2 functions:

1) double calculate(Operation op, double num1, double num2): 
   handle a specific arithmetic operation on 2 operands, num1 and num2

2) public double chainOperations(double initialValue, Operation[] operations, double[] values):
   support a chain of operations performed on the initialValue and an array of values
   
   
   


