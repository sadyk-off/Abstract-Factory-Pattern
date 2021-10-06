package com.madikhan.concreteProduct;

import com.madikhan.product.Chassis;

public class CarChassis implements Chassis {
    @Override
    public String getChassisParts() {
        return "Chassis part of a car";
    }
}
