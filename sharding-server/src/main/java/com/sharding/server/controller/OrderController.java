package com.sharding.server.controller;

import com.sharding.server.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO 描述
 *
 * @author cy
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/test")
    public String test(@RequestParam("userId") Integer userId){
        orderService.saveOrderAndScore(userId);
        return "OK";
    }

}
