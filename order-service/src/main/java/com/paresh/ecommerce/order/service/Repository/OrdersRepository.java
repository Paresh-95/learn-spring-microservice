package com.paresh.ecommerce.order.service.Repository;

import com.paresh.ecommerce.order.service.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
