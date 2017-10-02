package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting junit=new jUnitTesting();
		int result=junit.addNumbers(10, 20);
		assertEquals(30, result);
	}

}
