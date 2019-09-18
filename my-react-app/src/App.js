import React, {Component}from 'react';
import './App.css';
import "bootstrap/dist/css/bootstrap.min.css"
import NavBar from "./components/NavBar";
import ProjectBoard from "./components/ProjectBoard";
class App extends Component{
  render() {
    return(
        <div className="App">
            <NavBar></NavBar>
            <ProjectBoard></ProjectBoard>
        </div>
    );
  }

}

export default App;
