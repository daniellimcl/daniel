import React, {useState} from 'react'
import './App.css';

function App() {
   const [name, setName]=useState("")
    const [password, setPassword]=useState("")
    const [email, setEmail]=useState("")
    const [mobile, setMobile]=useState("")

    function signUp()
    { 
        let item={name,password,email,mobile}
        console.warn(item)        
    }

    return(
        <div>
            <h1>Register Page</h1>
            <input type="text" value={name} onChange={(e)=>setName(e.target.value)}  placeholder =  "name"/>
            <br/>
            <input type="text" value={password} onChange={(e)=>setPassword(e.target.value)} placeholder ="password"/>
            <br/>
            <input type="text" value={email} onChange={(e)=>setEmail(e.target.value)} placeholder ="email"/>
            <br/>
            <input type="text" value={mobile} onChange={(e)=>setMobile (e.target.value)}  placeholder = "mobile"/>
            <br/>
            <button onClick={signUp}>
                Sign Up
            </button>
        </div>
    )
}
export default App;

