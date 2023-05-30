import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
		
	}public void testSubstract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
		
	}public void testMultiple() {
		int a = 3333;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 6666;
		assertEquals(actual, expected);
		}
	
	public void testDivide() {
	int a = 3000;
	int b = 2;
	
	Calculator cal = new Calculator();
	int actual = cal.divide(a, b);
	
	int expected = 1500;
	assertEquals(actual, expected);
	
}
	

}
