import axios from "axios";
import React, { useEffect, useState } from "react";
import { Button } from "reactstrap";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import DataCard from "./Datacard";

const Landing = () => {
    const [numofdata, setnumofdata] = useState([]);
    const [Alldata, setAlldata] = useState([]);
    const [buttonClick, setButtonClicked] = useState(false);
    const notify = () => toast.warn("Please enter input in numbers only!");
  
    const handleChange = (e) => {
        let value = e.target.value;
        if(!isNaN(value)){
        setnumofdata(value);
        }
        else{
            e.target.value=null;
           notify();
           
        }
    }; 
    useEffect(() => {
        const fetchData = async () => {
            const res = await axios.get('http://localhost:8080/api/vehicle/' + numofdata).then((response)=>{ 
                setAlldata(response.data); 
            }).catch((e)=>{console.log(e);
                notify();
                setButtonClicked(!buttonClick);
            });
        }
        if (buttonClick) {
            try{
            fetchData();
            setButtonClicked(!buttonClick);
            }
            catch(e){
                console.log(e);
            }
            
        }
    }, [buttonClick,numofdata]);


    return (
        <div className="app">
            <div className="heading">
                <h1>This is the synthetic vehicle data generator app</h1>
            </div>
            <div className="form">
                <form onSubmit={() => {
                    setButtonClicked(!buttonClick);
                }}>
                    <h3>Enter the no of data to be generated : </h3><br></br>
                    <input type={"text"} name="id" onChange={handleChange} >
                    </input>
                    <br />
                    <br />
                    <Button style={{ paddingLeft: "50px", paddingRight: "50px" }} color="primary" onClick={() => {
                        setButtonClicked(!buttonClick);
                    }}>Generate</Button>
                </form>
            </div>
            <div className="allstudents">
                {
                    Alldata.map((data, index = data.vin) => {
                        return (
                            <div className="box" key={index}>
                                <DataCard className="box" key={index} data={data} />
                             </div>
                        );
                    })
                }
                <footer>
                    Created by &copy; Kushan Krishna
                </footer>
            </div>
        </div>
    )
}
export default Landing;