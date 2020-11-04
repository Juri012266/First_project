package com.company;

public class Sum_of_numbers {
    public static void main(String[] args) {
        System.out.print(sum(4));
    }

    public static int sum(int x) {

        int a = 0;
        int i;
        for (i = 1; i <= x; i++) {
            a += i;
        }


        return a;


    }
}