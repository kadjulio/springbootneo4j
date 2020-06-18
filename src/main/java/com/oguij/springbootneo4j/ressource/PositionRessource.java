package com.oguij.springbootneo4j.ressource;

import com.oguij.springbootneo4j.model.Position;
import com.oguij.springbootneo4j.service.PositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/position")
public class PositionRessource {
    private PositionRessource service;

    public PositionRessource() {
        this.service = service;
    }

    @GetMapping
    Collection<Position> getAll(){
        return PositionService.getAll();
    }
}
