package test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import product.TPCW_admin_request_servlet;
import product.TPCW_promotional_processing;

public class TPCW_promotional_processingTest {

	java.io.PrintWriter out;
	HttpServletRequest req;
	HttpServletResponse res;
	int new_sid;
	
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
		TPCW_promotional_processing object = new TPCW_promotional_processing();
		object.DisplayPromotions(out, req, res, new_sid);
		assertNotNull(res);
	}

}
