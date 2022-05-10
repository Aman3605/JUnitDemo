package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.MyMath;

public class MyMathTest {
	
	//Create a object reference of a class to be Tested
	
	MyMath m;
	
	/*@Before annotation in JUnit is used on a method containing Java code to 
	 * run before each test case i.e it runs before each test case
	 */

	@Before
	public void setUp() throws Exception {
		m=new MyMath();
		
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum5Numbers() {
		System.out.println("Test with 5 Numbers");
		assertEquals(20,m.sum(new int[] {5,3,1,6,5}),0);
		
	}
	@Test
    public void testSum3Numbers() {
        System.out.println("Test with 3 Numbers");
        int s=m.sum(new int[] {5,3,2});
        assertEquals(10,s, 0);
    }

}