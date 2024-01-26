import React from "react";
import { Card, CardBody, CardTitle, CardText, CardSubtitle } from "reactstrap";
import Dealercard from "./Dealercard";
import Featurescard from "./Featurescard";
import Ownershipcard from "./Ownershipcard";
import Servicecard from "./Servicecard";
import Warrantycard from "./Warrantycard";


const DataCard = ({ data }) => {
    return (
        <Card className="data-card">
            <CardBody className="card-body">
                <CardText>
                    <b>VIN:</b> {data.vin}<br></br>
                    <b>Registration Number:</b> {data.vehicleRegistrationNumber} <br></br>
                    <b>Registration Date:</b> {data.vehicleRegistrationDate}<br></br>
                    <b>Engine Number:</b> {data.engineNumber}<br></br>
                    <b>Brand:</b> {data.brand}<br></br>
                    <b>Model:</b> {data.model}<br></br>
                    <b>Price:</b> {data.price}<br></br>
                    <b>Type:</b> {data.vehicleType}<br></br>
                    <b>Year of vehicle:</b> {data.yearOfTheVehicle}<br></br>
                    <b>Vehicle Condition:</b> {data.vehicleCondition}<br></br>
                    <b>Status:</b> {data.status}<br></br>
              
                <br></br>
                <b>Service History:</b><br></br>
                <Servicecard ser={data.serviceHistory} />

                <br></br>

                <b>Ownership History:</b><br></br>
                <Ownershipcard own={data.ownershipHistory} />

                <br></br>

                <b>Warranty Information:</b><br></br>
                <Warrantycard war={data.warrantyInformation} />

                <br></br>

                <b>Dealer Information:</b><br></br>
                <Dealercard deal={data.sellingDealer} />

                <br></br>

                <b>Features and Options:</b><br></br>
                <Featurescard fao={data.featuresAndOptions} />
                </CardText>
            </CardBody>
        </Card>
    );


}
export default DataCard;