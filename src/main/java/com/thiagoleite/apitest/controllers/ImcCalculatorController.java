package com.thiagoleite.apitest.controllers;

import com.thiagoleite.apitest.models.imcCalculatorRequest;
import com.thiagoleite.apitest.services.ImcCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
public class ImcCalculatorController {
    @Autowired
    private ImcCalculatorService imcCalculateService;

    @PostMapping("/calculate-imc")
    public ResponseEntity<Object> calculateIMC(@Valid @RequestBody imcCalculatorRequest request) {
        Double weight = request.getWeight();
        Double height = request.getHeight();

        return ResponseEntity.status(HttpStatus.OK).body(imcCalculateService.calculateIMC(weight, height));

    }


}
