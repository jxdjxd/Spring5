package com.jxd.spring5;

/**
 * @author jxd
 * @date 2021/10/25 8:53
 */
public class Car {
    private String id;
    private String color;

    public Car(String id, String color) {
        this.id = id;
        this.color = color;
    }

    public Car(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
