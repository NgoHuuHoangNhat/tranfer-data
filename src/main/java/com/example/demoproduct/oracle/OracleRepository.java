package com.example.demoproduct.oracle;

import com.example.demoproduct.postgres.PProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OracleRepository extends JpaRepository<OProduct,Long> {

}
