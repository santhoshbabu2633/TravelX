import React, { Component } from 'react';
import { Link } from "react-router-dom";
import './md.css'
class Explore extends Component {
    render() {
      return (
        
    <div className='obg'>
      <div className='kobg'>
      </div>
      <div className='bx1'>
        <img className="kd1" src="kd1.jpg"></img>
        <br></br><br></br>
        <img className="kd2" src="kd2.jpg"></img>
        <br></br><br></br>
        
      </div>

      <div className='mdubg'>
        </div>
        
        
        
        <div className='bx2'>
        <img className="md1" src="md1.jpg"></img>
        <br></br><br></br>
        <img className="md2" src="md2.jpg"></img>
        <br></br><br></br>
        </div> 
      <div className='ootybg'>
      </div>
      <div className='bx3'><img className="oo1" src="oo1.jpg"></img>
        <br></br><br></br>
        <img className="oo2" src="oo2.jpg"></img></div>
      

      <div className='pobg'></div>
      
      <div className='bx4'>
      <img className="po1" src="po1.jpg"></img>
        <br></br><br></br>
        <img className="po2" src="po2.jpg"></img>
      </div>
      <div className='table'>
      <table width={500} height={100}  text-align="top"border={5}>
        <tr>
          <th>Id</th>
          <th>Tourist place</th>
          <th>Food Expense</th>
          <th>Travel Expenses</th>
          <th>Hotel Expenses</th>
          <th>Total Expenses</th>
          <th>Select trip</th>
        </tr>
        <tr>
        <td>1</td><td>Kodaikanal</td><td>500.0</td><td>500.0</td><td>500.0</td><td>1500.0</td><td><button>select</button></td>
        </tr>
        <tr>
        <td>2</td><td>Maurai</td><td>500.0</td><td>500.0</td><td>500.0</td><td>1500.0</td><td><button>select</button></td>
        </tr>
        <tr>
        <td>3</td><td>Ooty</td><td>500.0</td><td>500.0</td><td>500.0</td><td>1500.0</td><td><button>select</button></td>
        </tr>
        <tr>
        <td>4</td><td>Pondicherry</td><td>500.0</td><td>500.0</td><td>500.0</td><td>1500.0</td><td><button>select</button></td>
        </tr>
      </table>
      </div>
      </div>

    
      
    
    
    
  );
}
}
export default Explore;