package com.example.demoproduct.service;

import com.example.demoproduct.oracle.OProduct;
import com.example.demoproduct.oracle.OracleRepository;
import com.example.demoproduct.postgres.PProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OracleService implements IOracleService {
    private final OracleRepository oracleRepository;
    private final IPostgresService postgresService;
    @Override
    public List<OProduct> findAll() {
        return oracleRepository.findAll();
    }

    @Override
    public boolean transferDataFromOracleToPostgresUseStream() {
        List<OProduct> oProducts = findAll();
        List<PProduct> pProducts = oProducts.stream()
                .map(OProduct::toPProduct)
                .collect(Collectors.toList());
        boolean saveSuccess = postgresService.saveAll(pProducts).isEmpty();
        return !saveSuccess;
    }
}
