package com.thiagoleite.apitest.controllers;

import com.thiagoleite.apitest.models.ImcRequest;
import com.thiagoleite.apitest.models.ImcResponse;
import com.thiagoleite.apitest.services.ImcService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImcController {

    @Autowired
    private ImcService imcService;

    @PostMapping("/calculate-imc")
    public ResponseEntity<ImcResponse> calculateIMC(@Valid @RequestBody ImcRequest request) {
        return imcService.CalculateImc(request);
    }
}
