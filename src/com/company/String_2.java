package com.company;

public class String_2 {
    public static void main(String[] args) {
        String a = "Tere";
        String b = new String("Tere");
        if (a == b) {
            System.out.println(1); //sulgudes määrame indeksid mida system pirndib ekraanile
        }
        if (a.equals(b)) {
            System.out.println(2);

        }
    }
}
