package rbe.test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import org.eclipse.jetty.server.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import rbe.*;
import rbe.args.ArgDB;

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
		EBTestFactory factory = new EBTestFactory();
		int[][] transitions = {{1,1,1},{1,1,1}};
		Vector ebs = new Vector(0);
		ArgDB db = new ArgDB();
		EBFactoryArg ebfArg =
			      new EBFactoryArg("-EB", "EB Factory",
					       "% Factory class used to create EBs.  " + 
					       "<class> <#> <factory args...>.", 
					       item, ebs, db);
		EB eb = factory.getEB(item);
		try {
			eb.getHTML(new URL("http://localhost:8085"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean value = (eb.html).contains("Test Success");
		assertEquals(true,value);
	}

}
