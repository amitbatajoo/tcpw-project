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

import product.BuyConfirmResult;
import product.TPCW_admin_request_servlet;
import product.TPCW_buy_confirm_servlet;
import test.objects.MockHttpServletRequest;
import test.objects.MockHttpServletResponse;

public class TPCW_buy_confirm_servletTest {

	static MockHttpServletRequest req;
	static MockHttpServletResponse res;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*
		 *  String SHOPPING_IDstr = req.getParameter("SHOPPING_ID");
			String C_IDstr = req.getParameter("C_ID");
			String CC_TYPE = req.getParameter("CC_TYPE");
	      	String CC_NUMBERstr = req.getParameter("CC_NUMBER");
	      	String CC_NAME = req.getParameter("CC_NAME");
	      	String CC_EXPIRYstr = req.getParameter("CC_EXPIRY");
	      	String SHIPPING = req.getParameter("SHIPPING");
	      	String STREET_1 = req.getParameter("STREET_1");
		  	String STREET_2 = req.getParameter("STREET_2");
		  	String CITY = req.getParameter("CITY");
		  	String STATE = req.getParameter("STATE");
		  	String ZIP = req.getParameter("ZIP");
		  	String COUNTRY = req.getParameter("COUNTRY");
		 */
		req = new MockHttpServletRequest();
		res = new MockHttpServletResponse();
		req.setParameter("SHOPPING_ID", "1");
		req.setParameter("C_ID", "1");
		req.setParameter("CC_TYPE", "Type");
		req.setParameter("CC_NUMBER", "CCNumber");
		req.setParameter("CC_NAME", "CCName");
		req.setParameter("CC_EXPIRY", "1/1/2011");
		req.setParameter("SHIPPING", "1");
		req.setParameter("STREET_1", "123 My Road");
		req.setParameter("STREET_2", "Other Street");
		req.setParameter("City", "My City");
		req.setParameter("STATE", "ST");
		req.setParameter("ZIP", "11111");
		req.setParameter("COUNTRY", "My Country");
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
		TPCW_buy_confirm_servlet object = new TPCW_buy_confirm_servlet();
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
