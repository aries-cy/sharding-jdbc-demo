package com.cy.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author cy
 */
@Data
@Entity
@Table(name = "t_order_0")
public class OrderEntity implements Serializable {

    @Id
    private String orderId;

    private Integer userId;

    private Integer status = 1;
}
