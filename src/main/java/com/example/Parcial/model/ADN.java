package com.example.Parcial.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ADN")
@Getter
@Setter
public class ADN {
    /*
	CORAZZA MARÍA CECILIA
	LEGAJO 50230
	COMISIÓN 3K10
	AÑO 2024

	NOTA: El código está completamente comentado para explicar su ejecución adecuadamente.
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String secuencia; // la secuencia de ADN :)
    private boolean esMutante;
}
