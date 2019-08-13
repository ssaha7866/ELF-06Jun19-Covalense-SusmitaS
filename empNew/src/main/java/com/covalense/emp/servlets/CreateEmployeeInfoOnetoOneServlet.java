package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createemployeeinfoonetoone")
public class CreateEmployeeInfoOnetoOneServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EmployeeInfoBean bean = new EmployeeInfoBean();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

	bean.setEmployeeId(Integer.parseInt(req.getParameter("id")));
	bean.setEmployeeName(req.getParameter("name"));
	bean.setEmail(req.getParameter("email"));
	bean.setAge(Integer.parseInt(req.getParameter("age")));
	bean.setPhone(Long.parseLong(req.getParameter("phone")));
	bean.setAccountNumber(Long.parseLong(req.getParameter("accountNo")));
	bean.setDesignation(req.getParameter("designation"));
	bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentId")));
	bean.setManagerId(Integer.parseInt(req.getParameter("managerId")));
	bean.setGender(req.getParameter("gender"));
	bean.setPassword(req.getParameter("password"));
	bean.setSalary(Double.parseDouble(req.getParameter("salary")));
	try {
	bean.setJoiningDate(format.parse(req.getParameter("joiningDate")));
	bean.setDob(format.parse(req.getParameter("dob")));
	} catch (ParseException e) {
	e.printStackTrace();
	}

	EmployeeOtherInfoBean empOtherInf= new EmployeeOtherInfoBean();


	
	empOtherInf.setPanNo(req.getParameter("pancard"));
	empOtherInf.setMarried(Boolean.parseBoolean(req.getParameter("mstatus")));
	empOtherInf.setBloodgroup(req.getParameter("bloodgroup"));
	empOtherInf.setIschallenged(Boolean.parseBoolean(req.getParameter("phstatus")));
	empOtherInf.setEmergencyNumber(Integer.parseInt(req.getParameter("ecnNo")));
	empOtherInf.setEmergencyContactName(req.getParameter("ecnNm"));
	empOtherInf.setNationality(req.getParameter("nationality"));
	empOtherInf.setReligion(req.getParameter("religion"));
	empOtherInf.setFatherName(req.getParameter("fatherNm"));
	empOtherInf.setMotherName(req.getParameter("motherNm"));
	empOtherInf.setSpouseName(req.getParameter("spouse"));
	empOtherInf.setPassportNo(req.getParameter("passportNo"));
	empOtherInf.setAdhaarNo(Long.parseLong(req.getParameter("aadhar")));

	empOtherInf.setEmployeeInfoBean(bean);

	// Interact with DB & get the Employee info
	EmployeeDAO dao = EmployeeDAOFactory.getInstance();
	//PrintWriter out = resp.getWriter();
	RequestDispatcher dispatcher= null;
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();

	if (dao.createEmployeeInfo(bean)) {
	//String url= "empinfo.html?msg=Employee Successfully created";
	out.print("<h1><span style=\"color:Green\">" + "Record Successfully Inserted!!!!!! " + "</span>" + "</h1>");
	dispatcher= req.getRequestDispatcher("empinfo.html");
	dispatcher.include(req, resp);
	} else {
	//String url= "empinfo.html?msg=Somthing went wrong again fill form and submit it!!";
	out.print("<h1><span style=\"color:Red\">" + "Somthing went worng try again!!!!!! " + "</span>" + "</h1>");
	dispatcher= req.getRequestDispatcher("empinfo.html");
	dispatcher.include(req, resp);
	}
	}// end of doGet
	}// end of class
	

