package com.company.lesson5;

public class Main {
    public static final int AGE = 40;

    public static void main(String[] args) {
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 30000, 30);
        workerArray[1] = new Worker("Suvorov Ivan", "Manager", "suvivan@mailbox.com", "892312312", 35000, 55);
        workerArray[2] = new Worker("Kuznetsov Ivan", "Clean master", "kuzivan@mailbox.com", "892312313", 40000, 41);
        workerArray[3] = new Worker("Pushkin Ivan", "Teacher", "pushivan@mailbox.com", "892312314", 45000, 35);
        workerArray[4] = new Worker("Petrov Ivan", "Baker", "petivan@mailbox.com", "892312315", 50000, 42);

        for (Worker worker : workerArray) {
            if (worker.age > AGE) {
                System.out.println(worker);

            }

        }

    }

}
