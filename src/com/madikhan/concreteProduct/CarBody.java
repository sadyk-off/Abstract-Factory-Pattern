package com.madikhan.concreteProduct;

import com.madikhan.product.Body;

public class CarBody implements Body {
    @Override
    public String getBodyParts() {
        return "Body shell parts of a car";
    }
}
