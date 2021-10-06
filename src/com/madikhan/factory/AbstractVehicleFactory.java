package com.madikhan.factory;


import com.madikhan.product.Body;
import com.madikhan.product.Chassis;
import com.madikhan.product.Windows;

public abstract class AbstractVehicleFactory {
    public abstract Body createBody();
    public abstract Windows createWindows();
    public abstract Chassis createChassis();
}
