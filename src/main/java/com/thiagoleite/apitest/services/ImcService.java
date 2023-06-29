package com.thiagoleite.apitest.services;

import com.thiagoleite.apitest.models.ImcRequest;
import com.thiagoleite.apitest.models.ImcResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ImcService {
    public ResponseEntity<ImcResponse> CalculateImc(ImcRequest imcRequest) {

        ImcResponse imcResponse = ImcResponse
                .builder()
                .imc(getIMC(imcRequest.getHeight(), imcRequest.getWeight()))
                .build();

        return new ResponseEntity<>(imcResponse, HttpStatus.OK);
    }

    private double getIMC(Integer weight, Double height){
        return weight / (height * height);
    }

}
