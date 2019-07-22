package com.covalense.emp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LogInServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		
		RequestDispatcher dispatcher=this.getServletContext().getRequestDispatcher("/emp/src/main/webapp/EMP login Page.html");
		dispatcher.forward(request, response);
		
		String idValue=request.getParameter("id");
		String passwordValue=request.getParameter("password");
		
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean1=dao.getEmployeeinfo(idValue);
		EmployeeInfoBean bean2=dao.getEmployeeinfo(passwordValue);
		
		if(bean1==null) {
		
		}
	}
}
