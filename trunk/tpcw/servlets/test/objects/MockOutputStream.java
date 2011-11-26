package test.objects;

import java.io.IOException;
import java.io.OutputStream;

public class MockOutputStream extends OutputStream {

	String value  = "";

	  public void write(String arg0){
	    value += arg0;
	  }

	  public String getString() {
	    return value;
	  }

	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		value += b;
	}

}
