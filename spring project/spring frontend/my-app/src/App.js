import React from "react";
import Home from './frontend/main/Home';

import { Switch , Route, BrowserRouter } from 'react-router-dom';

import login from "./frontend/main/Login";
import Explore from "./frontend/places/md";
import create from "./frontend/main/create";

function App() {
  return (
    <BrowserRouter>
    
    <Route exact path="/" component={Home} />
    <Route exact path="/Explore" component={Explore} />
    
    
    <Route exact path="/create" component={create} />
    
    <Route exact path="/Login" component={login} />
     </BrowserRouter>
    
  );
}

export default App;
