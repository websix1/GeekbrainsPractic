package com.company.lesson7;

public class Plate {
    private int food;
    private int increaseRateOfFood; // сколько еды добавлять

    public Plate(int food, int increaseRateOfFood) {
        this.food = food;
        this.increaseRateOfFood = increaseRateOfFood;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getIncreaseRateOfFood() {
        return increaseRateOfFood;
    }

    public void setIncreaseRateOfFood(int increaseRateOfFood) {
        this.increaseRateOfFood = increaseRateOfFood;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("В миске сейчас: " + food + " единиц корма");
    }

    public boolean checkFood(int n) {
        return (food - n) >= 0;

    }

    public void increaseFood() {
        this.food += increaseRateOfFood;
        System.out.println("В миске недостаточно еды, добавим " + increaseRateOfFood + " единиц корма");
    }
}
