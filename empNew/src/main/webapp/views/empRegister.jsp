<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<form  class="col-md-10 offset-1" style="background-color :rgb(141, 219, 250)" action="./submitRegisterData" method="post">
                <h3 class="head text-center"style="text-align: center;padding: 20px;">EMPLOYEE DETAILS</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input type="text" class="form-control"  placeholder="Enter your employee ID" name="employeeId">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" class="form-control"  placeholder="Enter your Account Number " name="employeeId">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" class="form-control"  placeholder="Enter your Name" name="employeeId">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" class="form-control"  placeholder="Enter your Email Id " name="employeeId">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br>
                            <input type="text" class="form-control"  placeholder="Enter your Age" name="employeeId">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input type="text" class="form-control"  placeholder="Enter your Designation" name="employeeId">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br>
                                  <select style="width: 640.75px;height: 39.99px;" name="employeeId">
                                      <option value="" disabled="disabled" selected="selected" >Select Gender</option>
                                    <option value="Male">Male</option>
                                      <option value="Female">Female</option>
                                     
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input type="date" class="form-control" name="employeeId">
                                </div>
                                
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input type="text" class="form-control"  placeholder="Enter your salary" name="employeeId">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="text" class="form-control"  placeholder="Enter your Department ID " name="employeeId">

                                     
                                    </div>
                              </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input type="text" class="form-control"  placeholder="Enter your Phone Number" name="employeeId">
                                        </div>

                                        <div class="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input type="text" class="form-control"  placeholder="Enter your Manager ID " name="employeeId">
                                        </div>

                                      </div>
                                      
                                      <div class="form-row">
                                          <div class="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input type="date" class="form-control" >
                                            </div>

                                            <div class="form-group col-md-6">
                                                <label for="inputPassword4">Password</label>
                                                <input type="password" name="password" id="password" class="form-control" placeholder="Enter your Password " name="employeeId">
                                              </div>

                                            
                                        </div>

                                    </div>
                                    <hr style="border-color: darkblue;">   
     <!--  ==============================Employee other info details=================================  -->                           
       
         	<h3 style="text-align: center;padding: 20px; color: blue">Employee Other Information</h3>
            <hr>   
            <div class="form-row">
                  <div class="form-group col-md-4">
                    <label for="inputEmail4">ID</label>
                    <input type="text" class="form-control"  placeholder="Please Enter ID" name="employeeId">
                  </div>
                  <div class="form-group col-md-4">
                    <label for="inputPassword4">Emergency Contact Name</label>
                    <input type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number " name="employeeId">
                  </div>
                  <div class="form-group col-md-4">
                        <label for="inputAddress">Mother Name</label>
                        <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter Mother Name" name="employeeId">
                      </div>
                </div>

                <div class="form-row">
                        <div class="form-group col-md-4">
                          <label for="inputEmail4">Pan Number</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Pan Number" name="employeeId">
                        </div>
                        <div class="form-group col-md-4">
                          <label for="inputPassword4">Emergency Contact Number</label>
                          <input type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number " name="employeeId">
                        </div>
                        <div class="form-group col-md-4">
                              <label for="inputAddress">Spouse Name</label>
                              <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter Spouse Name" name="employeeId">
                            </div>
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-4">
                            <label for="inputEmail4">Married Status</label><br>
                            <select style="    width: 408.75px;height: 37.99px;" name="employeeId">
                                <option value="Married">Married</option>
                                <option value="Single">Single</option>
                              </select>
                       
                        </div>
                         
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Nationality</label>
                          
                            <select style="    width: 408.75px;height: 37.99px;" name="employeeId">
                                <option value="" disabled="disabled" selected="selected">Please select</option>
                              <option value="Indian">Indian</option>
                                <option value="Other">Other</option>
                              </select>
                            </div>

                            <div class="form-group col-md-4">
                                  <label for="inputAddress">Passport Number</label>
                                  <input type="text" class="form-control" id="inputAddress" placeholder="please enter Passport Number" name="employeeId">
                                </div>
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-4">
                                  <label for="inputEmail4">Blood Group</label>
                                  <select style="width: 408.75px;height: 37.99px;" name="employeeId">
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
                                  <select style="    width: 408.75px;height: 37.99px;" name="employeeId">
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
                                      <input type="text" class="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number" name="employeeId">
                                    </div>
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-4">
                                      <label for="inputEmail4">Physically Challenged?</label>
                                      <select style="    width: 408.75px;height: 37.99px;" >
                                        <option value="" disabled="disabled" selected="selected">Please select</option>
                                      <option value="YES">YES</option>
                                        <option value="NO">NO</option>
                                      </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <label for="inputPassword4">Father Name</label>
                                      <input type="text" class="form-control"  placeholder="Please Enter Father Name ">
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