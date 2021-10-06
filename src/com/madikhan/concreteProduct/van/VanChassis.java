package com.madikhan.concreteProduct.van;

import com.madikhan.product.Chassis;

public class VanChassis implements Chassis {
    @Override
    public String getChassisParts() {
        return "Chassis parts for a van";
    }
}
