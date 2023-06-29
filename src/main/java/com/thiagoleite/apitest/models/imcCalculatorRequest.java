package com.thiagoleite.apitest.models;

import lombok.Data;

@Data
public class imcCalculatorRequest {

    private Double height;

    private Double weight;

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

}
