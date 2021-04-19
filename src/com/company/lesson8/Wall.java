package com.company.lesson8;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " высота: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Успешно преодолен");

            return true;
        } else {
            System.out.println("Не преодолен");

            return false;
        }
    }
}
