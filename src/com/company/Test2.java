package com.company;

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {
        System.out.println("Leht_Test2" + "\n"); //Prindime testi mini


        Scanner input = new Scanner(System.in); // Määra scanner

        int[] myMassive = new int[4]; // loo 4 elemendiga massiv nimega myMassiv

        System.out.println(myMassive.length); // trükib konsoolile massivi suurust, ehk elem. arv, mida massiv mahutab
        for (int i = 0; i < 4; i++) {
            myMassive[i] = input.nextInt(); // Sisestame masiiivi elemendid klaviaturilt - Number + Enter
        }
        System.out.print("Sisestatud massivi elemendid:");//Toome ekraanile lause    Sisetayud massivi elemendid:
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + myMassive[i]); // Toome ekraanile loodud massiv
        }
        System.out.println();
    }
}

