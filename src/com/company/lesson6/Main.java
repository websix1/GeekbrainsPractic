package com.company.lesson6;

public class Main {
    public static void main(String[] args) {

        Animal catAnimal = new Animal("Коты");
        Cat cat = new Cat("Мурзик", 200, false);
        catAnimal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal dogAnimal = new Animal("Собаки");
        Dog dog = new Dog("Тузик", 500, 10);
        dogAnimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
