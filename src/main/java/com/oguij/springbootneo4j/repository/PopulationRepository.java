package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Population;
import com.oguij.springbootneo4j.model.Position;
import org.springframework.data.repository.CrudRepository;

public interface PopulationRepository extends CrudRepository<Population, String> {
    Population findbyPosition(String Gitter_ID_100m);
    Population findbyAuspraegungText(String Auspraegung_Text);

}
