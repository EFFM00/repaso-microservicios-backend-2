package com.repaso.userservice.controller;

import com.repaso.userservice.service.CotisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotisation")
public class CotisationController {

    @Autowired
    private CotisationService cotisationService;

    @GetMapping
    public Double cotisation(@RequestParam(name = "from") Double from, @RequestParam(name = "to") Double to) {
        return cotisationService.cotisationCurrency();
    }

}
