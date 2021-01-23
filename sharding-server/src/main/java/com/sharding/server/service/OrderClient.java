package com.sharding.server.service;

import com.sharding.server.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author cy
 */
@FeignClient(value = "ORDER-SERVICE")
public interface OrderClient {

    /**
     * 添加订单
     * @param orderEntity oder
     */
    @PostMapping("/order/saveOrder")
    void saveOrder(@RequestBody OrderEntity orderEntity);
}
