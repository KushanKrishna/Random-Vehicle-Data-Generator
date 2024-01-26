import React, { useState } from "react";
import { Card, CardBody, CardSubtitle, CardText } from "reactstrap";

const Servicecard = ({ ser }) => {

    return (
            <Card >
                <CardBody className="service-card">
                    <CardText>
                            {ser.map((s, index = ser.serviceDescription) => {
                                return (
                                    <span key={index}>
                                    <br></br>
                                    <b>Service description:</b> { s.serviceDescription } <br></br>
                                    <b>Service date:</b> { s.serviceDate } <br></br>
                                    <br></br>
                                    </span>
                                );
                            })}  
                    </CardText>
                </CardBody>
            </Card>
       );

}
export default Servicecard;
