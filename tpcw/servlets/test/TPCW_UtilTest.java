package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import product.TPCW_Util;

public class TPCW_UtilTest {

	int d;
	int n;
	int i;
	int min;
	int max;
	
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
	public void testDigSyl(int d) {
		TPCW_Util util = new TPCW_Util();
		assertNotSame("", util.DigSyl(d));
	}
	
	@Test
	public void testDigSyl(int d, int n) {
		TPCW_Util util = new TPCW_Util();
		assertNotSame("", util.DigSyl(d, n));
	}
	
	@Test
	public void testGetRandom(int i) {
		TPCW_Util util = new TPCW_Util();
		assertNotNull(util.getRandom(i));
	}
	
	@Test
	public void testGetRandomI_ID() {
		TPCW_Util util = new TPCW_Util();
		assertNotNull(util.getRandomI_ID());
	}
	
	@Test
	public void testGetRandomString(int min, int max) {
		TPCW_Util util = new TPCW_Util();
		assertNotSame("", util.getRandomString(min, max));
	}

}
