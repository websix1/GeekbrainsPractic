package com.company.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Барсик", 150);
        cat[1] = new Cat("Цезарь", 100);
        cat[2] = new Cat("Мусик", 30);
        Plate plate = new Plate(200, 200);
        plate.info();

        for (Cat i : cat) {

            //если кот голоден
            if (i.getSatiety() == 0) {

                //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                if (!plate.checkFood(i.getAppetite())) {
                    plate.increaseFood();
                }

                //кот ест
                i.eat(plate);
                System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " едииниц корма");
            }

        }

        plate.info();
    }

}
