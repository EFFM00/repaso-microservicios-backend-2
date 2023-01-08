package com.repaso.userservice.service;

import org.springframework.stereotype.Service;

import static java.lang.Integer.parseInt;

@Service
public class CotisationService {

    public Double cotisationCurrency() {

        Double num = Math.random();

        return num;
    }

}
