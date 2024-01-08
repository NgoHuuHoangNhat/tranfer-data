package com.example.demoproduct.oracle;

import com.example.demoproduct.postgres.PProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "products")
public class OProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Float price;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    public PProduct toPProduct(){
       return PProduct.builder()
                .id(this.id)
                .name(this.name)
                .price(this.price)
                .quantity(this.quantity)
                .createdBy(this.createdBy)
                .updatedBy(this.updatedBy)
                .createdAt(this.createdAt)
                .updatedAt(this.updatedAt)
                .isDeleted(this.isDeleted)
                .build();
    }
}
