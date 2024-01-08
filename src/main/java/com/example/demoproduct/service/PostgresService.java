package com.example.demoproduct.service;

import com.example.demoproduct.postgres.PProduct;
import com.example.demoproduct.postgres.PostgresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostgresService implements IPostgresService {
    private final PostgresRepository postgresRepository;
    @Override
    public List<PProduct> findAll() {
        return postgresRepository.findAll();
    }

    @Override
    public List<PProduct> saveAll(List<PProduct> pProducts) {
        return postgresRepository.saveAll(pProducts);
    }
}
