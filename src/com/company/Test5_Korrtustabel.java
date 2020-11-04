package com.company;

public class Test5_Korrtustabel {

    /*
//TODO trüki välja korrutstabel mis on x ühikut lai ja y ühikut kõrge
//näiteks x = 3 y = 3
//väljund:
//1 2 3
//2 4 6
//3 6 9
private static void multiplyingTabel(int x, int y) {
        System.out.println("asd"); // paneb rea lõppu tühja rea
        System.out.print("asd"); // ei pane tühja rida
//}
*/
    public static void main(String[] args) {
        System.out.println("Leht_Test5_Korrututabel" + "\n"); //Prindime testi mini

        multiplyingTable(9, 9);
    }

    public static void multiplyingTable(int x, int y) {
        //System.out.println("asd"); // paneb rea lõppu tühja rea
        //System.out.p rint("asd"); // ei pane tühja rida
        for (int j = 1; j <= y; j++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}



