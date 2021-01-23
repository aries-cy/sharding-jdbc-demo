package com.cy.order.controller;

import com.cy.order.entity.OrderEntity;
import com.cy.order.repository.OrderRepository;
import com.cy.order.service.ScoreClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cy
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private ScoreClient scoreClient;

    @PostMapping("saveOrder")
    public void saveOrder(@RequestBody OrderEntity orderEntity){
        orderRepository.save(orderEntity);
    }

}
