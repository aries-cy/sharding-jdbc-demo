package com.cy.order.repository;


import com.cy.order.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author cy
 */
public interface ScoreRepository extends JpaRepository<ScoreEntity, Long> {
}
