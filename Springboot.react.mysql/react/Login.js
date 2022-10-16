import './App.css';
import Header from './Header';
import Footer from './Footer';
import { useEffect, useState } from 'react';
function Login() {
   const[userEmail,setUserEmail] = useState();
   const[password,setPassword] = useState();
   const loginApi=()=>{
    console.log (userEmail, password)
    if(userEmail == ""){
        alert("Email should nt empty")
        return;
    }else if(password == ""){
        alert("Email should nt empty")
        return;
    }
    let req = {
        "email":userEmail,
        "password":password
        }
      fetch("http://localhost:8080/Login",{
        method:"post",
        body:JSON.stringify(req),
        headers:{
            "Content-Type":"application/json"
         
        }
        
      })
      .then(res=>{
        if(!res.ok){
            throw res
        }
        res.json().then(res=>{
            localStorage.setItem("full_response",JSON.stringify(res));
            localStorage.setItem("token",res['token']);
            localStorage.setItem("userId",res['id']);
            console.log(res);
        })

      }
        ).catch(err=>{
            err.json().then(e=>console.log(e))
            
          // alert("Error while login");
            //err.json().then(alert("Error while login"))
        })
      
   }
    return (
        <>
        <Header/>
                        
                        <div class="col-md-12">
                           <input onChange={(e=>setUserEmail(e.target.value))} class="contactus" placeholder="Email" type="type" name="Email"/>                          
                        </div>
                        <div class="col-md-12">
                           <input class="contactusmess"onChange={(e=>setPassword(e.target.value))}  placeholder="Password" type="type" Message="Password"/>
                        </div>
                        <div class="col-md-12">
                           <input type="button" class="send_btn" onClick={loginApi} value="Login"/>
                        </div>
                     
        <Footer/>
        </>
        )
     }
     export default Login;