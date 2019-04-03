package com.yinhai.entity;

import lombok.Data;

/**
 * @description:
 * @author: Mr.Li
 * @create: 2019-04-01 21:25
 **/
public @Data
class Apple {
    private int id;
    private String colour;
    private String weight;
    private String type;

    public Apple() {}

    public Apple(int id, String colour, String weight, String type) {
        this.id = id;
        this.colour = colour;
        this.weight = weight;
        this.type = type;
    }
}
