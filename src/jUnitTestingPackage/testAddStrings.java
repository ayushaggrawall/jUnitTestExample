package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting junitString=new jUnitTesting();
		String result=junitString.addStrings("Lab", "Assignment");
		assertEquals("LabAssignment",result);
	}

}
