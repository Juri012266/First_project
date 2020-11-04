// TODO tagasta sisestatud String s tagurpidi
// Näiteks
// Sisend = "Tere" / Väljund = "ereT"

package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        String reverse = "";


        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }

}
