package com.example.Parcial.controller;

import com.example.Parcial.model.ADN;
import com.example.Parcial.service.ADNService;
import com.example.Parcial.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mutant")
public class ADNController {
 

    @Autowired
    private ADNService adnService;

    public ADNController(ADNService adnService) {
        this.adnService = adnService;
    }

    @PostMapping
    public ResponseEntity<String> isMutant(@RequestBody String[] dna) {
        boolean isMutant = adnService.isMutant(dna);
        adnService.saveADN(String.join(",", dna), isMutant);
        if (isMutant) {
            return new ResponseEntity<>("Mutant", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Human", HttpStatus.FORBIDDEN);
        }
    }
}
