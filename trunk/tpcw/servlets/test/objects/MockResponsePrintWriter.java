package test.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class MockResponsePrintWriter extends PrintWriter {

	static String responseContent;
		
	public MockResponsePrintWriter(Writer out) {
		super(out);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(OutputStream out) {
		super(out);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(String fileName)
			throws FileNotFoundException {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(Writer out, boolean autoFlush) {
		super(out, autoFlush);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(OutputStream out, boolean autoFlush) {
		super(out, autoFlush);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(String fileName, String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(fileName, csn);
		// TODO Auto-generated constructor stub
	}

	public MockResponsePrintWriter(File file, String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(file, csn);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public void print(String arg0)
	{
		if(responseContent == null)
			responseContent = "";
		responseContent += arg0;
	}
	
	public static String getResponseContent()
	{
		return responseContent;
	}

}
