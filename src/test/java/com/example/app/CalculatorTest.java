package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    float x = 4;
    float y = 2;

    @Test
    public void testOperationsWithEnumAdd(){
        float result = calc.operation(x, y, TypeOfOperation.ADD);
        assertEquals(6, result);
    }
    @Test
    public void testOperationsWithEnumDivide(){
        float result = calc.operation(x, y, TypeOfOperation.DIVIDE);
        assertEquals(2, result);
    }
    @Test
    public void testOperationsWithEnumMultiply(){
        float x = 4;
        float y = 0.5f;
        float result = calc.operation(x, y, TypeOfOperation.MULTIPLY);
        assertEquals(2, result);
    }


}