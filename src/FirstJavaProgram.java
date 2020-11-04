import java.util.Scanner;

public class FirstJavaProgram<numbers> {

    private static int[] numbers;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Min funktsioon.Sisesta 2 väärtust");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(min(a, b));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(abs(a));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(neg(a));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(isNumberEven(a));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(-abs(a));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(isNumberEven(a));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.print(max(a, b));

    }


    // leia 2 arvu miinimum väärtus
    // Näited:
    // min (3, 5) = 3
    // min (-3, 8) = -3
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // TODO: Leia arvu absoluutväärtus
    // Näited:
    // abs(3) = 3
    // abs(-5) = 5
    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }


    // TODO: Luua funktsioon, mis tagastab vastava arvu alati negatiivsena
    // Näited:
    // neg(0) = 0
    // neg(-1) = -1
    // neg(8) = -8
    public static int neg(int x) {
        return -abs(x);
            /*if (x > 0) {
                return (-x);
            } else {
                return (x);
            }*/
    }
    // TODO: Luua funktsioon, mis

    // Juhul kui a on paaris arv, siis jaga sisend 2
    // Juhul kui a on paaritu arv, siis korruta sisend 3 ja liida 1
    public static int seq3n(int a) {
        if (isNumberEven(a)) {
            return a / 2;
        } else {
            return (a * 3 + 1);
        }
        /*if (a % 2 == 0) {
            return (a / 2);
        } else {
            return (a * 3 + 1);
        }*/
    }

    // TODO: Luua funktsioon, mis tagastab kas a on paaris arv
    // Näited
    // isNumberEven(4) = true
    // isNumberEven(1) = false
    public static boolean isNumberEven(int a) {
        return a % 2 == 0;
        /* või: if (a % 2 == 0) {

            return true;
        } else {
            return false;
        }*/
    }

    // TODO: Luua funktsioon mis leiab sisend muutujates numbri mis on kõige lähemal 0-ile
    // Näited
    // (-5, -2, 0) -> 0
    // (2, 3, 4) -> 2
    public static int closestToZero(int a, int b, int c) {
        if (abs(a) <= abs(b) && abs(a) <= abs(c)) {
            return a;
        } else if (abs(b) <= abs(a) && abs(b) <= abs(c)) {
            return b;
        } else {
            return c;
        }
    }

    //TODO tagasta maksimum väärtus
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else {
            return b;
        }

    }

    //TODO tagasta maksimum väärtus
    public static int max(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }

    }

    //TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b) {
        if (isNumberEven(a) && isNumberEven(b)) {
            return max(a, b);
        }
        else if (isNumberEven(a)) {
            return a;
        }
        else if (isNumberEven(b));{
            return b;
        }

    }

    //TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b, int c) {
        int tagastus  =  Integer.MIN_VALUE;
        if (isNumberEven(a) && a > tagastus) {
            tagastus = a;
        }
        if (isNumberEven(b) && b > tagastus) {
            tagastus = b;
        }
        if (isNumberEven(c) && c > tagastus) {
            tagastus = c;
        }
        if((isNumberEven(a) && (isNumberEven(b) && (isNumberEven(c))))) {
            tagastus = c;
        }
            tagastus = 0;
        return tagastus;
    }


    // int[] test = {2, 5, 6, 7, 8, 9};
    // closestTo(4, test);
    // TODO tagasta listist arv mis on kõige lähem numbrile nr
    public static void closestTo(int nr, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

        }
    }

    // TODO 1 / trükkige välja kõik numbers massivis olevad väärtused



    // TODO 2 / trükkige välja kõigi elementide kohta kui kaugel nad on nr


    // TODO 3 / salvestage miinimum number muutujasse


}











