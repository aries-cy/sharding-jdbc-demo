package com.sharding.server.service;

import com.sharding.server.entity.OrderEntity;
import com.sharding.server.entity.ScoreEntity;
import com.sharding.server.repository.OrderRepository;
import com.sharding.server.repository.ScoreRepository;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

/**
 *
 * @author cy
 */
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private ScoreRepository scoreRepository;


    @Transactional(rollbackFor = Exception.class)
    @ShardingTransactionType(TransactionType.XA)
    public void saveOrderAndScore(Integer userId){
        //添加订单记录
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserId(userId);
        orderRepository.save(orderEntity);

        //添加积分记录
        ScoreEntity scoreEntity = new ScoreEntity();
        scoreEntity.setUserId(userId);
        //假设积分为  userId 取模 3
        scoreEntity.setScore(userId%3);
        scoreRepository.save(scoreEntity);

    }

}
