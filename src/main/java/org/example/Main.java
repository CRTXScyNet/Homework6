package org.example;

public class Main {
    public static void main(String[] args) {

        // Task one
        int bottle = 0;
        int salary = 15000;
        int goal = 2_459_000;
        int day = 0;
        while (bottle < goal) {
            day++;
            bottle = bottle + salary;
            bottle = bottle + bottle / 100;
        }
        System.out.println("Месяц " + day + ", сумма накоплений равна " + bottle + " рублей");

        // Task two
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        // Task three
        int populationY = 12_000_000;
        int births;
        int deaths;
        for (int j = 1; j <= 10; j++) {
            births = populationY / 1000 * 17;
            deaths = populationY / 1000 * 8;
            populationY = populationY + births - deaths;
            System.out.println("Год " + j + ", численность населения составляет " + populationY);
        }

        // Task four
        double percent = 0.07f;
        double deposite = 15000;
        goal = 12_000_000;
        int month = 0;
        while (deposite < goal) {
            month++;
            deposite = deposite + (deposite * percent);
            System.out.println("Месяц: " + month + ", сумма накоплений: " + (int) deposite);
        }

        //Task five
        deposite = 15000;
        month = 0;
        while (deposite < goal) {
            month++;
            deposite = deposite + (deposite * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений: " + (int) deposite);
            }
        }

        // Task six
        deposite = 15000;
        month = 0;
        int distance = 12 * 9;
        while (month < distance) {
            month++;
            deposite = deposite + (deposite * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений: " + (int) deposite);
            }
        }

        // Task seven
        int friday = 7;
        int dayOfMonth = 1;
        while (dayOfMonth <= 30) {
            if (dayOfMonth % 7 == friday || dayOfMonth % 7 == 0 && friday == 7) {
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет");
            }
            dayOfMonth++;
        }
        // Task eight
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int yearFromZero = 0;
        do {
            yearFromZero += period;
            if (yearFromZero > start) {
                System.out.println(yearFromZero);
            }
        } while (yearFromZero < currentYear);
    }
}