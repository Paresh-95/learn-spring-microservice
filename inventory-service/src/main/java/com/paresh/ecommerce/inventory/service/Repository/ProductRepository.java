package com.paresh.ecommerce.inventory.service.Repository;

import com.paresh.ecommerce.inventory.service.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
