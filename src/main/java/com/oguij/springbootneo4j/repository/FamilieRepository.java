package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Familie;
import com.oguij.springbootneo4j.model.Population;
import org.springframework.data.repository.CrudRepository;

public interface FamilieRepository extends CrudRepository<Familie, String> {
    Familie findByPosition(String Gitter_ID_100m);
    Familie findbyAuspraegungText(String Auspraegung_Text);
}
