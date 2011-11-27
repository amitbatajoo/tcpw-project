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
import product.TPCW_buy_request_servlet;
import test.objects.MockHttpServletRequest;
import test.objects.MockHttpServletResponse;

public class TPCW_buy_request_servletTest {

	static MockHttpServletRequest req;
	static MockHttpServletResponse res;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*
		 *  
		 *  String UNAME = req.getParameter("UNAME");
	  		String PASSWD = req.getParameter("PASSWD");
		 *  
		 *  cust.c_fname = req.getParameter("FNAME");
	  		cust.c_lname = req.getParameter("LNAME");
	  		cust.addr_street1 = req.getParameter("STREET1");
	  		cust.addr_street2 = req.getParameter("STREET2");
	  		cust.addr_city = req.getParameter("CITY");
	  		cust.addr_state = req.getParameter("STATE");
	  		cust.addr_zip = req.getParameter("ZIP");
	  		cust.co_name = req.getParameter("COUNTRY");
	  		cust.c_phone = req.getParameter("PHONE");
	  		cust.c_email = req.getParameter("EMAIL");
		 */
		
		req = new MockHttpServletRequest();
		res = new MockHttpServletResponse();
		req.setParameter("C_ID", "2");
		req.setParameter("SHOPPING_ID", "3");
		req.setParameter("RETURNING_FLAG", "3");
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
		TPCW_buy_request_servlet object = new TPCW_buy_request_servlet();
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
