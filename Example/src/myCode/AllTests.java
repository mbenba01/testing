package myCode;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdderTest.class, DividerTest.class, DividerTestTest.class,
		SubtractorTest.class })
public class AllTests {

}
