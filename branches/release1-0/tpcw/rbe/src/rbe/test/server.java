package rbe.test;

import org.eclipse.jetty.server.Server;

public class server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server(8085);
        server.setHandler(new jettyServlet());
 
        try {
			server.start();
	        server.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
