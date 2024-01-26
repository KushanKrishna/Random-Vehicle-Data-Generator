import React from "react";
import { Card, CardBody, CardText } from "reactstrap";

const Warrantycard =({war})=>{
    return(
        <Card >
            <CardBody className="warranty-card">
                <CardText>
                   <b>Start date:</b> {war.warrantyStartDate}<br></br>
                   <b>End date:</b> {war.warrantyEndDate}<br></br>
                   <b>Coverage:</b> {war.coverage}<br></br>
                   <b>Status:</b> {war.warrantyStatus}<br></br>
                </CardText>
            </CardBody>
        </Card>
    );
}
export default Warrantycard;