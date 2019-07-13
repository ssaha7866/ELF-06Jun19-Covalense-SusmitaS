/* let myEmail=document.forms[0].email.value;
let myPassword=document.form[0].password.value; */
console.log(myEmail);
console.log(myPassword);

function validateForm(){
    let myEmail=document.forms[0].email.value;
    let myConfirmPassword=document.forms[0].confirmPassword.value;
let myPassword=document.form[0].password.value;

window.alert("confirmed password donot match with password")
if(myEmail.length>6 && myPassword.length>6 && myPassword!=myConfirmPassword)
document.form[0].myButton.disabled=false;
else{
window.alert("confirmed password donot match with password");
document.form[0].myButton.disabled=true;
}
}