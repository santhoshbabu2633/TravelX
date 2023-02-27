import React, { Component } from 'react';
import { Link } from "react-router-dom";
import './Login.css'
class login extends Component {
    render() {
      return (
        
              
      <div className='lbg'>
      
      <div className='box0'>
      </div>
      <div className='txt'>SIGN IN</div>
      <div className='d1'>Email Id</div><input className="p1" type='text' placeholder='Email Id' name='Id' ></input>
      <div className='d2'>Password</div><input className="p2" type='password' placeholder='password' name='password' ></input>
      <button class='button'>Sign in</button>
      <button class='button1'><Link to="create">Create account</Link></button>
      <img className='logo' src="logos.png"></img>
      
        </div>
    
      
    
    
    
  );
}
}
export default login;