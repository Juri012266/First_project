package com.company;

import java.util.Scanner;

public class ClosestTo_dist {
/*
// int[] test = {2, 5, 6, 7, 8, 9};
// closestTo(4, test);
// TODO tagasta listist arv mis on kõige lähem numbrile nr
public static int closestTo(int nr, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
      // TODO 2 | trükkge välja kõigi elementide kohta kui kaugel nad on nr

        // TODO 2 | trükkge välja kõigi elementide kohta kui kaugel nad on nr


        // TODO 3 | salvestage miinimum number muutujasse
        }
        return 0;

 */

    public static void main(String[] args) {
        System.out.println("Leht_Test4_ClosetTo" + "\n"); //Prindime testi mini
        int[] test = {2, 5, 6, 7, 8, 9}; //määrame massivi
        closestTo(4,test);

    }

    public static void closestTo(int nr, int[] test) {
        int dist = Math.abs(test[0] - nr); //leiame iga numbri kaugust nubrist "nr"
        System.out.println(dist);
        int smallestElement = 0;
        for (int i = 1; i < test.length; i++) {
            int closestdist = Math.abs(test[i] - nr);

            if (closestdist < dist) {
                dist = closestdist;
                smallestElement = i;
            }
        }
        System.out.println(smallestElement);
        System.out.println(dist);
    }
}











