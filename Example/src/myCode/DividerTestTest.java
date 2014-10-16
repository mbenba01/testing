package myCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class DividerTestTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		boolean age = false;
		int myAge = 47;
		if(myAge == 45) {
			age = true;
		}
		assertTrue("Wrong answer!", age);
	}

}
