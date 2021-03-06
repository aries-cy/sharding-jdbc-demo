package com.sharding.server.service;

import com.sharding.server.entity.ScoreEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author cy
 */
@FeignClient(value = "SCORE-SERVICE")
public interface ScoreClient {

    /**
     * 添加积分
     * @param scoreEntity score
     */
    @PostMapping("/score/saveScore")
    void saveScore(@RequestBody ScoreEntity scoreEntity);
}
