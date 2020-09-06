package ru.geekbrains.java_one_ht1;

public class hometask1 {

    public static void main(String[] args) {
        //входные параметры, аргументы
        int p1 = 4;
        int p2 = 8;
        int p3 = 25;
        int p4 = 1;
        String name="Дмитрий";
        int year = 2023;
        first(p1, p2, p3, p4);
        second(p1, p2);
        third(p1);
        fourth(name);
        fifth(year);

    }

    private static double first(int a, int b, int c, int d) {
        double answer = a * (b + (c / d));
        return answer;

    }


    private static boolean second(int a, int b) {
        int sum = a + b;
        boolean result;
        if (sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    private static void third (int a)
    {
        if(a>=0)
        {
            System.out.println("Положительное число");
        }
        else System.out.println("Отрицательное");

    }

    private static String fourth(String yourname) {
        String hello = ("Привет," + yourname);
        System.out.println(hello);
        return hello;

    }

    private static void fifth(int y)
    {
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0) ) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }
}
