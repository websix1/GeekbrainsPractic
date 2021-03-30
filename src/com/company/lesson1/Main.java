package com.company.lesson1;

public class Main {
    public static void main(String[] args) {
        byte i = 22;
        short j = 12000;
        int k = 1000;
        long l = 2500000L;
        float m = 14.44f;
        double f = -233.233;
        char g = '*';
        boolean h = true;
        // примитивные типы данных
        String lesson = "Andrew is the best teacher";
        // ссылочный тип данных

        System.out.println(calculate(2.22f, 2.22f, 2.22f, 2.22f));
        System.out.println(isSum10And20True(5, 6));
        isPositiveOrNegative(20);
        System.out.println(isNegative(-22));
        System.out.println(makeGreetings("Андрей"));
        isYearLeap(2004);
        isYearLeap(1904);
        isYearLeap(2100);

    }
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
        // возвращение результата вычислений по заданной формуле
    }
    public static boolean isSum10And20True(int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
        //проверка суммы двух чисел
    }
    public static void isPositiveOrNegative(int number1) {
        if (number1 >= 0) {
            System.out.println("Число " + number1 + " положительное");
        }
        else {
            System.out.println("Число " + number1 + " отрицательное");
        }
        //определяем положительное ли число
    }
    public static boolean isNegative(int number2) {
        System.out.println("Число " + number2 + " отрицательное");
        return number2 < 0;
        // определяем отрицательное ли число
    }
    public static String makeGreetings(String name)   {
        return "Привет, " + name + "!";
        // приветствие по имени
    }
    public static void isYearLeap (int year) {
        if ((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
        // проверка високосный год или нет
    }
}