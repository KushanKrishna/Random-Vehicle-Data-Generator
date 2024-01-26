import React from "react";
import { Card, CardBody,  CardText } from "reactstrap";
import Addresscard from "./Addresscard";

const Dealercard = ({deal})=>{
    return(
        <Card >
            <CardBody className="dealer-card">
                <CardText>
                    <b>Dealer Name:</b> {deal.dealerName}<br></br>
                    <b>GSTIN:</b> {deal.gstNo}<br></br>
                    <b>Dealer Address:</b><br></br>
                    <br></br>
                    <Addresscard add={deal.dealerAddress} />
                </CardText>
            </CardBody>

        </Card>
    )
}
export default Dealercard;