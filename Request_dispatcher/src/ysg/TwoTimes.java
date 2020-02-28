package ysg;

import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwoTimes extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("Hello India");
	}
}
