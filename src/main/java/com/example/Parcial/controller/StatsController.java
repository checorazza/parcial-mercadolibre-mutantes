package com.example.Parcial.controller;

import com.example.Parcial.model.Stats;
import com.example.Parcial.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {

     /*
	CORAZZA MARÍA CECILIA
	LEGAJO 50230
	COMISIÓN 3K10
	AÑO 2024

	NOTA: El código está completamente comentado para explicar su ejecución adecuadamente.
	 */

    //inyección de dependencia
    @Autowired
    private StatsService statsService;

    @GetMapping("/")
    public Stats getStats() {
        return statsService.getStats();
    }
}
