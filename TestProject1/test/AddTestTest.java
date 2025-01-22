package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTestTest {
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
	void testAddAB() {
		int result = test.add(3,4);
		assertEquals(7, result);
	}

}
