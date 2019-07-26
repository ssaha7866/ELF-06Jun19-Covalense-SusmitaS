//login validation


function validateForm(){
    var username= document.forms[0].username.value;
var myConformPassword= document.forms[0].password.value;
localStorage.setItem("email", myEmail);
localStorage.setItem("password", myPassword);
localStorage.setItem("cpassword", myConformPassword);
 
 console.log(username);
    console.log(myPassword);

      //validation  for all input
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(username) && 
    username.length>6&&
         myPassword.length>6
        )
    {
        document.getElementById('submitButton').disabled=false;

    }else{
        document.getElementById('submitButton').disabled=true;
    }
    //validation message for email
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(username) && 
    username.length>6)
    {
        document.getElementById('emailMessage').style.visibility='hidden';
        
    }else{
        document.getElementById('emailMessage').style.visibility='visible';
    }
    //validation message for password
    if ( myPassword.length>6)
    {
        document.getElementById('passwordMessage').style.visibility='hidden';
        
    }else{
        document.getElementById('passwordMessage').style.visibility='visible';
    }
}

//show password 
function showPassword(){
    
    if(  document.getElementById('password').type=="password"){
document.getElementById('password').type="text";
    }else{
     document.getElementById('password').type="password";

    }

}
