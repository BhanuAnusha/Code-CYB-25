package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubtractTestTest {
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
	void testSubtractAB() {
		int result = test.subtract(4,3);
		assertEquals(1, result);
	}

}
