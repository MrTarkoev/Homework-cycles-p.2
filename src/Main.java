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
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание - 2 Задание 1, 2
        System.out.println("Циклы. Часть 2.  Домашнее задание - 2. Задание 1, 2");
        int initialAmount = 15000;   //Первоначальная сумма
        int month1 = 1;
        while (initialAmount < 12000000) {
            initialAmount += initialAmount * 0.07;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений составит " + initialAmount);
            }
            month1++;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание - 2 Задание 3
        System.out.println("Циклы. Часть 2.  Домашнее задание - 2. Задание 3");
        int initialAmount1 = 15_000;
        for (month1 = 1; month1 <= 9 * 12; ) {
            initialAmount1 += initialAmount1 * 0.07;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений составит " + initialAmount1);
            }
            month1++;
        }
        System.out.println();
        // Циклы. Часть 2.  Домашнее задание - 2 Задание 4
        System.out.println("Циклы. Часть 2.  Домашнее задание - 2. Задание 4");
        int friday = 1;
        int month3 = 31;
        while (friday <= month3) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }
}