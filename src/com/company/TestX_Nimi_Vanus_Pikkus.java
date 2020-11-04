package com.company;

import java.util.Scanner;

public class TestX_Nimi_Vanus_Pikkus {
    public static void main(String[] args) {
        System.out.println("Leht TestX_Nimi_Vanus_Pikkus" + "\n"); //Prindime testi mini

        Scanner in = new Scanner(System.in);
        System.out.print("Sisesta nimi: ");
        String name = in.nextLine();
        System.out.print("Sisesta vanus: ");
        int age = in.nextInt();
        System.out.print("Sisesta pikkus: ");
        float height = in.nextFloat();
        System.out.printf("Nimi: %s;  Vanus: %d;  Pikkus: %.2f \n", name, age, height);
        in.close();
    }

}


