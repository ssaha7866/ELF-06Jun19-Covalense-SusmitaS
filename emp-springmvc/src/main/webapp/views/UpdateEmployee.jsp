<%@page import="com.covalense.empmvc.dto.EmployeeExperienceInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.empmvc.dto.EmployeeEducationalInfoBean"%>
<%@page import="com.covalense.empmvc.dto.EmployeeAddInfoBean"%>
<%@page import="com.covalense.empmvc.dto.EmployeeOtherInfoBean"%>
<%@page import="com.covalense.empmvc.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<%
	EmployeeInfoBean infoBean = (EmployeeInfoBean) session.getAttribute("infoBean");
	EmployeeOtherInfoBean otherInfoBean = (EmployeeOtherInfoBean) session.getAttribute("otherInfoBean");
%>
<body>
	<form class="col-md-10 offset-1"
		style="background-color: rgb(141, 219, 250)"
		action="./updateEmployee" method="post">
		<h3 style="text-align: center; padding: 20px; color: blue">Employee
			Basic Information</h3>
		<hr>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4"> Employee Id</label> <input required
					type="text" class="form-control" name="employeeId"
					value="<%=infoBean.getEmployeeId()%>">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Account Number</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getAccountNumber()%>" name="accountNumber">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Name</label> <input type="text"
					class="form-control" value="<%=infoBean.getEmployeeName()%>"
					name="employeeName">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Email Id</label> <input type="email"
					class="form-control" value="<%=infoBean.getEmail()%>" name="email">
			</div>

		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Age</label><br> <input type="text"
					class="form-control" value="<%=infoBean.getAge()%>" name="age">

			</div>

			<div class="form-group col-md-6">

				<label for="inputPassword4">Designation</label> <input type="text"
					class="form-control" value="<%=infoBean.getDesignation()%>"
					name="designation">
			</div>



		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Gender</label><br> <select
					style="width: 640.75px; height: 39.99px;" name="gender">
					<%
						if (infoBean.getGender().equals("male")) {
					%>
					<option value="" disabled="disabled" selected="selected">Please
						select</option>
					<option value="Male">Male</option>
					<%
						} else {
					%>
					<option value="Female">Female</option>
					<%
						}
					%>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Birth</label> <input type="date"
					class="form-control" value="<%=infoBean.getDob()%>" name="dob">
			</div>

		</div>


		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Salary</label> <input type="text"
					class="form-control" value="<%=infoBean.getSalary()%>"
					name="salary">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Department ID</label> <input
					type="number" class="form-control"
					value="<%=infoBean.getDepartmentInfoBean().getDepartmentId()%>"
					name="departmentInfoBean.departmentId">


			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Phone Number</label> <input type="text"
					class="form-control" value="<%=infoBean.getPhone()%>" name="phone">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Manager ID</label> <input type="text"
					class="form-control" value="<%=infoBean.getManagerId()%>"
					name="managerId.employeeId">


			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputPassword4">Date Of Joining</label> <input
					type="date" class="form-control"
					value="<%=infoBean.getJoiningDate()%>" name="joiningDate">
			</div>

			<div class="form-group col-md-6">
				<label for="inputPassword4">Password</label> <input type="password"
					name="password" id="password" class="form-control"
					value="<%=infoBean.getPassword()%>">
			</div>
		</div>

		<hr style="border-color: darkblue;">

		<!-- ===============================================other info details=============================================================== -->

		<h3 style="text-align: center; padding: 20px; color: blue">Employee
			Other Information</h3>
		<hr>
		<div class="form-row">

			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Name</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyContactName()%>"
					name="employeeOtherInfoBean.emergencyContactName">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Mother Name</label> <input type="text"
					class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getMotherName()%>"
					name="employeeOtherInfoBean.motherName">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Pan Number</label> <input type="text"
					class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getPanNo()%>"
					name="employeeOtherInfoBean.panNo">
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Emergency Contact Number</label> <input
					type="text" class="form-control"
					value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyNumber()%>"
					name="employeeOtherInfoBean.emergencyNumber">
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Spouse Name</label> <input type="text"
					class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getSpouseName()%>"
					name="employeeOtherInfoBean.spouseName">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Married Status</label><br> <select
					style="width: 408.75px; height: 37.99px;"
					name="employeeOtherInfoBean.isMarried">
					<%
						if (infoBean.getEmployeeOtherInfoBean().isMarried()==true) {
					%>
					<option value="true">Married</option>
					<%
						} else {
					%>
					<option value="false">Single</option>
					<%}%>
				</select>

			</div>

			<div class="form-group col-md-4">

				<label for="inputPassword4">Nationality</label> <select
					style="width: 408.75px; height: 37.99px;"
					name="employeeOtherInfoBean.nationality">
					<%
						if (infoBean.getEmployeeOtherInfoBean().getNationality().equals("Indian")) {
					%>
					<option value="" disabled="disabled" selected="selected">Please
						select</option>
					<option value="Indian">Indian</option>
					<option value="true">Married</option>
					<%
						} else {
					%>
					<option value="Other">Other</option>
					<%}%>
				</select>
			</div>

			<div class="form-group col-md-4">
				<label for="inputAddress">Passport Number</label> <input type="text"
					class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getPassportNo()%>"
					name="employeeOtherInfoBean.passportNo">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Blood Group</label> <select
					style="width: 408.75px; height: 37.99px;"
					name="employeeOtherInfoBean.bloodgroup">
					<option value="" disabled="disabled" selected="selected">Please
						select</option>
					<%
						if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("A+")) {
					%>
					<option value="A+" selected="selected">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("B+")){
					%>
					<option value="A+">A+</option>
					<option value="B+" selected="selected">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("O+")){
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+" selected="selected">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("AB+")){
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+" selected="selected">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("A-")){
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-" selected="selected">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("B-")){
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-" selected="selected">B-</option>
					<option value="O-">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getBloodgroup().equals("O-")){
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-" selected="selected">O-</option>
					<option value="AB-">AB-</option>
					<%
						} else {
					%>
					<option value="A+">A+</option>
					<option value="B+">B+</option>
					<option value="O+">O+</option>
					<option value="AB+">AB+</option>
					<option value="A-">A-</option>
					<option value="B-">B-</option>
					<option value="O-">O-</option>
					<option value="AB-" selected="selected">AB-</option>
					<%}%>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Religion</label> <select
					style="width: 408.75px; height: 37.99px;"
					name="employeeOtherInfoBean.religion">
					<option value="" disabled="disabled">Please select</option>
					<%
						if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Hinduism")) {
					%>
					<option value="Hinduism" selected="selected">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Islam")){
					%>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam" selected="selected">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Sikhism")){
					%>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism" selected="selected">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Buddhism")){
					%>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism" selected="selected">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%
						} else if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Jainism")){
					%>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism" selected="selected">Jainism</option>
					<option value="Other religions ">Other religions</option>
					<%
						} else {
					%>
					<option value="Hinduism">Hinduism</option>
					<option value="Islam">Islam</option>
					<option value="Sikhism">Sikhism</option>
					<option value="Buddhism">Buddhism</option>
					<option value="Jainism">Jainism</option>
					<option value="Other religions" selected="selected">Other
						religions</option>
					</option>
					<%
						} 
					%>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputAddress">Aadhar Number</label> <input type="text"
					class="form-control" id="inputAddress"
					value="<%=infoBean.getEmployeeOtherInfoBean().getAdhaarNo()%>"
					name="employeeOtherInfoBean.adhaarNo">
			</div>
		</div>


		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="inputEmail4">Physically Challenged?</label> <select
					style="width: 408.75px; height: 37.99px;"
					name="employeeOtherInfoBean.ischallenged">
					<option value="" disabled="disabled">Please
						select</option>
					<%
						if (infoBean.getEmployeeOtherInfoBean().isIschallenged()) {
					%>
					<option value="true" selected="selected">YES</option>
					<option value="false">NO</option>
					<%
						} else {
					%>
					<option value="true">YES</option>
					<option value="false" selected="selected">NO</option>
					<%
						} 
					%>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="inputPassword4">Father Name</label> <input type="text"
					value="<%=infoBean.getEmployeeOtherInfoBean().getFatherName()%>"
					class="form-control" name="employeeOtherInfoBean.fatherName" />

			</div>
		</div>

		<hr style="border-color: darkblue;">
		<!-- ===============================================address type1 info details=============================================================== -->
		<%
			List<EmployeeAddInfoBean> addInfoBeans = infoBean.getEmployeeAddInfoBean();
		int i=0;
		for(EmployeeAddInfoBean addInfoBean: addInfoBeans){
			
		%>

		<h3 style="text-align: center; padding: 20px; color: blue">Employee
			Address Information</h3>
		<hr>
		<div class="form-row">

			<div class="form-group col-md-6">

				<label for="inputPassword4">City</label> <input type="text"
					class="form-control" 
					value="<%=addInfoBean.getCity()%>"
					name="employeeAddInfoBean[0].addressPKBean.city">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Address type</label> <select
					style="width: 640.75px; height: 39.99px;"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.addressType">
					<%
						if (addInfoBean.getAddressPKBean().getAddressType().equals("Permanent")) {
					%>
					<option value="" disabled="disabled">Select-one</option>
					<option value="Permanent" selected="selected">Permanent</option>
					<option value="Temporary">Temporary</option>
					<%
						} else {
					%>
					<option value="" disabled="disabled">Select-one</option>
					<option value="Permanent">Permanent</option>
					<option value="Temporary" selected="selected">Temporary</option>
					<%}%>
				</select>
			</div>
		</div>
		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="inputPassword4">State</label> <input type="text"
					class="form-control" value="<%=addInfoBean.getState()%>"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.state">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Address1</label><br> <input
					type="text" class="form-control"
					value="<%=addInfoBean.getAddressOne()%>"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.addressOne">

			</div>
		</div>

		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="inputPassword4">Country</label> <input type="text"
					class="form-control" value="<%=addInfoBean.getCountry()%>"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.country">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Address2</label><br> <input
					type="text" class="form-control"
					value="<%=addInfoBean.getAddressTwo()%>"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.addressTwo">
			</div>
		</div>

		<div class="form-row">

			<div class="form-group col-md-6">
				<label for="Pincode">Pincode</label> <input type="text"
					class="form-control" value="<%=addInfoBean.getPincode()%>"
					name="employeeAddInfoBean[<%=i%>].addressPKBean.pincode">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Landmark</label> <input type="text"
						class="form-control" value="<%=addInfoBean.getLandmark()%>"
						name="employeeAddInfoBean[<%=i%>].addressPKBean.landmark">
				</div>

			</div>

		</div>

		<hr style="border-color: darkblue;">
		<%
i++;
} %>
		
		<!-- ===============================================educational type1 info details=============================================================== -->

		<%
		List<EmployeeEducationalInfoBean> educationalInfoBeans = infoBean.getEducationalInfoBean();
		int j=0;
		for(EmployeeEducationalInfoBean educationalInfoBean: educationalInfoBeans){
			
		%>
		<h3 style="text-align: center; padding: 20px; color: blue">Educational
			Details</h3>
		<hr>

		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping"
				>Education
					Type</span>
			</div>
			<input type="text" class="form-control"
				value="<%=educationalInfoBean.getEducationalPKBean().getEducationalType()%>" 
				aria-label="Username"
				aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.educationalType">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping"
				>Degree
					Type</span>
			</div>
			<input type="text" class="form-control"
				value="<%=educationalInfoBean.getDegreeType()%>" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.degreeType">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Branch</span>
			</div>
			<input type="text" class="form-control" placeholder="Enter Branch"
				aria-label="Username" aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.branch"
				value="<%=educationalInfoBean.getBranch()%>">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">College
					Name</span>
			</div>
			<input type="text" class="form-control"
				placeholder="Enter Collage Name" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.collegeName"
				value="<%=educationalInfoBean.getCollegeName()%>">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">University</span>
			</div>
			<input type="text" class="form-control"
				placeholder="Enter University" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.university"
				value="<%=educationalInfoBean.getUniversity()%>">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Year Of
					Passing</span>
			</div>
			<input type="text" class="form-control" placeholder="dd-mm-yyyy "
				aria-label="Username" aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.yop"
				value="<%=educationalInfoBean.getYop()%>">
		</div>
		<br>

		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Percentage</span>
			</div>
			<input type="text" class="form-control"
				placeholder="Enter Percentage" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.percentage"
				value="<%=educationalInfoBean.getPercentage()%>">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Location</span>
			</div>
			<input type="text" class="form-control" placeholder="Enter Location"
				aria-label="Username" aria-describedby="addon-wrapping"
				name="educationalInfoBean[<%=j%>].educationalPKBean.location"
				value="<%=educationalInfoBean.getLocation()%>">
		</div>

<%
j++;
} %>
		<hr style="border-color: darkblue;">
		

		<hr style="border-color: darkblue;">
		<!-- ===============================================experience type1 info details=============================================================== -->

