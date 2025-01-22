package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideTestTest {
	private MathUtils test;

	@BeforeEach
	void setUp() throws Exception {
		test = new MathUtils();
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void testDivideAB() {
		double result = test.divide(4,0);
		assertEquals(-1.0, result);
	}

}
