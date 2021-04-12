package com.company.lesson5;

import java.util.SplittableRandom;

public class Worker {
    String name;
    String position;
    String mail;
    String phone;
    int salary;
    int age;

    public Worker(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, mail, phone, salary, age);
    }
}
