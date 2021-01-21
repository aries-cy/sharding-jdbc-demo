package com.cjs.example.sharding.repository;

import com.cjs.example.sharding.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO 描述
 *
 * @author cy
 */
public interface ScoreRepository extends JpaRepository<ScoreEntity, Long> {
}
