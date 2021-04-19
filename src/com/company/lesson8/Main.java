package com.company.lesson8;

import java.util.Random;

public class Main {
    public static final int ROAD_DISTANCE_RANGE = 10;
    public static final int BARRIER_HEIGHT_RANGE = 10;
    public static final int NUMBER_OF_BARRIERS = 6;


    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(ROAD_DISTANCE_RANGE);
        int heigth = rand.nextInt(BARRIER_HEIGHT_RANGE);
        actions[0] = new Human("Андрей", distance, heigth);

        distance = rand.nextInt(ROAD_DISTANCE_RANGE);
        heigth = rand.nextInt(BARRIER_HEIGHT_RANGE);
        actions[1] = new Robot("Альфа300", distance, heigth);

        distance = rand.nextInt(ROAD_DISTANCE_RANGE);
        heigth = rand.nextInt(BARRIER_HEIGHT_RANGE);
        actions[2] = new Cat("Цезарь", distance, heigth);

        Barrier[] barriers = new Barrier[NUMBER_OF_BARRIERS];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(ROAD_DISTANCE_RANGE);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Беговая дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Барьер " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(actions[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успех!");
            } else {
                System.out.println("Не успешно!");
            }
        }
    }
}
