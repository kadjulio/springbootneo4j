package com.oguij.springbootneo4j.service;

import com.oguij.springbootneo4j.model.Position;
import com.oguij.springbootneo4j.repository.PositionRepository;

import java.util.Collection;

public class PositionService {
    private PositionRepository repository;

    public PositionService(PositionRepository repository) {
        this.repository = repository;
    }

    public static Collection<Position> getAll() {
        return PositionRepository.getAllPositions();
    }
}
