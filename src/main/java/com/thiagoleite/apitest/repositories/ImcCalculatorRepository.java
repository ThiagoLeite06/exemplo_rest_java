package com.thiagoleite.apitest.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ImcCalculatorRepository {
    Double calculateIMC(Double weight, Double height);
}
