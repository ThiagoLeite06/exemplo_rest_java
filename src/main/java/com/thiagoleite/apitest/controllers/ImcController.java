package com.thiagoleite.apitest.controllers;

import com.thiagoleite.apitest.models.ImcRequest;
import com.thiagoleite.apitest.models.ImcResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {
    @PostMapping("/calculate")
    public ResponseEntity<ImcResponse> calculateIMC(@RequestBody ImcRequest imcRequest) {

    }
}
