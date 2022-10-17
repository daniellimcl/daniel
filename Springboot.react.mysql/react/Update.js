import logo from './logo.svg';
import './App.css';
import Header from './Header';
import Footer from './Footer';
import { useEffect, useState } from 'react';


function Update() {
    const[userList,setUserList] = useState([]);
    const GetUsersApi=()=>{
        
          fetch("http://localhost:8080/GetUsers",{
            method:"get",
            headers:{
                "Content-Type":"application/json"
            }
            
          })
          .then(res=>{
            if(!res.ok){
                throw res
            }
            res.json().then(res=>{
               
                console.log(res);
                setUserList(res);
            }
            )
    
          }
            ).catch(err=>{
                err.json().then(e=>console.log(e))
                
              // alert("Error while login");
                //err.json().then(alert("Error while login"))
            })
          
       }
       useEffect(()=>{
        
       GetUsersApi()

        },[])

   return (
   <>
   <Header/>
   <select >

    <option value="default" defaultValue="Selected">Select a user</option>

         {

            userList.map((anObj, index) => {

            return <option key={index} value={anObj.id}>{anObj.name}</option>

                                        })

  }

     </select>

            
   
	<Footer/>
   </>
   )
}

export default Update;