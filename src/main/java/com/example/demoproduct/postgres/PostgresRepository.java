package com.example.demoproduct.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresRepository extends JpaRepository<PProduct,Long> {

}
