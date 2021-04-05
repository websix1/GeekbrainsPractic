package com.company.lesson3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    public static final int TRY_COUNT = 3;
    public static final int NUMBERS_RANGE = 10;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Make a choice:\n"+
                    "1. Guess the Number\n2. Exit\n: ");
            if ("1".equals(sc.next())) {
                guessTheNumber();
            } else {
                return;
            }
        }
    }

    static void guessTheNumber() {
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(NUMBERS_RANGE);
            while (count < TRY_COUNT && guess != number) {
                System.out.print(
                        "Guess [" + (count + 1) + "] the number (0.." + (NUMBERS_RANGE - 1) + "): \n");
                try {
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("Your number is " + ((guess > number)?
                                "greater" : "less."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Input Mismatch Exception!");
                    sc.next();
                }
            }
            if (count == TRY_COUNT)
                System.out.println("You lost!");
            System.out.print("Repeat the game?\n[1 - yes / 0 - no]: ");
        } while (sc.next().equals("1"));
    }
}