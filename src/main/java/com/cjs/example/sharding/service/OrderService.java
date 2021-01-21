package com.cjs.example.sharding.service;

import com.cjs.example.sharding.entity.OrderEntity;
import com.cjs.example.sharding.entity.ScoreEntity;
import com.cjs.example.sharding.repository.OrderRepository;
import com.cjs.example.sharding.repository.ScoreRepository;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Resource
    private ScoreRepository scoreRepository;

    public void save(OrderEntity entity) {
        orderRepository.save(entity);
    }

    public void getAll(){
        List<OrderEntity> all = orderRepository.findAll();
        System.out.println(all.size());
    }

    @Transactional(rollbackFor = Exception.class)
    @ShardingTransactionType(TransactionType.XA)
    public void saveOrderAndScore(Integer userId){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserId(userId);

        ScoreEntity scoreEntity = new ScoreEntity();
        scoreEntity.setUserId(userId);
        scoreEntity.setScore(userId%2);

        orderRepository.save(orderEntity);
        scoreRepository.save(scoreEntity);

    }

}
