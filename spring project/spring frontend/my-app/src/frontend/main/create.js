import React, { Component } from 'react';
import { Link } from "react-router-dom";
import './create.css'
class create extends Component {
    render() {
      return (
        
              
      <div className='lbg'>
      
      <div className='box01'>
      </div>
      <div className='txt1'>CREATE ACCOUNT</div>
      <div className='d11'>Username</div><input className="p1" type='text' placeholder='Name' name='Id' ></input>
      <div className='d21'>password</div><input className="p2" type='password' placeholder='password' name='password' ></input>
      <div className='d31'>Confirm Password</div><input className="p2" type='password' placeholder='password' name='password' ></input>
      <button class='button11'><Link to="/">Create account</Link></button>
      
      
        </div>
    
      
    
    
    
  );
}
}
export default create;