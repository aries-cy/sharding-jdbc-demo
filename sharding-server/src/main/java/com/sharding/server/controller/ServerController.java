package com.sharding.server.controller;

import com.sharding.server.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author cy
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    @Resource
    private OrderService orderService;

    @GetMapping("/local")
    public String localTest(@RequestParam("userId") Integer userId){
        orderService.saveOrderAndScore(userId);
        return "OK";
    }


    @GetMapping("rpc")
    public String rpcTest(@RequestParam("userId") Integer userId){
        orderService.rpcSaveOrderAndScore(userId);
        return "OK";
    }


}
