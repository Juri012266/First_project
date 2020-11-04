package com.company;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Leht_Test1" + "\n"); //Prindime testi mini

        // prindi ekraanile massive myArray (x elemnedi; type: long).
        int[] myList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int - et tegu on täisarvudega; [] - näitab, et tegu on massiviga; myList - massivi nimi
        // = - massivile eraldatud mälumaht; {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10} - massivi pikkus ja iga elementdi arv)
// TODO prindi välja 10 täisarvu
        System.out.println("Task 1: Massive arvude print ekraanile");
        // Prindi massive ekraanile tsükliga "for".
        System.out.println("Massive myList elementide print ekraanile (meetod 1): ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + ", ");

        }
        // Massivi print ekraanile tsükliga "for" ja masiivi suurese määrrajaga "length".
        System.out.println("\nMassive myListe elementide print ekraanile (meetod 2): ");
        // meetod 2: "length" määrab massiivi pikkust lõpliku muutujana
        //sümbol "\n" näitab, et konsol näitab järgmine "println" uuel real
        for (long element : myList) {
            System.out.print(element + ", ");
        }

        {
            System.out.println("\nTask 2: Massivis olevad paaris ja paritu arvude print ekraanile");
            //sümbol "\n" näitab, et konsol näitab järgmine "println" uuel real
        }

        // Prindi ekraanile massivi paaris arvud.
        System.out.println("Massive myList paaris arvud: ");
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.print(myList[i] + ", ");
            }

        }

        // Prindi ekraanile massivi paartu arvud.
        System.out.println("\nMassive myList paaritu arvud: ");
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 != 0) {
                System.out.print(myList[i] + ", ");
            }
        }

    }


}

