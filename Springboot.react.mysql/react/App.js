import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import Home from './Home';
import Login from './Login';

function App() {
  return (
    <Router>
      <Routes>
         <Route path="/Home" element={<Home/>}/>
         <Route path="/" element={<Home/>}/>
         <Route path="/Login" element={<Login/>}/>
      </Routes>
      </Router>
  );
}

export default App;
