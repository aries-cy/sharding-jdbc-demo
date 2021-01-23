package com.cy.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author cy
 */
@Data
@Entity
@Table(name = "t_score_0")
public class ScoreEntity implements Serializable {

    @Id
    private String id;

    private Integer userId;

    private Integer score;
}
