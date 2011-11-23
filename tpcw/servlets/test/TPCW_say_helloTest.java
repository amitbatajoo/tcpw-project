package test;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import product.TPCW_say_hello;

public class TPCW_say_helloTest {

	HttpSession session;
	HttpServletRequest req;
	java.io.PrintWriter out;
	
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
	public void test() {
		TPCW_say_hello sup = new TPCW_say_hello();
		assertNotNull(out);
	}

}
