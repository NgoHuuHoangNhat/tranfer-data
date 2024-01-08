package com.example.demoproduct.controller;

import com.example.demoproduct.oracle.OProduct;
import com.example.demoproduct.service.IOracleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/oracle")
@RequiredArgsConstructor
public class OracleController {
    private final IOracleService oracleService;
    @GetMapping("/find-all")
    public ResponseEntity<?> findAll(){
        List<OProduct> oProducts = oracleService.findAll();
        if(oProducts.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(oProducts);
    }
    @GetMapping("transfer-data")
    public ResponseEntity<?> transferData(){
        /**
         * -------------------------------------FIRST OPTION----------------------------------
         * Use stream(), method toPProduct of OProduct, saveAll() of Jpa for migration 1000 record
         * duration: 0,58 seconds

         * long startTime = System.nanoTime();
         * boolean transferSuccess = oracleService.transferDataFromOracleToPostgresUseStream();
         * long endTime = System.nanoTime();
         * long duration = (endTime - startTime) / 1_000_000; // Thời gian chạy phương thức tính bằng milliseconds
         * System.out.println("*****************************************************************");
         * System.out.println("Thời gian chạy của phương thức là: " + duration + " milliseconds");
         * System.out.println("*****************************************************************");
         * if(transferSuccess) return ResponseEntity.ok("success");
         * return ResponseEntity.internalServerError().body("failed");
         */

        /**
         * -------------------------------------SECOND OPTION----------------------------------
         */



        return ResponseEntity.internalServerError().body("failed");
    }
}
