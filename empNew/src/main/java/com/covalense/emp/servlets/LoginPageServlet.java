package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		Cookie dummyCookie = new Cookie("dummyCookie", "CheckCookieEnabled");
		resp.addCookie(dummyCookie);
		
		
		
		// validation
		HttpSession httpSession = req.getSession(false);
		if (httpSession == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Invalid LogIn  !!!  Please LogIn Again..</span></H1>");
			out.print("<BR><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			int empId = Integer.parseInt(req.getParameter("employeeId"));

			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeinfo(empId);
			if (bean != null) {
				req.setAttribute("bean", bean);
			}
			req.getRequestDispatcher("./login").include(req, resp);
		}
	}
}
