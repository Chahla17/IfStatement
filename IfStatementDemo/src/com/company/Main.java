package com.company;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d;

        a = 4;
        b = 6;

        System.out.println("a равно 4, b равно 6");
        if (a < b) System.out.println("a меньше b");
        if (a > b) System.out.println("этот текст вы никогда не увидите");

        System.out.println("");
        c = a - b;
        System.out.println("c равно -2");
        if (c >= 0) System.out.println("c имеет положительное значение ");
        if (c < 0) System.out.println("c имеет отрицательное значение ");

        System.out.println("");
        d = b - a;
        System.out.println("d равно 2");
        if (d >= 0) System.out.println("d имеет положительное значение ");
        if (d < 0) System.out.println("d имеет отрицательное значение ");

        System.out.println("");
        if (a + c != b) System.out.println("a плюс c не ровняется b ");
        if (a + d == b) System.out.println("a плюс d ровняется b ");
    }
}
