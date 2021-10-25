package com.jxd.spring5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jxd
 * @date 2021/10/25 9:15
 */
public class Student {
    private int[] score;
    private ArrayList<String> info;
    private Map<String, Integer> subjects;
    private List<Car> cars;

    public Student(int[] score, ArrayList<String> info, Map<String, Integer> subjects) {
        this.score = score;
        this.info = info;
        this.subjects = subjects;
    }

    public Student() {
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
