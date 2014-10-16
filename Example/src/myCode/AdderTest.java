/**
 * 
 */
package myCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author mbenb_000
 *
 */
public class AdderTest {

	private int expected;
	private static int firstInput;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			firstInput = 1;
	}
	
	@Before
	public void setUp() throws Exception {
		expected = 1;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("All tests have executed ");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("test executed");
	}
	
	@Test
	public void testWithSetUpBeforeClass() {
		int input1 = firstInput;
		int input2 = 5;
		int expectedOutput = input1 + input2;
		
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}

	@Test
	public void testWithSetUp() {
		int input1 = 8;
		int input2 = 7;
		int expectedOutput = expected;
		
		//boolean expectedOutput1 = false;
		
		Adder addObj = new Adder();
		
		int actualOutput = addObj.add(input1, input2);
		
		//assertTrue(true);
		//assertEquals("Wrong answer!", expectedOutput, actualOutput);
		//fail("test failed");
		//assertNotNull("Null", addObj);
		assertNotSame("Wrong, wrong!", expectedOutput, actualOutput);
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


