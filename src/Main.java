public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Интерация цикла" + i);
        }

        System.out.println("Задание2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация цикла" + i);
        }

        System.out.println("Задание3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четные числа" + i);
        }

        System.out.println("Задание4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание5");
        int year = 1904;
        for (year = 1904; year <= 2096; year += 4) {
            System.out.println(+year + "год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задание8");
        int total = 0;
        int sumTotal = 29000;
        for (int month = 1; month <= 12; month++) {
            total += sumTotal;
            System.out.println("«Месяц " + month + " сумма накоплений равна " + total + " рублей»");
        }
        System.out.println("Задание9");
        double total1 = 0;
        double percent = 1.01;
        int sumTotal1 = 29000;
        for (int month = 1; month <= 12; month++) {
            total1 = (total1 + sumTotal1) * percent;
            System.out.println("«Месяц " + month + " сумма накоплений равна " + total1 + " рублей»");
        }
        System.out.println("Задание10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + "=" + 2 * i);
        }


    }
}