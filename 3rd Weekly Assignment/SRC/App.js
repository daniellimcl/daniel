import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import Home from './Home';

function App() {
  return (
    <Router>
      <Route>
         <Route path="/Home" element={<Home/>}/>
         <Route path="/" element={<Home/>}/>
      </Route>
      </Router>
  );
}

export default App;
