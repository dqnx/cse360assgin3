package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
 	public void testCalculator() 
	{
 		Calculator test = new Calculator();
 		
 		assertNotNull(test);
 	}
	
	@Test
	public void testGetTotal() 
	{
		Calculator test = new Calculator();
		
		//test for default total value 0
		assertEquals(test.getTotal(), 0);

	}

	@Test
	public void testAdd() 
	{
		Calculator test = new Calculator();
		
		//remember that they're cumulative
		//works as a test for getTotal method when values are added as well
		test.add(3);
		assertEquals(test.getTotal(), 3);
		test.add(4);
		assertEquals(test.getTotal(), 7);
		test.add(10);
		assertEquals(test.getTotal(), 17);
		test.add(1900);
		assertEquals(test.getTotal(), 1917);
		
		//test for adding negative (subtracts)
		test.add(-500);
		assertEquals(test.getTotal(), 1417);
		test.add(-675);
		assertEquals(test.getTotal(), 742);
	}

	@Test
	public void testSubtract() 
	{
		Calculator test = new Calculator();
		
		//again just like add, it's cumulative.
		//works as a test for getTotal method when values are subtracted
		test.subtract(3);
		assertEquals(test.getTotal(), -3);
		test.subtract(10);
		assertEquals(test.getTotal(), -13);
		test.add(9);
		test.subtract(2);
		assertEquals(test.getTotal(), -6);
		
		//test for subtracting negatives (adds)
		test.subtract(-3);
		assertEquals(test.getTotal(), -3);
		test.subtract(-3);
		assertEquals(test.getTotal(), 0);
		test.subtract(-5);
		assertEquals(test.getTotal(), 5);
		
	}

	@Test
	public void testMultiply() 
	{
		
		Calculator test = new Calculator();
		
		//when multiplying the newly created constructor because the default total is 0 
		//no matter the value it will always return 0
		test.multiply(4);
		assertEquals(test.getTotal(), 0);
		
		//testing after values are assigned to the total
		test.add(2);
		test.multiply(3);
		assertEquals(test.getTotal(), 6);
		test.multiply(6);
		assertEquals(test.getTotal(), 36);
		
		//test for multiplying negative number (sets total either negative OR positive)
		test.multiply(-1);
		assertEquals(test.getTotal(), -36);
		test.multiply(-3);
		assertEquals(test.getTotal(), 108);
		
		//test for multiplying with 0 (sets the total 0)
		test.multiply(0);
		assertEquals(test.getTotal(), 0);
		
	}

	@Test
	public void testDivide()
	{
		
		Calculator test = new Calculator();
		
		//just like multiply divide method will return 0 unless values are added
		test.divide(3);
		assertEquals(test.getTotal(), 0);
		
		//assign values to make it function correctly
		test.add(6);
		test.divide(2);
		assertEquals(test.getTotal(), 3);
		test.add(9);
		test.divide(3);
		test.divide(2);
		assertEquals(test.getTotal(), 2);
		
		//test dividing with negative number (sets total negative)
		test.add(7);
		test.divide(-3);
		assertEquals(test.getTotal(), -3);
		test.divide(-1);
		assertEquals(test.getTotal(), 3);
		
		//test dividing with value 0, it's coded in a way that total value returned is 0
		test.divide(0);
		assertEquals(test.getTotal(), 0);
		
		
	}

	@Test
	public void testGetHistory() {
		
		fail("Not yet implemented");
	}

}
