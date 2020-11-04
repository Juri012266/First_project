package com.company;

import java.util.Scanner;

public class Test3 {

    // TODO loe konsoolist sisse 10 täisarvu

    //skannerit kasutatakse siis, kui konsoolil on midagi sisestatud ja on vaja kontrollida, mis täpselt sisestati.


    public static void main(String[] args) {

        System.out.println("Leht_Test3" + "\n"); //Prindime testi mini


        Scanner input = new Scanner(System.in); // Määra scanner
        System.out.println("Sisesta massivi suurus: "); // Toome ekraanile lause    Siseta massivi suurus:
        int size = input.nextInt(); // Sisestame konsoolil massiivi suurust
        int[] myMassive = new int[size]; // Loome massiv "int" nimega "myMassive" ja suurusega "size"
        System.out.println("Sisesta massivi elemendid:");// Toome ekraanile lause    Siseta massivi elemendid:

        /*Täidame massivi*/
        for (int i = 0; i < size; i++) {
            myMassive[i] = input.nextInt(); // Sisestame masiiivi elemendid klaviaturilt - Number + Enter
        }
        System.out.print("Sisestatud massivi elemendid:");//Toome ekraanile lause    Sisetayud massivi elemendid:
        for (int i = 0; i < size; i++) {
            System.out.print(" " + myMassive[i]); // Toome ekraanile loodud massiv
        }
        System.out.println();

// TODO trüki varem sisestatud arvud välja vastupidises järiekorras
        System.out.print("Rida vastupidises järjestuses:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" " + myMassive[i]);
        }
    }
}

