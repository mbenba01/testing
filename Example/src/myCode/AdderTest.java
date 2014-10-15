/**
 * 
 */
package myCode;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

/**
 * @author mbenb_000
 *
 */
public class AdderTest {

	private int expected;
	
	@Before
	public void setUp() throws Exception {
		expected = 1;
	}


	@Test
	public void testWithSetUp() {
		int input1 = 6;
		int input2 = 7;
		int expectedOutput = expected;
		
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
		
	}

	
	@Test
	public void test() {
		//fail("Not yet implemented");
		int input1 = 3;
		int input2 = 5;
		int expectedOutput = 8;
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test2() {
		int input1 = 7;
		int input2 = 3;
		int expectedOutput = 10;
		
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test3() {
		int input1 = 6;
		int input2 = 6;
		int expectedOutput = 12;
		
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test4() {
		int input1 = 3;
		int input2 = 2;
		int expectedOutput = 5;
		
		Adder addObj = new Adder();
		int actualOutput = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
}


