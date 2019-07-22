package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;


@SuppressWarnings("serial")
@WebServlet("/employeeInformation")
public class EmployeeInformationServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean=new EmployeeInfoBean();
		
		bean.setEmployeeId(Integer.parseInt(req.getParameter("employeeid")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
		bean.setEmployeeName(req.getParameter("name"));
		bean.setEmail(req.getParameter("email"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setGender(req.getParameter("gender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentnumber")));
		bean.setPhone(Long.parseLong(req.getParameter("phonenumber")));
		bean.setManagerId(Integer.parseInt(req.getParameter("managerid")));
		bean.setPassword(req.getParameter("password"));
		try {
			bean.setJoiningDate(format.parse(req.getParameter("doj")));
			bean.setDob(format.parse(req.getParameter("dob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		PrintWriter out= resp.getWriter();
		
		if(dao.createEmployeeInfo(bean)) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:blue\">EMPLOYEE REGISTRATION SUCCESSFULL...</span></H1>");
			out.print("<BR>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:blue\">EMPLOYEE REGISTRATION COULD NOT BE COMPLETED!!!</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
			
		}
	}//End of doGet()
}//end of class
