package org.example;

public class Main {
    public static void main(String[] args) {

        // Task one
        int bottle = 0;
        int salary = 15000;
        int goal = 2_459_000;
        int months = 0;
        while (bottle < goal) {
            months++;
            bottle = bottle + salary;
            bottle = bottle + bottle / 100;
        }
        System.out.println("Месяц " + months + ", сумма накоплений равна " + bottle + " рублей");

        // Task two
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; ) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        // Task three
        int populationY = 12_000_000;
        int birthsPerOneThousandCityzens = 17;
        int deathsPerOneThousandCityzens = 8;
        int birthsThisYear;
        int deathsThisYear;
        for (int j = 1; j <= 10; j++) {
            birthsThisYear = populationY / 1000 * birthsPerOneThousandCityzens;
            deathsThisYear = populationY / 1000 * deathsPerOneThousandCityzens;
            populationY = populationY + birthsThisYear - deathsThisYear;
            System.out.println("Год " + j + ", численность населения составляет " + populationY);
        }

        // Task four
        double percent = 0.07;
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
        int halfYear = 6;
        while (deposite < goal) {
            month++;
            deposite = deposite + (deposite * percent);
            if (month % halfYear == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений: " + (int) deposite);
            }
        }

        // Task six
        deposite = 15000;
        month = 0;
        int monthsPerYear = 12;
        int totalAmountOfYear = 9;
        int distance = monthsPerYear * totalAmountOfYear;

        while (month < distance) {
            month++;
            deposite = deposite + (deposite * percent);
            if (month % halfYear == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений: " + (int) deposite);
            }
        }

        // Task seven
        int friday = 0;
        int dayOfMonth = friday;
        int daysInMonth = 30;
        int amountOfDaysInWeek = 7;
        while (dayOfMonth <= daysInMonth) {
            if (dayOfMonth % amountOfDaysInWeek == friday || dayOfMonth % amountOfDaysInWeek == 0 && friday == amountOfDaysInWeek) {
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет");
            }
            dayOfMonth += 7;
        }

        // Task eight
        int currentYear = 2024;
        int start = currentYear - 200;
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