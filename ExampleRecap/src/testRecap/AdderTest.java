package testRecap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdderTest {
	
	private int expected;
	private static int firstInput;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
			firstInput = 7;
	
	}
	
	@Test
	public void testWithSetUpBeforeClass() {
		
		int input1 = firstInput;
		int input2 = 5;
		int expectedOutPut = 12;
		
		Adder addObj = new Adder() ;
		
		int actualOutPut = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	
	@Before
	public void setUp() throws Exception {
		expected = 8;
	}
	
	@Test
	public void testWithSetUp() {
		
		int input1 = 3;
		int input2 = 5;
		int expectedOutPut = expected;
		
		Adder addObj = new Adder();
		
		int actualOutPut = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	public void tearDown() throws Exception {
		firstInput = 4;
	}
	
	
	@Test
	public void testWithTearDown() {
		
		int input1 = firstInput;
		int input2 = 5;
		int expectedOutPut = 12;
		
		Adder addObj = new Adder();
		
		int actualOutPut = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);

	}
	@Test
	public void test3() {
		
		int input1 = 4;
		int input2 = 5;
		int expectedOutPut = 9;
		
		Adder addObj = new Adder();
		
		int actualOutPut = addObj.add(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	@Test
	public void test4() {
		
		int input1 = 4;
		int input2 = 3;
		int expectedOutPut = 9;
		
		Adder addObj = new Adder();
		
		int actualOutPut = addObj.add(input1, input2);
		
		//assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		assertTrue("Wrong answer!", expectedOutPut == actualOutPut);
	}

}
