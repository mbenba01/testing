package myCode;


import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

import org.junit.BeforeClass;

public class DividerTest {
	
	private int expected;
	private static int firstInput;
	
	
	@Before
	public void setUp() throws Exception {
		expected = 1;
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		firstInput = 5;
	}
	
	
	
	@Test
	public void test1() {
		int input1 = 8;
		int input2 = 5;
		int expectedOuput = input1 / input2;
		
		Divider divObj = new Divider();
		
		int actualOutput = divObj.divide(input1, input2);
		
		assertEquals("Wrong answer!", expectedOuput, actualOutput);
	}
	
	@Test
	public void testWithSetUp() {
		int input1 = 8;
		int input2 = 5;
		int expectedOuput = expected;
		
		Divider divObj = new Divider();
		
		int actualOutput = divObj.divide(input1, input2);
		
		assertEquals("Wrong answer!", expectedOuput, actualOutput);
	}
	
	@Test
	public void testWithSetUpBeforeClass() {
		int input1 = firstInput;
		int input2 = 5;
		int expectedOuput = input1 / input2;
		
		Divider divObj = new Divider();
		
		int actualOutput = divObj.divide(input1, input2);
		
		assertEquals("Wrong answer!", expectedOuput, actualOutput);
	}

}
