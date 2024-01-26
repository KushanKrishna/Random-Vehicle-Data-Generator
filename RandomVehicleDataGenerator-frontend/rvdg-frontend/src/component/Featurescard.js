import React from "react";
import { Card, CardBody, CardText } from "reactstrap";

const Featurescard = ({ fao }) => {
    return (
        <Card className="features-card">
            <CardBody className="features-body">
                <CardText>
                    {
                        fao.map((feat, index) => {
                            return <p>{feat}</p> ;
                        }
                        )}
                </CardText>
            </CardBody>
        </Card>
    )
}
export default Featurescard;