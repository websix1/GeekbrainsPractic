package com.company.lesson4;


import java.util.Random;
import java.util.Scanner;


public class Main {
    public static char [][] map;
    public static final int SIZE = 6;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
        if (checkWin(DOT_X)) {
            System.out.println("Победил человек");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
        aiTurn();
        printMap();
        if (checkWin(DOT_O)) {
            System.out.println("Победил Искуственный Интеллект");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
    }
    System.out.println("Игра закончена");

        sc.close();

    }

    public static boolean checkWin(char symb) {
        for (int col = 0; col < SIZE - DOTS_TO_WIN + 1; col++) {
            for (int row = 0; row < SIZE - DOTS_TO_WIN + 1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }

    // Проверяем диагонали

    public static boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            toright &= (map[i + offsetX][i + offsetY] == symb);
            toleft &= (map[DOTS_TO_WIN - i - 1 + offsetX][i + offsetY] == symb);
        }

        if (toright || toleft) return true;

        return false;
    }

    // Проверяем горизонтали и вертикали

    public static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col = offsetX; col < DOTS_TO_WIN + offsetX; col++) {
            cols = true;
            rows = true;
            for (int row = offsetY; row < DOTS_TO_WIN + offsetY; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }

            if (cols || rows) return true;
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isNotCellValid(x, y));

        System.out.println("Компьютер сделал ход" + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isNotCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static boolean isNotCellValid(int x, int y) {
        if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
            return map[y][x] != DOT_EMPTY;
        } else {
            return true;
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

