package com.infy.calc;
import com.infy.calc.Calculator;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
	
	//Addition
	
	@Test
	public void testAddingTwoPositiveIntegers() throws Exception {
        int expected = 11;
        int actual = Calculator.add(4, 7);
        assertEquals(expected, actual);
    }
	@Test
    public void testAddingTwoNegativeIntegers() throws Exception {
        int expected = -11;
        int actual = Calculator.add(-4, -7);
        assertEquals(expected, actual);
    }
	@Test
    public void testAddingNegativeIntegerToPositiveInteger() throws Exception {
        int expected = -3;
        int actual = Calculator.add(4, -7);
        assertEquals(expected, actual);
    }
	
	//Subtraction
	
	@Test
	public void testSubtractingTwoPositiveIntegers() throws Exception {
        int expected = 3;
        int actual = Calculator.sub(7, 4);
        assertEquals(expected, actual);
    }
	@Test
    public void testSubtractingTwoNegativeIntegers() throws Exception {
        int expected = 3;
        int actual = Calculator.sub(-4, -7);
        assertEquals(expected, actual);
    }
	@Test
    public void testSubtractingNegativeIntegerToPositiveInteger() throws Exception {
        int expected = 11;
        int actual = Calculator.sub(4, -7);
        assertEquals(expected, actual);
    }
	
	//Division
	
	@Test
	public void testDividingTwoPositiveIntegers() throws Exception {
        int expected = 3;
        int actual = Calculator.div(12, 4);
        assertEquals(expected, actual);
    }
	@Test(expected = java.lang.ArithmeticException.class)
    public void testDividingWithZero() throws Exception {
        Calculator.div(4, 0);
        
    }
	
	//Multiplication
	
	@Test
	public void testMultiplyingTwoPositiveIntegers() throws Exception {
        int expected = 48;
        int actual = Calculator.mult(12, 4);
        assertEquals(expected, actual);
    }
	@Test
	public void testMultiplyingWithZero() throws Exception {
        int expected = 0;
        int actual = Calculator.mult(12, 0);
        assertEquals(expected, actual);
    }
}
