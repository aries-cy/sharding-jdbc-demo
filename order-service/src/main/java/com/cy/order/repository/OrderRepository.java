package com.cy.order.repository;


import com.cy.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author cy
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
