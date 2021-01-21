package com.cjs.example.sharding.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * TODO 描述
 *
 * @author cy
 */
@Data
@Entity
@Table(name = "t_score")
public class ScoreEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Integer userId;

    private Integer score;
}
