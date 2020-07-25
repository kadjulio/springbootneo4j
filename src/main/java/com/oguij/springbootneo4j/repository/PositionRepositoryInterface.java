package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Population;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepositoryInterface extends CrudRepository<Population, String> {
    Population findByPosition (String Auspraegung_Text);
}
