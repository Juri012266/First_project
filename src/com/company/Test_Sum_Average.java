package com.company;

public class Test_Sum_Average {
    public static void main(String[] args) {

       int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        double avg;
        int sum = 0;
        int n = array1.length;

        for (int i = 0; i < array1.length; i++) {
           sum += array1[i];
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
            System.out.print("\n");
        }

        System.out.println("Сумма - " + sum);

        avg = (double) sum / n;

        System.out.println("Average - " + avg);

    }
}


