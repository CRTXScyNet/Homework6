package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Task two
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Task three
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Task four
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Task five
        for (int year = 1904; year < 2096; year = year + 4) {
            System.out.println(year);
        }

        // Task six
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Task seven
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Task eight
        int bottle = 0;
        int salary = 29000;
        for (int i = 0; i < 12; i++) {
            bottle = bottle + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bottle + " рублей");
        }

        // Task nine
        bottle = 0;
        for (int i = 0; i < 12; i++) {
            bottle = bottle + bottle/100;
            bottle = bottle + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bottle + " рублей");
        }

        //Task ten
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2*i));
        }
    }
}