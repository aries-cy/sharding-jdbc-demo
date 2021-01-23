package com.sharding.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author cy
 */
@Data
@Entity
@Table(name = "t_order")
public class OrderEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    private Integer userId;

    private Integer status = 1;
}
