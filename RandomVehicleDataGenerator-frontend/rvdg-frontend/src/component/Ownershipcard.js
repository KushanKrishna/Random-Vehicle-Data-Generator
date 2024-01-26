import React from "react";
import { Card, CardBody, CardText } from "reactstrap";
import Addresscard from "./Addresscard";

const Ownershipcard = ({ own }) => {

    return (
        <Card className="ownership-card" >
            <CardBody className="ownership-body">
                <CardText>
                    {own.map((ow, index) => {
                        return (
                            <span key={index}>
                                <b>Owner name:</b> {ow.ownerName} <br></br>
                                <b>Purchse date:</b> {ow.purchaseDate} <br></br>
                                <b>Sale date:</b> {ow.saleDate} <br></br>
                                <b>Ownership duration:</b> {ow.ownershipDuration} <br></br>
                                <b>Owner Address:</b><br></br>
                                <br></br>
                                <Addresscard add={ow.ownerAddress} /><br></br>
                            </span>
                        );
                    })}
                </CardText>
            </CardBody>
        </Card>);
};
export default Ownershipcard;