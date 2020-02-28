package ysg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FullName extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		String a=req.getParameter("fn");
		String b=req.getParameter("ln");
		RequestDispatcher rd=req.getRequestDispatcher("servlet2");
		rd.forward(req, res);
		PrintWriter out=res.getWriter();
		out.print("FullName is  "+(a+b));
	}
}
