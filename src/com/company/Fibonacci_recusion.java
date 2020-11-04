package com.company;

public class Fibonacci_recusion {
    static int fib1=0,fib2=1,fib3=0;
    static void printFibonacci(int x){
        if(x>0){
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            System.out.print(" "+fib3);
            printFibonacci(x-1);
        }
    }
    public static void main(String args[]){
        int x=10;
        System.out.print("Fibonacci recursion method:" + " " );
        System.out.print(fib1+" "+fib2);//printing 0 and 1
        printFibonacci(x-2);//n-2 because 2 numbers are already printed
    }

}




