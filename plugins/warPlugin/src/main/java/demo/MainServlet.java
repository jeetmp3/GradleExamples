package demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MainServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		request.setAttribute("NAME", name);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
