package com.cjs.example.sharding.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ChengJianSheng
 * @date 2020-06-18
 */
@Data
@Entity
@Table(name = "t_order")
public class OrderEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    private String userId;

    private Integer status = 1;
}
