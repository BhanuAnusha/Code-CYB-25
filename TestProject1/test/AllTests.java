package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AddTestTest.class, DivideTestTest.class, MultiplyTestTest.class, SubtractTestTest.class })

public class AllTests {

}
