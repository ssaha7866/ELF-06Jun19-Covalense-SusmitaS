<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<form  class="col-md-10 offset-1" style="background-color :rgb(141, 219, 250)" action="./registrationForm" method="post">
            <h3 style="text-align: center;padding: 20px; color: blue">Employee Basic Information</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4"> Employee Id</label>
                    <input required type="text" class="form-control"  placeholder="Please Enter ID" name="employeeId">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" class="form-control"  placeholder="Please Enter Account Number" name="accountNumber">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Name" name="employeeName">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" class="form-control"  placeholder="Please Enter Email Id " name="email">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br>
                            <input type="text" class="form-control"  placeholder="Please Enter Age" name="age">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input type="text" class="form-control"  placeholder="Please EnterDesignation" name="designation">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br>
                                  <select style="        width: 640.75px;height: 39.99px;" name="gender">
                                      <option value="" disabled="disabled" selected="selected">Please select</option>
                                    <option value="Male">Male</option>
                                      <option value="Female">Female</option>
                                     
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input type="date" class="form-control"  placeholder="dd-mm-yyyy" name="dob">
                                </div>
                                
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input type="text" class="form-control"  placeholder="Please EnterDesignation" name="salary">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="number" class="form-control"  placeholder="Please Enter Department ID " name="departmentInfoBean.departmentId">

                                     
                                    </div>
                              </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input type="text" class="form-control"  placeholder="Please Enter Phone Number" name="phone">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input type="text" class="form-control"  placeholder="Please Enter Manager ID " name="managerId.employeeId">
    
                                         
                                        </div>
                                      </div>
                                      
                                      <div class="form-row">
                                          <div class="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input type="date" class="form-control"  placeholder="dd-mm-yyyy" name="joiningDate">
                                            </div>
                                           
                                            <div class="form-group col-md-6">
                                                <label for="inputPassword4">Password</label>
                                                <input type="password" name="password" id="password" class="form-control" placeholder="Enter your Password" name="">
                                              </div> 
                                        </div>
                                </div>
                                <hr style="border-color: darkblue;"> 

        <!-- ===============================================other info details=============================================================== --> 
    
        <h3 style="text-align: center;padding: 20px; color: blue">Employee Other Information</h3>
                <hr>   
            <div class="form-row">
                 
                  <div class="form-group col-md-4">
                    <label for="inputPassword4">Emergency Contact Name</label>
                    <input type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number" name="employeeOtherInfoBean.emergencyContactName">
                  </div>
                  <div class="form-group col-md-4">
                        <label for="inputAddress">Mother Name</label>
                        <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter Mother Name"name="employeeOtherInfoBean.motherName">
                      </div>
                </div>

                <div class="form-row">
                        <div class="form-group col-md-4">
                          <label for="inputEmail4">Pan Number</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Pan Number" name="employeeOtherInfoBean.panNo">
                        </div>
                        <div class="form-group col-md-4">
                          <label for="inputPassword4">Emergency Contact Number</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number" name="employeeOtherInfoBean.emergencyNumber">
                        </div>
                        <div class="form-group col-md-4">
                              <label for="inputAddress">Spouse Name</label>
                              <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter Spouse Name" name="employeeOtherInfoBean.spouseName">
                            </div>
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-4">
                            <label for="inputEmail4">Married Status</label><br>
                            <select style="    width: 408.75px;height: 37.99px;" name="employeeOtherInfoBean.isMarried">
                                <option value="Married">Married</option>
                                <option value="Single">Single</option>
                              </select>
                       
                        </div>
                         
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Nationality</label>
                          
                            <select style="    width: 408.75px;height: 37.99px;" name="employeeOtherInfoBean.nationality">
                                <option value="" disabled="disabled" selected="selected">Please select</option>
                              <option value="Indian">Indian</option>
                                <option value="Other">Other</option>
                              </select>
                            </div>

                            <div class="form-group col-md-4">
                                  <label for="inputAddress">Passport Number</label>
                                  <input type="text" class="form-control" id="inputAddress" placeholder="please enter Passport Number" name="employeeOtherInfoBean.passportNo">
                                </div>
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-4">
                                  <label for="inputEmail4">Blood Group</label>
                                  <select style="    width: 408.75px;height: 37.99px;" name="employeeOtherInfoBean.bloodgroup">
                                      <option value="" disabled="disabled" selected="selected">Please select</option>
                                    <option value="A+">A+</option>
                                      <option value="B+">B+</option>
                                      <option value="O+">O+</option>
                                      <option value="AB+">AB+</option>
                                      <option value="A-">A-</option>
                                      <option value="B-">B-</option>
                                      <option value="O-">O-</option>
                                      <option value="AB-">AB-</option>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                  <label for="inputPassword4">Religion</label>
                                  <select style="    width: 408.75px;height: 37.99px;" name="employeeOtherInfoBean.religion">
                                    <option value="" disabled="disabled" selected="selected">Please select</option>
                                  <option value="Hinduism">Hinduism</option>
                                    <option value="Islam">Islam</option>
                                    <option value="Sikhism">Sikhism </option>
                                    <option value="Buddhism">Buddhism</option>
                                    <option value="Jainism">Jainism</option>
                                    <option value="Other religions ">Other religions </option>

                                    </option>
                                  
                                  </select>
                                </div>
                                <div class="form-group col-md-4">
                                      <label for="inputAddress">Aadhar Number</label>
                                      <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number" name="employeeOtherInfoBean.adhaarNo">
                                    </div>
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-4">
                                      <label for="inputEmail4">Physically Challenged?</label>
                                      <select style="    width: 408.75px;height: 37.99px;" name="employeeOtherInfoBean.ischallenged">
                                        <option value="" disabled="disabled" selected="selected">Please select</option>
                                      <option value="YES">YES</option>
                                        <option value="NO">NO</option>
                                      </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <label for="inputPassword4">Father Name</label>
                                      <input type="text" class="form-control"  placeholder="Please Enter Father Name" name="employeeOtherInfoBean.fatherName">
                                    </div>
                                </div>

                                <hr style="border-color: darkblue;">
 <!-- ===============================================address type1 info details=============================================================== --> 

 <h3 style="text-align: center;padding: 20px; color: blue">Employee Address Information</h3>
 <hr>
 <div class="form-row">
                 
        <div class="form-group col-md-6">
   
     <label for="inputPassword4">City</label>
     <input type="text" class="form-control"  placeholder="Please Enter City" name="employeeAddInfoBean[0].addressPKBean.city">
   </div>
   <div class="form-group col-md-6">
        <label for="inputEmail4">Address type</label>
        <select style=" width: 640.75px;height: 39.99px;" name="employeeAddInfoBean[0].addressPKBean.addressType" >
          <option value="" disabled="disabled" selected="selected">Select-one</option>
        <option value="Permanent">Permanent</option>
          <option value="Female">Tempory</option>
         </select>
       </div>
 </div>
 <div class="form-row">
        
         <div class="form-group col-md-6">
           <label for="inputPassword4">State</label>
           <input type="email" class="form-control"  placeholder=" Enter State" name="employeeAddInfoBean[0].addressPKBean.state">
         </div>
         <div  class="form-group col-md-6">
                <label for="inputEmail4">Address1</label><br>
                <input type="text" class="form-control"  placeholder=" Enter Address1" name="employeeAddInfoBean[0].addressPKBean.addressOne">
           
            </div>
       </div>

       <div class="form-row">
         
             <div class="form-group col-md-6">
             <label for="inputPassword4">Country</label>
               <input type="text" class="form-control"  placeholder="Enter Country" name="employeeAddInfoBean[0].addressPKBean.country">
             </div>
             <div class="form-group col-md-6">
                    <label for="inputEmail4">Address2</label><br>
                    <input type="text" class="form-control"  placeholder=" Enter Address2" name="employeeAddInfoBean[0].addressPKBean.addressTwo">
                  </div>
             </div>
           
             <div class="form-row">
                 
                 <div class="form-group col-md-6">
                   <label for="Pincode">Pincode</label>
                   <input type="text" class="form-control"  placeholder="enter  Pincode" name="employeeAddInfoBean[0].addressPKBean.pincode">
                  </div>
                  <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Landmark</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Landmark" name="employeeAddInfoBean[0].addressPKBean.landmark">
                        </div>  

               </div>

 </div>
                              
               <hr style="border-color: darkblue;">
               <!-- ===============================================address Type 2 info details=============================================================== --> 
              
               <h3 style="text-align: center;padding: 20px; color: blue">Employee Address Information</h3>
               <hr>
               <div class="form-row">
                               
                      <div class="form-group col-md-6">
                 
                   <label for="inputPassword4">City</label>
                   <input type="text" class="form-control"  placeholder="Please Enter City" name="employeeAddInfoBean[1].addressPKBean.city">
                 </div>
                 <div class="form-group col-md-6">
                      <label for="inputEmail4">Address type</label>
                      <select style=" width: 640.75px;height: 39.99px;" name="employeeAddInfoBean[1].addressPKBean.addressType" >
                        <option value="" disabled="disabled" selected="selected">Select-one</option>
                      <option value="Permanent">Permanent</option>
                        <option value="Female">Tempory</option>
                       </select>
                     </div>
               </div>
               <div class="form-row">
                      
                       <div class="form-group col-md-6">
                         <label for="inputPassword4">State</label>
                         <input type="email" class="form-control"  placeholder=" Enter State" name="employeeAddInfoBean[1].addressPKBean.state">
                       </div>
                       <div  class="form-group col-md-6">
                              <label for="inputEmail4">Address1</label><br>
                              <input type="text" class="form-control"  placeholder=" Enter Address1" name="employeeAddInfoBean[1].addressPKBean.addressOne">
                         
                          </div>
                     </div>
              
                     <div class="form-row">
                       
                           <div class="form-group col-md-6">
                           <label for="inputPassword4">Country</label>
                             <input type="text" class="form-control"  placeholder="Enter Country" name="employeeAddInfoBean[1].addressPKBean.country">
                           </div>
                           <div class="form-group col-md-6">
                                  <label for="inputEmail4">Address2</label><br>
                                  <input type="text" class="form-control"  placeholder=" Enter Address2" name="employeeAddInfoBean[1].addressPKBean.addressTwo">
                                </div>
                           </div>
                         
                           <div class="form-row">
                               
                               <div class="form-group col-md-6">
                                 <label for="Pincode">Pincode</label>
                                 <input type="text" class="form-control"  placeholder="enter  Pincode" name="employeeAddInfoBean[1].addressPKBean.pincode">
                                </div>
                                <div class="form-row">
                                      <div class="form-group col-md-6">
                                        <label for="inputEmail4">Landmark</label>
                                        <input type="text" class="form-control"  placeholder="Please Enter Landmark" name="employeeAddInfoBean[1].addressPKBean.landmark">
                                      </div>  
              
                             </div></div>

               <hr style="border-color: darkblue;">
    <!-- ===============================================educational type1 info details=============================================================== -->

    <h3 style="text-align: center;padding: 20px; color: blue">Educational Details</h3>
    <hr>
   
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Education Type</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.educationalType">
   </div>
   <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Degree Type</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.degreeType">
   </div>
   <br>
   <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Branch</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.branch">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Collage Name</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.collegeName">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">University</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.university">
     </div>
     <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
     </div>
     <input type="text" class="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.yop">
   </div>
   <br>

   <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Percentage</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.percentage">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Location</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[0].educationalPKBean.location">
     </div>

  
                <hr style="border-color: darkblue;">
    <!-- ===============================================educational type2 info details=============================================================== -->

    <h3 style="text-align: center;padding: 20px; color: blue">Educational Details</h3>
    <hr>
   
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Education Type</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.educationalType">
   </div>
   <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Degree Type</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.degreeType">
   </div>
   <br>
   <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Branch</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.branch">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Collage Name</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.collegeName">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">University</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.university">
     </div>
     <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
     </div>
     <input type="text" class="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.yop">
   </div>
   <br>

   <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Percentage</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.percentage">
     </div>
     <br>
     <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">Location</span>
       </div>
       <input type="text" class="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping" name="educationalInfoBean[1].educationalPKBean.location">
     </div>

  
                <hr style="border-color: darkblue;">
    <!-- ===============================================experience type1 info details=============================================================== -->

    <h3 style="text-align: center;padding: 20px; color: blue">Employee Experience Details</h3>
    <hr>
   <div class="input-group flex-nowrap">
    
     
   </div>
   <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Company Name</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[0].experiencePKBean.companyName">
   </div>
   <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Designation</span>
     </div>
     <input type="text" class="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[0].experiencePKBean.designation">
   </div>
   <br>
   <div class="input-group flex-nowrap">
     <div class="input-group-prepend">
       <span class="input-group-text" id="addon-wrapping">Joining Date</span>
     </div>
     <input type="text" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[0].experiencePKBean.joiningDate">
   </div>
   <br>
   <br>
   <div class="input-group flex-nowrap">
       <div class="input-group-prepend">
         <span class="input-group-text" id="addon-wrapping">leaving Date</span>
       </div>
       <input type="text" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[0].experiencePKBean.leavingData">
     </div>

     <hr style="border-color: darkblue;">
     <!-- ===============================================experience type2 info details=============================================================== -->
 
     <h3 style="text-align: center;padding: 20px; color: blue">Employee Experience Details</h3>
     <hr>
    <div class="input-group flex-nowrap">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Company Name</span>
      </div>
      <input type="text" class="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[1].experiencePKBean.companyName">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Designation</span>
      </div>
      <input type="text" class="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[1].experiencePKBean.designation">
    </div>
    <br>
    <div class="input-group flex-nowrap">
      <div class="input-group-prepend">
        <span class="input-group-text" id="addon-wrapping">Joining Date</span>
      </div>
      <input type="text" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[1].experiencePKBean.joiningDate">
    </div>
    <br>
    <br>
    <div class="input-group flex-nowrap">
        <div class="input-group-prepend">
          <span class="input-group-text" id="addon-wrapping">leaving Date</span>
        </div>
        <input type="text" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" name="experienceInfoBean[1].experiencePKBean.leavingData">
      </div>




                     <div style="text-align: center;padding: 0px 102px 20px;margin: 30px;"  class="btn-group" role="group" >  
                            <button style="width: 180px;height: 40px;" type="reset"  class="btn btn-outline-secondary">Reset</button>
                            <button  style="width: 180px;height: 40px;margin-left: 630px;" type="submit"  class=" btn btn-outline-primary float-right" >Submit</button>
                     </div>
                    </div>

    </form>


              
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
	
</body>
</html>