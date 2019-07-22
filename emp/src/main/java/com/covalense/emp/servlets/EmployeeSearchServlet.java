 package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;



@SuppressWarnings("serial")


@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		

		String idValue=req.getParameter("id");
		
		//Interact with db and get employee info
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean=dao.getEmployeeinfo(idValue);
		
		//
		PrintWriter out= resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">EMPLOYEE NOT FOUND</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
		else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:blue\">EMPLOYEE FOUND...</span></H1>");
			out.print("<BR>");
			out.print("<BR> ID " + bean.getEmployeeId());
			out.print("<BR> NAME " + bean.getEmployeeName());
			out.print("<BR> AGE " + bean.getAge());
			out.print("<BR> GENDER " + bean.getGender());
			out.print("<BR> SALARY " + bean.getSalary());
			out.print("<BR> PHONE " + bean.getPhone());
			out.print("<BR> JOINING_DATE " + bean.getJoiningDate());
			out.print("<BR> ACCOUNT_NO " + bean.getAccountNumber());
			out.print("<BR> EMAIL " + bean.getEmail());
			out.print("<BR> DESIGNATION " + bean.getDesignation());
			out.print("<BR> DOB " + bean.getDob());
			out.print("<BR> DEPT_ID " + bean.getDepartmentId());
			out.print("<BR> MANAGER_ID " + bean.getManagerId());
			out.print("<BR> PASSWORD " + bean.getPassword());
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
	}//End of doGet()
	

}//end of class
