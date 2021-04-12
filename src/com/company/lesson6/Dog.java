package com.company.lesson6;

public class Dog extends Animal {

    public int run;
    public int sweem;

    public Dog(String name, int run, int sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name  + " Пробежал: " + run + " метров" + " Проплыл: " + sweem +  " метров");
    }
}
