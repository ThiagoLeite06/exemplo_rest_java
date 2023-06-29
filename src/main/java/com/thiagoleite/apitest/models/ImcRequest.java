package com.thiagoleite.apitest.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ImcRequest {

    @NotBlank(message = "Campo height deve ser preenchido.")
    private Integer height;

    @NotBlank(message = "Campo weight deve ser preenchido.")
    private Double weight;

}
