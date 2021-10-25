package com.jxd.spring5;

/**
 * @author jxd
 * @date 2021/10/25 8:45
 */
public class Teacher {
    private String name;
    private Integer age;
    private String address;
    private Car car;
    private IdCard idCard;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Teacher(String name, Integer age, String address, Car car) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
}
