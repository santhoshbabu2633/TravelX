import React, { Component } from 'react';
import { Link } from "react-router-dom";
import './Home.css'
class Home extends Component {
    render() {
      return (
        
              
      <div className='homebg'>
    <div className="navbar">
    <img className='i' src="logos.png"></img>
      <Link to="/Login">Login</Link>
      <Link to="Service">Customer Service</Link>
      <div class="dropdown">
        <button class="dropbtn">Places
          <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content">
        <Link to="Explore">Explore</Link>
      
      </div>
      </div>
      </div>
      </div>
    
    
    
  );
}
}
export default Home;