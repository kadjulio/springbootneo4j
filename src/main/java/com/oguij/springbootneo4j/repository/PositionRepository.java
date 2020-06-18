package com.oguij.springbootneo4j.repository;

import com.oguij.springbootneo4j.model.Position;
import com.oguij.springbootneo4j.service.PositionService;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.config.Neo4jRepositoryConfigurationExtension;

import java.util.Collection;

public class PositionRepository extends Neo4jRepositoryConfigurationExtension {
    // returns the node with id equal to GitterID parameter
    @Query(value = "MATCH (position:Position) Return position")
    public static Collection<Position> getAllPositions() {
        return PositionService.getAll();

    }
}
