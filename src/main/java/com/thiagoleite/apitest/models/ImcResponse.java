package com.thiagoleite.apitest.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ImcResponse {
    private double imc;
}
