package myCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractorTest {
	
	@Test
	public void test1() {
		
		int input1 = 10;
		int input2 = 2;
		int expectedOutput = 8;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutput = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	
	}
	
	@Test
	public void test2() {
		
		int input1 = 11;
		int input2 = 5;
		int expectedOutput = 6;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutput = subObj.subtract(input1,  input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test3() {
		
		int input1 = 5;
		int input2 = 10;
		int expectedOutput = -5;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutput = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test4() {
		
		int input1 = 55;
		int input2 = 10;
		int expectedOutput = 45;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutput = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	
}
