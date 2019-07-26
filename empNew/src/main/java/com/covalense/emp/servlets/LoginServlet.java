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

@SuppressWarnings("serial")
@WebServlet("/login")
/*
 * servlet- creating the employee records, and displaying data to html page
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if(req.getCookies()==null) {
			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">                                                                                              ");
			out.print(" <head>  ");
			out.print(" </head>                                                                                                       ");
			out.print(" <body>  ");
			out.print("<h4><span style=\"color:red; position: absolute; margin-left: 43%; margin-top: 142px;\">Cookiers are disabled!!!</span></h4> ");
			req.getRequestDispatcher("EMPloginPage.html").include(req, resp);
			out.print(" </body>  ");
			out.print(" </html>  ");
		}else {
		
		
		int empId = Integer.parseInt(req.getParameter("employeeId"));
		String empPassword = req.getParameter("password");
		
		// interact with db
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeinfo(empId);
		if (empId==bean.getEmployeeId() && empPassword.equals(bean.getPassword())) {
			
			//Valid Credentials; Create a session
			HttpSession httpSession=req.getSession(true);

			
			//set cookies for persistance
			Cookie sessionCookie= new Cookie("JSESSIONID", httpSession.getId());
			sessionCookie.setMaxAge(7*24*60*60);
			
			
			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">                                                                                              ");
			out.print(" <head>                                                                                                        ");
			out.print(" <meta charset=\"UTF-8\">                                                                                    ");
			out.print(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                                    ");;
			out.print(" <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">                                                     ");
			out.print(" <title>E M P</title>                                                                                      ");
			out.print(" <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>                                                ");
			out.print(" <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"    ");
			out.print(" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
			out.print( "  <link rel=\"stylesheet\" type=\"text/css\" href=\"homestyle.css\">       ");   
			out.print(" </head>                                                                                                       ");
			out.print(" <body>  ");
			
			out.print("	<nav class=\"navbar navbar-expand-lg \">																																									");
			out.print(" <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">                                                                                                                                     " );
			out.print("  <ul class=\"navbar-nav mr-auto\">                                                                                                                                                                        ");
			out.print("  </ul>                                                                                                                                                                                                 " );
			out.print("  <form class=\"form-inline\" name=\"/search\">                                                                                                                                                                            " );
			out.print("    <input class=\"form-control\" name=\"employeeId\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">                                                                                              ");
			out.print("                                                                                                                                                                                                         ");
			out.print("    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>                                                                                                                                ");
			out.print("  </form>                                                                                                                                                                                                ");
			out.print("  <a class=\"navbar-brand\" href=\"./logout\">Log Out</a>                                                                                                                                                           ");
			out.print("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> ");
			out.print("    <span class=\"navbar-toggler-icon\"></span>                                                                                                                                                            ");
			out.print("  </button>                                                                                                                                                                                              ");
			out.print("	</div>                                                                                                                                                                                                 " );
			out.print("	</nav>                                                                   " );                                                                                                    
			
			out.print("   <div id=\"sidebar\"></div>                                                                                    ");
			out.print("    <div id=\"header\"></div>                                                                               ");
			out.print("    <div class=\"card \" style=\"width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">  ");
			out.print("    <div class=\"card-header\">Employee Details</div>                                                     ");
			out.print("    <div class=\"card-body\"     style=\"padding:2.25rem;\">                                                ");
			out.print("  <h6 class=\"card-subtitle mb-2 text-muted\">Name :"+bean.getEmployeeId()+"</h6><br>                                         ");
			out.print("             <h6 class=\"card-subtitle mb-2 text-muted\">Name :"+bean.getEmployeeName()+"</h6><br>                                         ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Email  :"+bean.getEmail()+"</h6><br>                                        ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Phone no:"+bean.getPhone()+"</h6><br>                                       ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">EmpId:"+bean.getEmail()+"</h6><br>                                          ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Age :"+ bean.getAge()+"</h6><br>                                           ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Designation :"+bean.getDesignation()+"</h6>                                       ");
			out.print("           </div>                                                                                              ");
			out.print("         </div>                                                                                                ");
			out.print("                                                                                                               ");
			out.print(" </body>                                                                                                       ");
			out.print(" </html>                                                                                                       ");
		} else {

			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">                                                                                              ");
			out.print(" <head>  ");
			out.print(" </head>                                                                                                       ");
			out.print(" <body>  ");
			out.print("<h4><span style=\"color:red; position: absolute; margin-left: 43%; margin-top: 142px;\">Invalid credentials!!!</span></h4> ");
			req.getRequestDispatcher("EMPloginPage.html").include(req, resp);
			out.print(" </body>  ");
			out.print(" </html>  ");
		}

	}
	}
	//doGet for search employee details
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//validation
		HttpSession httpSession=req.getSession(false);
		if(httpSession==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Invalid LogIn  !!!  Please LogIn Again..</span></H1>");
			out.print("<BR><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		else {
		int empId = Integer.parseInt(req.getParameter("employeeId"));
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeinfo(empId);
		out.print(" <!DOCTYPE html>    ");
		out.print(" <html lang=\"en\">                                                                                              ");
		out.print(" <head>                                                                                                        ");
		out.print(" <meta charset=\"UTF-8\">                                                                                    ");
		out.print(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                                    ");;
		out.print(" <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">                                                     ");
		out.print(" <title>E M P</title>                                                                                      ");
		out.print(" <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>                                                ");
		out.print(" <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"    ");
		out.print(" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
		out.print( "  <link rel=\"stylesheet\" type=\"text/css\" href=\"homestyle.css\">       ");   
		out.print(" </head>                                                                                                       ");
		out.print(" <body >  ");
		
		out.print("	<nav class=\"navbar navbar-expand-lg \">																																									");
		out.print(" <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">                                                                                                                                     " );
		out.print("  <ul class=\"navbar-nav mr-auto\">                                                                                                                                                                        ");
		out.print("  </ul>                                                                                                                                                                                                 " );
		out.print("  <form class=\"form-inline\" name=\"/search\">                                                                                                                                                                            " );
		out.print("    <input class=\"form-control\" name=\"employeeId\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">                                                                                              ");
		out.print("                                                                                                                                                                                                         ");
		out.print("    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>                                                                                                                                ");
		out.print("  </form>                                                                                                                                                                                                ");
		out.print("  <a class=\"navbar-brand\" href=\"./logout\">Log Out</a>                                                                                                                                                           ");
		out.print("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> ");
		out.print("    <span class=\"navbar-toggler-icon\"></span>                                                                                                                                                            ");
		out.print("  </button>                                                                                                                                                                                              ");
		out.print("	</div>                                                                                                                                                                                                 " );
		out.print("	</nav>                                                                   " );                                                                                                    
		
		out.print("   <div id=\"sidebar\"></div>                                                                                    ");
		out.print("    <div id=\"header\"></div>                                                                               ");
		out.print("    <div class=\"card \" style=\"width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">  ");
		out.print("    <div class=\"card-header\">Employee Details</div>                                                     ");
		out.print("    <div class=\"card-body\"     style=\"padding:2.25rem;\">                                                ");
		out.print("             <h6 class=\"card-subtitle mb-2 text-muted\">Name :"+bean.getEmployeeName()+"</h6><br>                                         ");
		out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Email  :"+bean.getEmail()+"</h6><br>                                        ");
		out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Phone no:"+bean.getPhone()+"</h6><br>                                       ");
		out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">EmpId:"+bean.getEmail()+"</h6><br>                                          ");
		out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Age :"+ bean.getAge()+"</h6><br>                                           ");
		out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Designation :"+bean.getDesignation()+"</h6>                                       ");
		out.print("           </div>                                                                                              ");
		out.print("         </div>                                                                                                ");
		out.print("                                                                                                               ");
		out.print(" </body>                                                                                                       ");
		out.print(" </html> ");
		}
	}

}
