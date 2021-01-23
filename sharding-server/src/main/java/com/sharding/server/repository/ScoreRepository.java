package com.sharding.server.repository;


import com.sharding.server.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author cy
 */
public interface ScoreRepository extends JpaRepository<ScoreEntity, Long> {
}
