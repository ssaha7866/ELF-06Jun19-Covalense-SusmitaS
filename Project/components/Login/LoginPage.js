import React, { Component } from 'react'

import './Login.css'
import {Link } from 'react-router-dom'
import Axios from 'axios'
export default class LoginPage extends Component {

constructor(props) {
super(props)

this.state = {
userid:'', 
password:'',
userType: 'librarian'
}
this.pRef = React.createRef();
this.error = "Login failed"
}

login(event) {
event.preventDefault();
Axios.post('http://localhost/login/loginPage',null,
{
params: {
email: this.state.email,
password:this.state.password
}
}
).then((response)=>{
console.log(response.data.message)
if(response.data.message === 'Success') {
sessionStorage.setItem('userId', response.data.beans[0].userId);
sessionStorage.setItem('userType', response.data.beans[0].userType);
if(response.data.beans[0].userType === "librarian") {
this.props.history.push('/HomePage')
} else if(response.data.beans[0].userType === "user") {
this.props.history.push('/HomePageUser')

}// this.props.history.push('/HomePage')
} else {
//this.pRef.current.style.visibility = "visible"
}
//this.props.history.push('/HomePage')
}).catch((error)=>{
console.log(error)
})
}



render() {
return (
<div>

<section className="login-block">
<div className="container" style={{backgroundColor: 'white'}}>
<div className="row">
<div className="col-md-4 login-sec">
<h2 className="text-center">Login Now</h2>
<form className="login-form" action="/HomePage">
<div className="form-group">
<label htmlFor="exampleInputEmail1" className="text-uppercase">Username</
label>
<input type="text" className="form-control" placeholder="username" />
</div>
<div className="form-group">
<label htmlFor="exampleInputPassword1" className="text-uppercase">Password</
label>
<input type="password" className="form-control" placeholder="password" />
</div>
<div className="form-check">
<label className="form-check-label">
<input type="checkbox" className="form-check-input" />
<small> &nbsp; &nbsp; &nbsp; Remember Me</small>
</label>
<button type="submit" className="btn btn-login float-right">Login</button>
</div>
</form>
<div className="copy-text">Don't have an account?<Link href="#">Register 
Now/Signup</Link></div>
</div>
<div className="col-md-8 banner-sec">
<div id="carouselExampleIndicators" className="carousel slide" data-ride=
"carousel">
<ol className="carousel-indicators">
<li data-target="#carouselExampleIndicators" data-slide-to={0} className=
"active" />
<li data-target="#carouselExampleIndicators" data-slide-to={1} />
<li data-target="#carouselExampleIndicators" data-slide-to={2} />
</ol>
<div className="carousel-inner" role="listbox">
<div className="carousel-item active">
<img className="d-block img-fluid" src="
https://static.pexels.com/photos/33972/pexels-photo.jpg" alt="First slide" 
/>
<div className="carousel-caption d-none d-md-block">
<div className="banner-text">
<h2>Library</h2>

</div>
</div>
</div>
<div className="carousel-item">
<img className="d-block img-fluid" src="
https://images.pexels.com/photos/7097/people-coffee-tea-meeting.jpg" alt="First 
slide" />
<div className="carousel-caption d-none d-md-block">
<div className="banner-text">
<h2>Science</h2>

</div>
</div>
</div>
<div className="carousel-item">
<img className="d-block img-fluid" src="
https://images.pexels.com/photos/872957/pexels-photo-872957.jpeg" alt="First 
slide" />
<div className="carousel-caption d-none d-md-block">
<div className="banner-text">
<h2>History</h2>

</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div></section>
</div>
)
}
}
