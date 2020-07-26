package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Haushalte;
import com.oguij.springbootneo4j.model.Population;
import org.springframework.data.repository.CrudRepository;

public interface HaushalteRepository extends CrudRepository<Haushalte, String> {
    Haushalte findByPosition(String name);
    Haushalte findbyAuspraegungText(String Auspraegung_Text);
}
