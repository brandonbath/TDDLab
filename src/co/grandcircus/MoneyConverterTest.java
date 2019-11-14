package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MoneyConverterTest {
		 

	
	@Test
	void testNum1() {
		assertEquals("one dollars", MoneyConverter.numToWord2(1));
	}
	
	@Test
	void testNum2() {
		assertEquals("two dollars", MoneyConverter.numToWord2(2));
	}
	
	@Test
	void testNum10() {
		assertEquals("ten dollars", MoneyConverter.numToWord2(10));
	}
	
	@Test
	void testNum11() {
		assertEquals("eleven dollars", MoneyConverter.numToWord2(11));
	}
	
	@Test
	void testNum20() {
		assertEquals("twenty dollars", MoneyConverter.numToWord2(20));
	}
	
	@Test
	void testNum21() {
		assertEquals("twenty one dollars", MoneyConverter.numToWord2(21));
	}
	
	@Test
	void testNum100() {
		assertEquals("One hundred dollars", MoneyConverter.numToWord2(100));
	}
	
	
	
	@Test
	void testNum121() {
		assertEquals("One hundred and twenty one dollars", MoneyConverter.numToWord2(121));
	}
	
	@Test
	void testNum120() {
		assertEquals("One hundred and twenty dollars", MoneyConverter.numToWord2(120));
	}
	
	@Test
	void testNum759() {
		assertEquals("Seven hundred and fifty nine dollars", MoneyConverter.numToWord2(759));
	}

	@Test
	void testNum105() {
		assertEquals("One hundred and five dollars", MoneyConverter.numToWord2(105));
	}
	
	@Test
	void testNum110() {
		assertEquals("One hundred and ten dollars", MoneyConverter.numToWord2(110));
	}
	
	@Test
	void testNum111() {
		assertEquals("One hundred and eleven dollars", MoneyConverter.numToWord2(111));
	}
	// convert 745.00 $ (amount in numbers)
		// seven hundred and forty-five dollars (amount in words)
	
//	@Test
//	void testHelloWorld() {
//		// the assertEquals() has parameters -- 1st param is what we are expecting
//		// the method to return. The 2nd param is what is actually being returned
//		// (this will require us to call methods from the class we're testing
//		assertEquals("Hello World!", TempConverter.sayHello());
//	}

//	@Test
//	void test32() {
//		assertEquals(0, tempTester.convertTemp("c", 32));
//	}
	
	
}
