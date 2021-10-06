package com.madikhan;

import com.madikhan.concreteFactory.CarFactory;
import com.madikhan.factory.AbstractVehicleFactory;
import com.madikhan.product.Body;
import com.madikhan.product.Chassis;
import com.madikhan.product.Windows;

public class Main {
    public static void main(String[] args) {
        AbstractVehicleFactory vehicleFactory = new CarFactory();

        Body carBody = vehicleFactory.createBody();
        Chassis carChassis = vehicleFactory.createChassis();
        Windows carWindows = vehicleFactory.createWindows();

    }
}
