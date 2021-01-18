package com.cjs.example.sharding.service;

import com.cjs.example.sharding.entity.OrderEntity;
import com.cjs.example.sharding.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ChengJianSheng
 * @date 2020-06-18
 */
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    public void save(OrderEntity entity) {
        orderRepository.save(entity);
    }

    public void getAll(){
        List<OrderEntity> all = orderRepository.findAll();
        System.out.println(all.size());
    }

}
