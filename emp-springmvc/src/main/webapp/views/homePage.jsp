<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E M P</title>                                                                                      
			 <script src="//code.jquery.com/jquery-1.10.2.js\"></script>                                               
			 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
			 <link rel="stylesheet"href="homestyle.css">   
</head>
<body>
<body style="background-image: url("employee-background-screening-1-800x533.jpg");">  
			
				<nav class="navbar navbar-expand-lg ">																																							
			 <div class="collapse navbar-collapse" id="navbarSupportedContent">                                                                                                                               
			  <ul class="navbar-nav mr-auto">                                                                                                                                                                   
			  </ul>                                                                                                                                                                                               
			  <form class="form-inline" action ="http://localhost/emp-springmvc/login/validate/search" method="get">                                                                                                                                                       
			    <input class="form-control" name="employeeId" type="search" placeholder="Search" aria-label="Search">
			    <!-- <input hidden type="text" name="url" value="search"> -->                                                                                   
			                                                                                                                                                                                                      
			    <button class="btn btn-outline-success" type="submit">Search</button>                                                                                                                         
			  </form>                                                                                                                                                                                             
			  <a class="navbar-brand" href="./validate?url=logout">Log Out</a> 
			  <a class="navbar-brand" href="./updateEmployee">Edit</a>                                                                                                                                                         
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> 
			    <span class="navbar-toggler-icon"></span>                                                                                                                                                            
			  </button>                                                                                                                                                                                             
				</div>                                                                                                                                                                                                
				</nav>                                                                                                                                                                    
			<h1> ${msg2}</h1>
			<h1> ${msg3}</h1>
			    <div id="header"></div>                                                                               
			    <div class="card" style="width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;">
			    <div class="card-header">Employee Details</div>                                                     
			    <div class="card-body"   style="padding:2.25rem;">                                                
			             <h6 class="card-subtitle mb-2 text-muted">Name :${bean.getEmployeeName()}</h6><br>                                 
			            <h6 class="card-subtitle mb-2 text-muted">Email  :${bean.getEmail()}</h6><br>                                      
			            <h6 class="card-subtitle mb-2 text-muted">Phone no:${bean.getPhone()}</h6><br>                                     
			            <h6 class="card-subtitle mb-2 text-muted">EmpId:${bean.getEmail()}</h6><br>                                        
			            <h6 class="card-subtitle mb-2 text-muted">Age :${bean.getAge()}</h6><br>                                          
			            <h6 class="card-subtitle mb-2 text-muted">Designation :${bean.getDesignation()}</h6>                               
			           </div>                                                                                              
			         </div>   
</body>
</html>