<%
		List<EmployeeExperienceInfoBean> experienceInfoBeans = infoBean.getExperienceInfoBean();
		int k=0;
		for(EmployeeExperienceInfoBean experienceInfoBean: experienceInfoBeans){
			
		%>
		<h3 style="text-align: center; padding: 20px; color: blue">Employee
			Experience Details</h3>
		<hr>
		<div class="input-group flex-nowrap"></div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Company
					Name</span>
			</div>
			<input type="text" class="form-control"
				value="<%=experienceInfoBean.getExperiencePKBean().getCompanyName()%>" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="experienceInfoBean[<%=k%>].experiencePKBean.companyName">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Designation</span>
			</div>
			<input type="text" class="form-control"
				value="<%=experienceInfoBean.getDesignation()%>" aria-label="Username"
				aria-describedby="addon-wrapping"
				name="experienceInfoBean[<%=k%>].experiencePKBean.designation">
		</div>
		<br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">Joining
					Date</span>
			</div>
			<input type="text" class="form-control" 
			value="<%=experienceInfoBean.getJoiningDate()%>"
				aria-label="Username" aria-describedby="addon-wrapping"
				name="experienceInfoBean[<%=k%>].experiencePKBean.joiningDate">
		</div>
		<br> <br>
		<div class="input-group flex-nowrap">
			<div class="input-group-prepend">
				<span class="input-group-text" id="addon-wrapping">leaving
					Date</span>
			</div>
			<input type="text" class="form-control" 
			value="<%=experienceInfoBean.getLeavingData()%>"
				aria-label="Username" aria-describedby="addon-wrapping"
				name="experienceInfoBean[<%=k%>].experiencePKBean.leavingData">
		</div>
<%
k++;
} %>
		<hr style="border-color: darkblue;">
		


		<div
			style="text-align: center; padding: 0px 102px 20px; margin: 30px;"
			class="btn-group" role="group">
			<button style="width: 180px; height: 40px;" type="reset"
				class="btn btn-outline-secondary">Reset</button>
			<button style="width: 180px; height: 40px; margin-left: 630px;"
				type="submit" class=" btn btn-outline-primary float-right">Submit</button>
		</div>
		</div>

	</form>



	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>
</html>