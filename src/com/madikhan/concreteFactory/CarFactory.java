package com.madikhan.concreteFactory;

import com.madikhan.concreteProduct.CarBody;
import com.madikhan.concreteProduct.CarChassis;
import com.madikhan.concreteProduct.CarWindows;
import com.madikhan.factory.AbstractVehicleFactory;
import com.madikhan.product.Body;
import com.madikhan.product.Chassis;
import com.madikhan.product.Windows;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    public Body createBody() {
        return new CarBody();
    }

    @Override
    public Windows createWindows() {
        return new CarWindows();
    }

    @Override
    public Chassis createChassis() {
        return new CarChassis();
    }
}
