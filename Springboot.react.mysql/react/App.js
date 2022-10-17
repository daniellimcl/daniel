import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import Home from './Home';
import Login from './Login';
import Update from './Update';

function App() {
  return (
    <Router>
      <Routes>
         <Route path="/Home" element={<Home/>}/>
         <Route path="/" element={<Home/>}/>
         <Route path="/Login" element={<Login/>}/>
         <Route path="/Update" element={<Update/>}/>
      </Routes>
      </Router>
  );
}

export default App;
