import java.io.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws Execption{
		res.setContentType("tex/html");
		PrintWriter pw=res.getWriter();
		pw.println("Welcome to Servlet!");
		pw.close();
	}
}
	