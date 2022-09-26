import { useState } from "react";
function App(){
    let agerank = [
        {"name":"John",'age':65},
        {"name":"Jane",'age':55},
        {"name":"Jill",'age':10},
        {"name":"Jack",'age':30},
        {"name":"Joe",'age':10},
    ];
    const[Class,setClass] = useState('first');
    return(
        <div>         
            <h2 grp={Class}>grouping them by colour for above 50 and below 50</h2>
            <button onClick={()=>setClass('first')}>above 50</button>
            <button onClick={()=>setClass('second')}>below 50</button>
            <ul>
                {
                   agerank.map((peopleObj,idx)=>{
                    return <li grp={peopleObj.age>50?'first':"second"}>{peopleObj.name} -- {peopleObj.age}
                    </li>
                   }) 
                }
            </ul>
           
        </div>
    )
}
export default App;

//array, Map
//Tenary 