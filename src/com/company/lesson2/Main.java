package com.company.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        convertNumbers();
        System.out.println("\nЗадание 2:");
        fillArray();
        System.out.println("\nЗадание 3:");
        changeArray();
        System.out.println("\nЗадание 4:");
        fillDiagonal();
        System.out.println("\nЗадание 5:");
        findMinMax();
        System.out.println("\nЗадание 6:");
        isLeftEqualRight();
    }
    private static void convertNumbers() {
         int [] arr = {0, 1, 1, 0, 0, 1, 1, 0, 1, 1};
         for (int i = 0; i < arr.length; i++) {
             if (arr [i] == 0) {
             arr [i] = 1;
             } else {
             arr [i] = 0;
             }
             System.out.println(arr [i]);
         }
    } // Метод заменяющий 0 на 1, 1 на 0 и выводящий значения из массива в консоль.

    private static void fillArray() {
        int [] arr = new int [8];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr [i] = j;
            j += 2;
            System.out.println(arr [i]);
        }
    } // Метод заполняющий массив значениями 0,3,6,9,12,15,18,21

    private static void changeArray() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr [i]);
        }
    } // Метод умножающий числа меньше 6 в массиве на 2.

    private static void fillDiagonal() {
        int [][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) {
                    arr [i][j] = 1;
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
    } // Метод заполняющий диагональные элементы массива единицами.

    private static void findMinMax() {
        int [] arr = {45, 3, 43, 42, 4, 44, 65, 66, 99, 5};
        int valueMax = arr[0];
        int valueMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > valueMax) {
                valueMax = arr[i];
            }
            else if (arr[i] < valueMin) {
                valueMin = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + valueMin + "\nМаксимальное значение: " + valueMax);

    } // Метод находящий минимальное и максимальное значение в массиве.


    private static void isLeftEqualRight() {
        int [] arr = {1, 1, 0, 0, 0, 0, 0, 2};
        int arrSum = 0; // Сумма всех элементов в массиве
        int sumRight = 0; // Сумма правой части массива
        for (int num : arr) {
            arrSum += num;
        } // находим сумму всех элементов в массиве с помощью цикла foreach
        for (int i = 0; i < arr.length; i++) {
            sumRight += arr [i];
            if (sumRight == arrSum - sumRight) {
                System.out.println(true);
                break;
            }
        } // Вычитаем из суммы всего массива, сумму текущей правой части. Сравниваем и возвращаем значение true
    }

    // Задание 7 - не осилил.

}