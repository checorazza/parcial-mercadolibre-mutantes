package com.example.Parcial.repository;

import com.example.Parcial.model.ADN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ADNRepository extends JpaRepository<ADN, Long> {
    /*
	CORAZZA MARÍA CECILIA
	LEGAJO 50230
	COMISIÓN 3K10
	AÑO 2024
	 */
    long countByEsMutante(boolean isMutant);
}
