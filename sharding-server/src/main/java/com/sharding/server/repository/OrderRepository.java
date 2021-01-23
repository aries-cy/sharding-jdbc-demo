package com.sharding.server.repository;


import com.sharding.server.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author cy
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
