package com.company;

import java.util.Scanner;

public class SQUARE {
    //TODO all olev on näidis, loo uus klass selle ülesande jaoks
    // Loo uus klass ruut
    // ruudu kontstruktor peab vastu võtma x ja y kordinaadi ning külje pikkuse.
    // objektil peab olema meetod pindala, mis tagastab ruudu pindala

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Sisesta külje 1 pikkus: ");
        double num1 = in.nextDouble();
        System.out.println("Sisesta külje 2 pikkus: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);

        rec.viewResult();
    }
}

class Rectangle {
    public double side1, side2;


    public Rectangle() {
    }



    //Формула для нахождения площади
    public double areaCalculator(double num1, double num2) {
        side1 = (num1 * num2);
        return side1;
    }

    //Формула для нахождения периметра прямоугольника
    public double perimeterCalculator(double num1, double num2) {
        side2 = (num1 + num2) * 2;
        return side2;
    }

    public void viewResult() {
        System.out.println("Nelinurka pindala: " + side1);
        System.out.println("Nelnurka perimetr: " + side2);
    }

}