package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position, String> {
    Position findByPosition(String Gitter_ID_100m, String latitude, String longitude) ;

}
