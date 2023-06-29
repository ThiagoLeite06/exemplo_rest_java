package com.thiagoleite.apitest.models;

public class ImcResponse {
    private double imc;

    public ImcResponse(double imc) {
        this.imc = imc;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
