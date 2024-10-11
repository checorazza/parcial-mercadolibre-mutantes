package com.example.Parcial.service;

import com.example.Parcial.model.ADN;
import com.example.Parcial.repository.ADNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ADNService {
    /*
   CORAZZA MARÍA CECILIA
   LEGAJO 50230
   COMISIÓN 3K10
   AÑO 2024

   NOTA: El código está completamente comentado para explicar su ejecución adecuadamente.
    */

    //inyección de dependencias
    @Autowired
    private ADNRepository adnRepository;

    //métodos
    public ADN createADN(ADN adn){
        return adnRepository.save(adn);
    }

    public ADN getADNById(Long id){
        Optional<ADN> optionalADN = adnRepository.findById(id);
        return optionalADN.get();
    }

    public List<ADN> getAllADNs(){
        return adnRepository.findAll();
    }

    public void deleteADNById(Long id){
        adnRepository.deleteById(id);
    }
}
