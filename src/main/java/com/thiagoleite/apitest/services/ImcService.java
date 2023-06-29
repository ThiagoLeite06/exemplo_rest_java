package com.thiagoleite.apitest.services;

import com.thiagoleite.apitest.models.ImcRequest;
import org.springframework.stereotype.Service;

@Service
public class ImcService {
    public Double CalculateImc(Double height, Double weight) {
      double imc = weight / (height * height);
      return imc;
    }


}
