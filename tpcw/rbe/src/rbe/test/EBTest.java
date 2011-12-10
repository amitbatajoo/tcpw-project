package rbe.test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jetty.server.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import rbe.*;

public class EBTest {
	Server server;
	
	public static void setUpBeforeClass() throws Exception {
		Server server = new Server(8085);
        server.setHandler(new jettyServlet());
 
        server.start();
        server.join();
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
	public void testGetHTML() {
		RBE item = new RBE();
		int[][] transitions = {{1,1,1},{1,1,1}};
		EB eb = new EB(item, transitions, null, -1, "name");
		try {
			eb.getHTML(new URL("localhost:8085"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(eb.html,"Test Success");
	}

}
