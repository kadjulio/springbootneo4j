package com.oguij.springbootneo4j.repository;


import org.springframework.data.repository.CrudRepository;

import javax.swing.text.Position;



public interface PositionRepository extends CrudRepository<Position, String> {
    Position findbyPosition(String gitter_id_100m, String latitude, String longitude);


    //@Query()
    //Collection<com.oguij.springbootneo4j.model.Position> findbyPosition();


}
