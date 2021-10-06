package com.madikhan.concreteProduct.van;

import com.madikhan.product.Body;

public class VanBody implements Body {
    @Override
    public String getBodyParts() {
        return "Body shell parts for a van";
    }
}
