package com.thiagoleite.apitest.services;

import com.thiagoleite.apitest.models.ImcCalculatorResponse;
import com.thiagoleite.apitest.repositories.ImcCalculatorRepository;
import org.springframework.stereotype.Service;

@Service
public class ImcCalculatorService implements ImcCalculatorRepository {
    @Override
    public Double calculateIMC(Double weight, Double height) {
        Double imcResult = weight / (height * height);
        ImcCalculatorResponse imcCalculatorResponse = new ImcCalculatorResponse(imcResult);
        imcCalculatorResponse.setImc(imcResult);
        return imcCalculatorResponse.getImc();
    }
}
