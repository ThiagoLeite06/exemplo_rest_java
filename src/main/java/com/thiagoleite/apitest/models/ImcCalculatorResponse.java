package com.thiagoleite.apitest.models;

import lombok.Data;

@Data
public class ImcCalculatorResponse {
    private Double imc;

    public ImcCalculatorResponse(Double imc) {
        this.imc = imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }
}
