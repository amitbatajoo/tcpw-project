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

import product.TPCW_execute_search;
import test.objects.MockHttpServletRequest;
import test.objects.MockHttpServletResponse;

public class TPCW_execute_searchTest {

	static MockHttpServletRequest req;
	static MockHttpServletResponse res;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		req = new MockHttpServletRequest();
		res = new MockHttpServletResponse();
		req.setParameter("C_ID", "2");
		req.setParameter("SHOPPING_ID", "3");
		req.setParameter("Author", "I");
		req.setParameter("search_string", "I");
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
		TPCW_execute_search object = new TPCW_execute_search();
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
