package com.example.Parcial.controller;

import com.example.Parcial.model.ADN;
import com.example.Parcial.service.ADNService;
import com.example.Parcial.service.MutantService;
import com.example.Parcial.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/adn")
public class ADNController {
    /*
	CORAZZA MARÍA CECILIA
	LEGAJO 50230
	COMISIÓN 3K10
	AÑO 2024

	NOTA: El código está completamente comentado para explicar su ejecución adecuadamente.
	 */

    @Autowired
    private ADNService adnService;

    @Autowired
    private StatsService statsService;

    @Autowired
    private MutantService mutantService;

    @PostMapping("/")
    public ResponseEntity<Void> isMutant(@RequestBody String[] dna) {
        if (mutantService.isMutant(dna)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping
    public ADN createADN(ADN adn){
        return adnService.createADN(adn);
    }

    @GetMapping
    public List<ADN> getAllADNs(){
        return adnService.getAllADNs();
    }

    @GetMapping("{id}")
    public ADN searchADNById(@PathVariable Long id){
        return adnService.getADNById(id);
    }

    @DeleteMapping("{id}")
    public void deleteADNById(@PathVariable Long id){
        adnService.deleteADNById(id);
    }


}
