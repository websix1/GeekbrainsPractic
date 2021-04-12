package com.company.lesson6;

public class Cat extends Animal {

    protected boolean sweem;
    int run;

    public Cat(String name, int run, boolean sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }

    public void catInfo() {
        System.out.println("Имя кота: " + name + " Пробежал: " + run+ " метров" + " Проплыл: " + sweem);
    }
}
