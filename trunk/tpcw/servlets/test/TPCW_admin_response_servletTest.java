package test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import product.TPCW_admin_response_servlet;
import test.objects.MockHttpServletRequest;
import test.objects.MockHttpServletResponse;

public class TPCW_admin_response_servletTest {
	
	static MockHttpServletRequest req;
	static MockHttpServletResponse res;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		req = new MockHttpServletRequest();
		res = new MockHttpServletResponse();
		
		req.setParameter("I_ID", "1");
		req.setParameter("I_NEW_IMAGE", "NewImage");
		req.setParameter("I_NEW_THUMBNAIL", "NewThumbnail");
		req.setParameter("I_NEW_COST", "NewCost");
		req.setParameter("C_ID", "2");
		req.setParameter("SHOPPING_ID", "1");
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
		TPCW_admin_response_servlet object = new TPCW_admin_response_servlet();
		try {
			object.doGet(req, res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(res.getContent());
	}

}
