/**
 * 
 */
package testRecap;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mbenb_000
 *
 */
public class SubtractorTest {

	@Test
	public void test() {
		
		int input1 = 7;
		int input2 = 8;
		int expectedOutPut = -1;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutPut = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	
	@Test
	public void test2() {
		
		int input1 = 7;
		int input2 = 8;
		int expectedOutPut = -4;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutPut = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	
	@Test
	public void test3() {
		
		int input1 = 12;
		int input2 = 4;
		int expectedOutPut = 8;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutPut = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
		
	}
	@Test
	public void test4() {
		int input1 = 25;
		int input2 = 5;
		int expectedOutPut = 22;
		
		Subtractor subObj = new Subtractor();
		
		int actualOutPut = subObj.subtract(input1, input2);
		
		assertEquals("Wrong answer!", expectedOutPut, actualOutPut);
	}

}
