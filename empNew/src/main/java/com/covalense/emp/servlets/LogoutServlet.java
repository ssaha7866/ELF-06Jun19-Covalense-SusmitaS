package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession httpSession=req.getSession(false);
		if(httpSession!=null) {
		httpSession.invalidate();
		}
			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">                                                                                              ");
			out.print(" <head>  ");
			out.print(" </head>                                                                                                       ");
			out.print(" <body>  ");
			out.print("<h4><span style=\"color:red; position: absolute; margin-left: 43%; margin-top: 142px;\">Successfully Logged Out!!!</span></h4> ");
			req.getRequestDispatcher("EMPloginPage.html").include(req, resp);
			out.print(" </body>  ");
			out.print(" </html>  ");
	}

}
