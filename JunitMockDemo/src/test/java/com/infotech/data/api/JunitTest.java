/**
 * 
 */
package com.infotech.data.api;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ravi
 *
 */
public class JunitTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Before class method..");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("After class method..");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Setup method..");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		System.out.println("After method..");
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
	}
	
	@Test
	public void test3() {
		
	}

}
