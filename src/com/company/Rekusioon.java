package com.company;

public class Rekusioon {
    public static void main(String[] args) {
        test(0);
    }

    private static void test(int nr) {
        if (nr < 10) {
            System.out.println(nr);
            test(nr + 1);
        }
    }
}

