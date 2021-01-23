package com.cy.order.controller;

import com.cy.order.entity.ScoreEntity;
import com.cy.order.repository.ScoreRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cy
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Resource
    private ScoreRepository orderRepository;

    @PostMapping("saveScore")
    public void saveOrder(@RequestBody ScoreEntity scoreEntity){
        orderRepository.save(scoreEntity);
    }

}
