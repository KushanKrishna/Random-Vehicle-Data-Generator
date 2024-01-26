import React from "react";
import { Card, CardBody, CardText } from "reactstrap";

const Addresscard = ({add}) => {

    return (
        <Card >
            <CardBody className="address-card">
                <CardText>
                   <b>Building:</b> {add.building}<br></br>
                   <b>Street:</b> {add.street}<br></br>
                   <b>City:</b> {add.city}<br></br>
                   <b>State:</b> {add.state}<br></br>
                   <b>Pin:</b> {add.pin}<br></br>
                </CardText>
            </CardBody>
        </Card>
    );
}

export default Addresscard;