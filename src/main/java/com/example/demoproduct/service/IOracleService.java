package com.example.demoproduct.service;

import com.example.demoproduct.oracle.OProduct;

import java.util.List;

public interface IOracleService {
    List<OProduct> findAll();

    boolean transferDataFromOracleToPostgresUseStream();
}
