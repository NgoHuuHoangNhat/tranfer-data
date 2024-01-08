package com.example.demoproduct.controller;

import com.example.demoproduct.postgres.PProduct;
import com.example.demoproduct.service.IPostgresService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/postgres")
@RequiredArgsConstructor
public class PostgresController {
    private final IPostgresService postgresService;
    @GetMapping("/find-all")
    public ResponseEntity<?> findAllPProduct(){
        List<PProduct> pProducts = postgresService.findAll();
        if(pProducts.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(pProducts);
    }
}
