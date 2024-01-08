package com.example.demoproduct.service;

import com.example.demoproduct.postgres.PProduct;

import java.util.List;

public interface IPostgresService {
    List<PProduct> findAll();

    List<PProduct> saveAll(List<PProduct> pProducts);
}
