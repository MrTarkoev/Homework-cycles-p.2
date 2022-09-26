public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2.  Домашнее задание - 1 Задание 1
        System.out.println("Циклы. Часть 2.  Домашнее задание - 1. Задание 1");
        int deposit = 15000;     // откладываем в месяц
        double accumulation = 0; //первоначально имеем
        int month = 0;           // месяцы
        while (accumulation < 2459000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей.");
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание - 1 Задание 2
        System.out.println("Циклы. Часть 2.  Домашнее задание - 1. Задание 2");
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n = n + 1;
        }
        System.out.println();

        for (int z = 10; z > 0; z--) {
            System.out.print(z + " ");
        }
        System.out.println();
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание - 1 Задание 3
        System.out.println("Циклы. Часть 2.  Домашнее задание - 1. Задание 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int i = 1; i <= 10; i++) {
            population += population * (birthRate - deathRate) / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + Math.round(population));
        }
    }
}