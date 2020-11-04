package com.company;

public class Fibonacci {
    public static void main(String[] args) {

        int fib1=0,fib2=1,fib3,i,count=10;
        System.out.print(fib1+" "+fib2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            fib3=fib1+fib2;
            System.out.print(" "+fib3);
            fib1=fib2;
            fib2=fib3;
        }

    }
}
